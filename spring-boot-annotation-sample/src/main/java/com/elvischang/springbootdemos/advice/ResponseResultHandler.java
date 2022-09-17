package com.elvischang.springbootdemos.advice;

import com.elvischang.springbootdemos.annotation.ResponseResult;
import com.elvischang.springbootdemos.enums.ResponseCode;
import com.elvischang.springbootdemos.model.response.Response;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @author elvischang
 * @create 2022-09-17-下午 02:50
 **/

@ControllerAdvice
public class ResponseResultHandler implements ResponseBodyAdvice<Object> {

    public static final String RESPONSE_ANNOTATION = "RESPONSE_ANNOTATION";

    /**
     *
     * @param methodParameter
     * @param aClass
     * @return
     */
    @Override
    public boolean supports(MethodParameter methodParameter, Class<? extends HttpMessageConverter<?>> aClass) {
        ServletRequestAttributes ra = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest sr = (HttpServletRequest) ra.getRequest();
        ResponseResult responseResult = (ResponseResult) sr.getAttribute(RESPONSE_ANNOTATION);
        return responseResult == null ? false : true;
    }


    @Override
    public Object beforeBodyWrite(Object responseBody, MethodParameter methodParameter, MediaType mediaType, Class<? extends HttpMessageConverter<?>> aClass, ServerHttpRequest serverHttpRequest, ServerHttpResponse serverHttpResponse) {
        Response response;
        if (responseBody instanceof Boolean) {
            if ((Boolean) responseBody) {
                response = new Response(responseBody, ResponseCode.SUCCESS.code(), ResponseCode.SUCCESS.message());
            } else {
                response = new Response(responseBody, ResponseCode.ERROR.code(), ResponseCode.ERROR.message());
            }
        } else {
            if (null != responseBody) {
                response = new Response(responseBody, ResponseCode.SUCCESS.code(), ResponseCode.SUCCESS.message());
            } else {
                response = new Response(null, ResponseCode.ERROR.code(), ResponseCode.ERROR.message());
            }
        }
        return response;
    }

}
