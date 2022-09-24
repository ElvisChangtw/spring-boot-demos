package com.elvischang.dps.adapter;

/**
 * @author elvischang
 * @create 2022-09-24-下午 03:18
 **/
public class TurboEngineCarObjectAdapter implements TurboEngineCar{

    EVCar evCar;

    public TurboEngineCarObjectAdapter(EVCar evCar) {
        this.evCar = evCar;
    }

    @Override
    public void turboBoost() {
        System.out.println("increase the speed to " + evCar.getSpeed() + " from electric booster");
    }
}
