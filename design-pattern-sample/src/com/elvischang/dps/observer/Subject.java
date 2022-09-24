package com.elvischang.dps.observer;


/**
 * @author elvischang
 * @create 2022-09-24-下午 04:30
 **/
public interface Subject {

    public void registerObserver(CryptoCurrencyObserver co);
    public void removeObserver(CryptoCurrencyObserver co);
    public void notifyObservers();
}
