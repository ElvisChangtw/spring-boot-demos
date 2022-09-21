package com.elvischang.dps.singleton;

/**
 * @author elvischang
 * @create 2022-09-21-下午 11:24
 **/
public class _2_EagerStaticBlockSingleton {

    private static final _2_EagerStaticBlockSingleton instance;

    private _2_EagerStaticBlockSingleton() {}

    static {
        try {
            instance = new _2_EagerStaticBlockSingleton();
        } catch (Exception e) {
            throw e;
        }

    }

    private static _2_EagerStaticBlockSingleton getInstance() {

        return instance;
    }
}
