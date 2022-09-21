package com.elvischang.dps.singleton;

/**
 * @author elvischang
 * @create 2022-09-21-下午 11:24
 **/
public class _1_EagerSingleton {

    private static final _1_EagerSingleton instance = new _1_EagerSingleton();

    // keep construct away from anyone.
    private _1_EagerSingleton() {}

    private static _1_EagerSingleton getInstance() {
        return instance;
    }
}
