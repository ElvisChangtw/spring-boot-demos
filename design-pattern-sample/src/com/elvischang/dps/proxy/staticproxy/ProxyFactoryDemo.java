package com.elvischang.dps.proxy.staticproxy;

/**
 * @author elvischang
 * @create 2022-09-24-下午 12:42
 **/
public class ProxyFactoryDemo {
    public static void main(String[] args) {
        CustomerProxy proxy = CustomerClassFactory.getProxy();

        proxy.printFullName();
        System.out.println(proxy.getInvocationCount());
    }
}
