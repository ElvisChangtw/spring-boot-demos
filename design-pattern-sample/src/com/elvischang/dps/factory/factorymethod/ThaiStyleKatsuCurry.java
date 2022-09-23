package com.elvischang.dps.factory.factorymethod;

/**
 * @author elvischang
 * @create 2022-09-23-上午 12:49
 **/
public class ThaiStyleKatsuCurry extends Curry{
    public ThaiStyleKatsuCurry() {
        name = "Thai Katsu Curry";
        region = "Thailand";
        price = 180;
    }

    public void heat(){
        System.out.println("Fry the Thai pork..");
    }
}
