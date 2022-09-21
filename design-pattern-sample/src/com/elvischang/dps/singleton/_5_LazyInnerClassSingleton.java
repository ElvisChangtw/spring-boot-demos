package com.elvischang.dps.singleton;

/**
 * @author elvischang
 * @create 2022-09-21-下午 11:24
 **/
public class _5_LazyInnerClassSingleton {

    private _5_LazyInnerClassSingleton() {

    }


    private static _5_LazyInnerClassSingleton getInstance() {
       return InnerSingleton.INSTANCE;
    }

    private static class InnerSingleton{
        private static final _5_LazyInnerClassSingleton INSTANCE = new _5_LazyInnerClassSingleton();

    }
}
