package com.elvischang.dps.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author elvischang
 * @create 2022-09-24-下午 04:40
 **/
public class CoinData implements Subject {
    private List<CryptoCurrencyObserver> observers;
    private double btcPrice;
    private double ethPrice;
    private double boredApePrice;

    public CoinData() {
        this.observers = new ArrayList();
    }

    @Override
    public void registerObserver(CryptoCurrencyObserver co) {

        observers.add(co);
    }

    @Override
    public void removeObserver(CryptoCurrencyObserver co) {
        int i = observers.indexOf(co);
        if (i >= 0) {
            observers.remove(co);
        }
    }

    @Override
    public void notifyObservers() {
        for (CryptoCurrencyObserver observer : observers) {
            observer.update(btcPrice, ethPrice, boredApePrice);
        }
    }

    public void priceChanged() {
        notifyObservers();
    }

    public void setPrices(double btcPrice, double ethPrice, double boredApePrice) {
        this.btcPrice = btcPrice;
        this.ethPrice = ethPrice;
        this.boredApePrice = boredApePrice;
        priceChanged();
    }

    public List<CryptoCurrencyObserver> getObservers() {
        return observers;
    }

    public double getBtcPrice() {
        return btcPrice;
    }

    public double getEthPrice() {
        return ethPrice;
    }

    public double getBoredApePrice() {
        return boredApePrice;
    }

    public void setBoredApePrice(double boredApePrice) {
        this.boredApePrice = boredApePrice;
    }
}
