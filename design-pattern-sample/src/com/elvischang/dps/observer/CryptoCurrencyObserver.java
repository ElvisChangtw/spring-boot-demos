package com.elvischang.dps.observer;

/**
 * @author elvischang
 * @create 2022-09-24-下午 04:31
 **/
public interface CryptoCurrencyObserver {

    public void update(double btcPrice, double ethPrice, double boredApePrice);
}
