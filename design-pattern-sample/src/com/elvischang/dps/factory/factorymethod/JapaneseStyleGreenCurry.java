package com.elvischang.dps.factory.factorymethod;

/**
 * @author elvischang
 * @create 2022-09-23-上午 12:49
 **/
public class JapaneseStyleGreenCurry extends Curry{
    public JapaneseStyleGreenCurry() {
        name = "Japanese Green Curry";
        region = "Japan";
        price = 50;
    }

    public void heat(){
        System.out.println("Boiled the soup..Japanese Style");
    }
}
