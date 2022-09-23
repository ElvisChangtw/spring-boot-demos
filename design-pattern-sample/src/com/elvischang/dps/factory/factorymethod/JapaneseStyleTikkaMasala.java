package com.elvischang.dps.factory.factorymethod;

/**
 * @author elvischang
 * @create 2022-09-23-上午 12:49
 **/
public class JapaneseStyleTikkaMasala extends Curry{
    public JapaneseStyleTikkaMasala() {
        name = "Japanese Tikka Masala";
        region = "Japan";
        price = 10;
    }

    public void heat(){
        System.out.println("never heard of this..");
    }
}
