package com.elvischang.dps.factory.simplefactory;

/**
 * @author elvischang
 * @create 2022-09-22-下午 11:56
 **/
public class TestSimpleCurryFactory {
    public static void main(String[] args) {
        SimpleCurryFactory factory = new SimpleCurryFactory();
        CurryStore store = new CurryStore(factory);

        Curry curry1 = store.orderCurry("Green Curry");
        System.out.println("Curry1 costs: " + curry1.getPrice() + " dollars.");


        Curry curry2 = factory.createCurry("Katsu Curry");
        System.out.println("Curry2 originated from : " + curry2.getRegion() + ".");


        Curry curry3 = factory.createCurry("Tikka Masala");
        System.out.println("Curry3's name: " + curry3.getName());
    }


}
