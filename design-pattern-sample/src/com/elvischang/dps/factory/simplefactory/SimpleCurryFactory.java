package com.elvischang.dps.factory.simplefactory;

/**
 * @author elvischang
 * @create 2022-09-22-下午 11:42
 **/
public class SimpleCurryFactory {
    Curry curry = null;

    public Curry createCurry(String type) {
        if ("Tikka Masala".equals(type)) {
            curry = new TikkaMasala();
        } else if ("Green Curry".equals(type)) {
            curry = new GreenCurry();
        } else if ("Katsu Curry".equals(type)) {
            curry = new KatsuCurry();
        }
        return curry;
    }

}
