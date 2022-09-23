package com.elvischang.dps.factory.abstractfactory;


import com.elvischang.dps.factory.abstractfactory.Curry;

/**
 * @author elvischang
 * @create 2022-09-23-上午 12:37
 **/
public abstract class CurryStore {

    abstract Curry createCurry(String item);

    public Curry orderCurry(String type) {
        Curry curry = createCurry(type);
        System.out.println("--- Making a " + curry.getName() + " ---");

        curry.prepare();
        return curry;

    }
}
