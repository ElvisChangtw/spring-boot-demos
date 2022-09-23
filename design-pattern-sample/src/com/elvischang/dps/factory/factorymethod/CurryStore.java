package com.elvischang.dps.factory.factorymethod;


/**
 * @author elvischang
 * @create 2022-09-23-上午 12:37
 **/
public abstract class CurryStore {

    abstract Curry createCurry(String item);

    public Curry orderCurry(String type) {

        Curry curry = createCurry(type);

        curry.prepare();
        curry.heat();
        return curry;

    }
}
