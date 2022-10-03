package com.elvischang.websocketpractice.websocket;

import com.elvischang.websocketpractice.utils.GsonUtils;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;

@Component
@ServerEndpoint(value = "/WebSocketServer/{usernick}")
public class WebSocketController {

    @OnOpen
    public void onOpen(@PathParam(value = "usernick") String userNick, Session session) {
        Gson gson = GsonUtils.getGson();
        String message = "有新成員[" + userNick + "]加入聊天室!";

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", "join");
        jsonObject.addProperty("name", userNick);
        jsonObject.addProperty("content", message);

        System.out.println(message);

        WebSocketUtil.addSession(userNick, session);
        WebSocketUtil.sendMessageForAll(gson.toJson(jsonObject));
    }

    @OnClose
    public void onClose(@PathParam(value = "usernick") String userNick, Session session) {

        Gson gson = GsonUtils.getGson();
        String message = "成員[" + userNick + "]退出聊天室!";

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", "leave");
        jsonObject.addProperty("name", userNick);
        jsonObject.addProperty("content", message);

        System.out.println(message);
        WebSocketUtil.remoteSession(userNick);
        WebSocketUtil.sendMessageForAll(message);
    }

    @OnMessage
    public void OnMessage(@PathParam(value = "usernick") String userNick, String message) {
        JsonObject json = GsonUtils.getGson().fromJson(message, JsonObject.class);
        String messageContent = json.get("content").getAsString();

        String info = "成員[" + userNick + "]：" + messageContent;
        Gson gson = GsonUtils.getGson();

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("type", "text");
        jsonObject.addProperty("name", userNick);
        jsonObject.addProperty("content", messageContent);

        System.out.println(info);
        WebSocketUtil.sendMessageForAll(GsonUtils.getGson().toJson(jsonObject));
    }

    @OnError
    public void onError(Session session, Throwable throwable) {
        System.out.println("錯誤:" + throwable);
        System.out.println(throwable.getMessage());
        try {
            session.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        throwable.printStackTrace();
    }

}
