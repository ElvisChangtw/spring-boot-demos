package com.elvischang.dps.factory.factorymethod;

/**
 * @author elvischang
 * @create 2022-09-23-上午 12:49
 **/
public class ThaiStyleGreenCurry extends Curry{
    public ThaiStyleGreenCurry() {
        name = "Thai Green Curry";
        region = "Thailand";
        price = 260;
    }

    public void heat(){
        System.out.println("Boiled the soup..Thai style");
    }
}
