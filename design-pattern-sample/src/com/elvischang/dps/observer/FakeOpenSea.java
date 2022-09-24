package com.elvischang.dps.observer;

/**
 * @author elvischang
 * @create 2022-09-24-下午 04:49
 **/
public class FakeOpenSea implements CryptoCurrencyObserver, DisplayElement {
    private double boredApePrice;
    private CoinData coinData;

    public FakeOpenSea(CoinData coinData) {
        this.coinData = coinData;
        coinData.registerObserver(this);
    }

    @Override
    public void update(double btcPrice, double ethPrice, double boredApePrice) {
        this.boredApePrice = boredApePrice;
        display();
    }

    @Override
    public void display() {
        System.out.println("---------OpenSea price---------");
        System.out.println("boredApePrice: " + boredApePrice + "ETH.");
        System.out.println();
    }
}
