package com.elvischang.dps.proxy.dynamicproxy;


/**
 * @author elvischang
 * @create 2022-09-24-下午 12:05
 **/
public class Customer implements ICustomer {

    private String firstName;
    private String lastName;

    public Customer(final String firstName, final String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

}
