package com.elvischang.dps.factory.factorymethod;

/**
 * @author elvischang
 * @create 2022-09-23-上午 12:34
 **/
public class JapaneseCurryStore extends CurryStore {
    @Override
    Curry createCurry(String type) {
        if ("Tikka Masala".equals(type)) {
            return new JapaneseStyleTikkaMasala();
        } else if ("Green Curry".equals(type)) {
            return new JapaneseStyleGreenCurry();
        } else if ("Katsu Curry".equals(type)) {
            return new JapaneseStyleKatsuCurry();
        }
        return null;
    }
}
