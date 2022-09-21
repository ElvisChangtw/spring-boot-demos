package com.elvischang.dps.singleton;

/**
 * @author elvischang
 * @create 2022-09-21-下午 11:24
 **/
public class _3_LazySingleton {

    private static _3_LazySingleton instance;

    private _3_LazySingleton() {

    }


    private static _3_LazySingleton getInstance() {
        if (instance == null) {
            instance = new _3_LazySingleton();
        }
        return instance;
    }
}
