package com.elvischang.dps.singleton;

/**
 * @author elvischang
 * @create 2022-09-21-下午 11:51
 **/
public enum _6_EnumSingleton {

    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {
        _6_EnumSingleton singleton = _6_EnumSingleton.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
    }
}
