package com.elvischang.dps.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author elvischang
 * @create 2022-09-24-下午 12:52
 **/
public class CustomerInvocationHandler implements InvocationHandler {

    private Object delegate;
    private int invocationCount;


    public int getInvocationCount() {
        return invocationCount;
    }

    public Object getProxyInstance(Object delegate) {
        this.delegate = delegate;
        return Proxy.newProxyInstance(
                delegate.getClass().getClassLoader(),
                delegate.getClass().getInterfaces(),
                this);
    }

    @Override
    public Object invoke(Object proxy, Method method,
                         Object[] args) throws Throwable {
        try {
            Object result = null;
            invocationCount++;

            System.out.println("method starts..." + method);
            result = method.invoke(delegate, args);
            System.out.println("method ends..." + method);

            return result;
        } catch (final InvocationTargetException ex) {
            throw ex.getTargetException();
        }
    }
}
