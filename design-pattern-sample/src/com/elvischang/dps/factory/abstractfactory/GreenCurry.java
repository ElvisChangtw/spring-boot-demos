package com.elvischang.dps.factory.abstractfactory;

/**
 * @author elvischang
 * @create 2022-09-22-下午 11:38
 **/
public class GreenCurry extends Curry {
    CurryIngredientFactory ingredientFactory;

    public GreenCurry(CurryIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }


    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        sauce = ingredientFactory.createSauce();
        potato = ingredientFactory.createPotato();
    }
}
