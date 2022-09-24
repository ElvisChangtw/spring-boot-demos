package com.elvischang.dps.proxy.staticproxy;

/**
 * @author elvischang
 * @create 2022-09-24-下午 12:40
 **/
public class CustomerClassFactory {
    public final static CustomerProxy getProxy(){
        Customer customer = new Customer("Shohra", "Afaque");

        return new CustomerProxy(customer);
    }

}
