package com.elvischang.dps.factory.factorymethod;

/**
 * @author elvischang
 * @create 2022-09-23-上午 12:49
 **/
public class ThaiStyleTikkaMasala extends Curry{
    public ThaiStyleTikkaMasala() {
        name = "Thai Tikka Masala";
        region = "Thailand";
        price = 80;
    }

    public void heat(){
        System.out.println("heat it!");
    }
}
