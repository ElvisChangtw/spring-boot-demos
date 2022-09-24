package com.elvischang.dps.proxy.staticproxy;

/**
 * @author elvischang
 * @create 2022-09-24-下午 12:10
 **/
public class CustomerProxy implements ICustomer{

    private final Customer customer;
    private int invocationCount = 0;


    public CustomerProxy(final Customer customer) {
        this.customer = customer;
    }

    @Override
    public void printFullName() {
        invocationCount++;
        customer.printFullName();
    }

    public int getInvocationCount() {
        return invocationCount;
    }
}
