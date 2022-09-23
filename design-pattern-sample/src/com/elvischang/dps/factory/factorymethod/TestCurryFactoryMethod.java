package com.elvischang.dps.factory.factorymethod;

import java.sql.SQLOutput;

/**
 * @author elvischang
 * @create 2022-09-23-上午 01:02
 **/
public class TestCurryFactoryMethod {


    public static void main(String[] args) {
        CurryStore jpStore = new JapaneseCurryStore();
        CurryStore thStore = new ThaiCurryStore();

        Curry curry = jpStore.orderCurry("Tikka Masala");
        System.out.println("Jesse got a " + curry.getName() + "\n");


        curry = thStore.orderCurry("Green Curry");
        System.out.println("Walter got a " + curry.getName() + "\n");


    }

}
