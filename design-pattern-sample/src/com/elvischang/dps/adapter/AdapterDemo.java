package com.elvischang.dps.adapter;

/**
 * @author elvischang
 * @create 2022-09-24-下午 03:25
 **/
public class AdapterDemo {

    public static void main(String[] args) {
        testObjectAdapter();
    }

    private static void testObjectAdapter() {
        TeslaModelY modelY = new TeslaModelY();
        TurboEngineCar adapter = new TurboEngineCarObjectAdapter(modelY);
        TurboEngineCar lambo = new LamborghiniUrus();
        lambo.turboBoost();
        adapter.turboBoost();
    }
}
