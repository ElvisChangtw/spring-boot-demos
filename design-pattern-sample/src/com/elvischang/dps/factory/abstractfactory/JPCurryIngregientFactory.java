package com.elvischang.dps.factory.abstractfactory;

/**
 * @author elvischang
 * @create 2022-09-23-下午 11:31
 **/
public class JPCurryIngregientFactory extends CurryIngredientFactory{

    @Override
    Sauce createSauce() {
        return new SauceA();
    }

    @Override
    Potato createPotato() {
        return new PotatoZ();
    }
}
