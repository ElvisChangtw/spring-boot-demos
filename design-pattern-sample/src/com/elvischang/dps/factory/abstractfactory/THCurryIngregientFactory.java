package com.elvischang.dps.factory.abstractfactory;

/**
 * @author elvischang
 * @create 2022-09-23-下午 11:31
 **/
public class THCurryIngregientFactory extends CurryIngredientFactory{

    @Override
    Sauce createSauce() {
        return new SauceB();
    }

    @Override
    Potato createPotato() {
        return new PotatoX();
    }
}
