package com.elvischang.dps.factory.abstractfactory;


/**
 * @author elvischang
 * @create 2022-09-23-上午 12:34
 **/
public class ThaiCurryStore extends CurryStore {

    Curry curry = null;
    CurryIngredientFactory ingredientFactory = new THCurryIngregientFactory();
    @Override
    Curry createCurry(String type) {
        if ("Tikka Masala".equals(type)) {
            curry = new TikkaMasala(ingredientFactory);
            curry.setName("Thai Tikka Masala");
        } else if ("Green Curry".equals(type)) {
            curry = new GreenCurry(ingredientFactory);
            curry.setName("Thai Green Curry");
        } else if ("Katsu Curry".equals(type)) {
            curry = new KatsuCurry(ingredientFactory);
            curry.setName("Thai Katsu Curry");
        }
        return curry;
    }
}
