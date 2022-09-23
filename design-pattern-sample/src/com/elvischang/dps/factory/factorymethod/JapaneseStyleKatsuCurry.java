package com.elvischang.dps.factory.factorymethod;

/**
 * @author elvischang
 * @create 2022-09-23-上午 12:49
 **/
public class JapaneseStyleKatsuCurry extends Curry{
    public JapaneseStyleKatsuCurry() {
        name = "Japanese Katsu Curry";
        region = "Japan";
        price = 400;
    }

    public void heat(){
        System.out.println("Fry the Katsu..");
    }
}
