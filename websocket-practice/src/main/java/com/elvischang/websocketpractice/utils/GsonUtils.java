package com.elvischang.websocketpractice.utils;

import com.google.gson.Gson;

/**
 * @author elvischang
 * @create 2022-10-03-下午 08:37
 **/
public class GsonUtils {
    public static volatile Gson gson;

    public static Gson getGson() {
        if (gson == null) {
            synchronized (GsonUtils.class) {
                if (gson == null) {
                    gson = new Gson();
                }
            }
        }
        return gson;
    }
}
