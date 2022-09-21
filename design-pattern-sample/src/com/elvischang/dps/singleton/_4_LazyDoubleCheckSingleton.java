package com.elvischang.dps.singleton;

/**
 * @author elvischang
 * @create 2022-09-21-下午 11:24
 **/
public class _4_LazyDoubleCheckSingleton {

    private static volatile _4_LazyDoubleCheckSingleton instance;

    private _4_LazyDoubleCheckSingleton() {

    }


    private static _4_LazyDoubleCheckSingleton getInstance() {
        if (instance == null) {
            synchronized (_4_LazyDoubleCheckSingleton.class){
                if(instance == null){
                    instance = new _4_LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
