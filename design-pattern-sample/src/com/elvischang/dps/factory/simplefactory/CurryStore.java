package com.elvischang.dps.factory.simplefactory;

/**
 * @author elvischang
 * @create 2022-09-23-上午 12:37
 **/
public class CurryStore {

    SimpleCurryFactory scf;

    public CurryStore(SimpleCurryFactory scf) {
        this.scf = scf;
    }

    public Curry orderCurry(String type) {

        Curry curry = scf.createCurry(type);

        curry.prepare();
        curry.heat();
        return curry;

    }
}
