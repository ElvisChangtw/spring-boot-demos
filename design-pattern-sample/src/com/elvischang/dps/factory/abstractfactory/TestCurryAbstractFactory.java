package com.elvischang.dps.factory.abstractfactory;

/**
 * @author elvischang
 * @create 2022-09-23-上午 01:02
 **/
public class TestCurryAbstractFactory {


    public static void main(String[] args) {

        CurryStore jpStore = new JapaneseCurryStore();
        CurryStore thStore = new ThaiCurryStore();

        Curry curry = jpStore.orderCurry("Tikka Masala");
        System.out.println("Saul ordered a " + curry.getName() + "\n");


        curry = thStore.orderCurry("Green Curry");
        System.out.println("Francesca ordered a " + curry.getName() + "\n");


    }

}
