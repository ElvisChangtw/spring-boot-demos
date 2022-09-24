package com.elvischang.dps.proxy.dynamicproxy;

/**
 * @author elvischang
 * @create 2022-09-24-下午 12:56
 **/
public class DemoDynamicProxy {

    public static void main(String[] args) {
        CustomerInvocationHandler handler = new CustomerInvocationHandler();

        ICustomer customerProxy =
                (ICustomer) handler.getProxyInstance(new Customer("Tuco", "Salamanca"));
        customerProxy.printFullName();
        System.out.println(handler.getInvocationCount());
        ICustomer customerProxy2 =
                (ICustomer) handler.getProxyInstance(new Customer("Tuco", "Salamanca"));
        customerProxy.printFullName();
        System.out.println(handler.getInvocationCount());


    }
}
