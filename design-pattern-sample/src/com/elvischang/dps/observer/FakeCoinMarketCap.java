package com.elvischang.dps.observer;

/**
 * @author elvischang
 * @create 2022-09-24-下午 04:49
 **/
public class FakeCoinMarketCap implements CryptoCurrencyObserver, DisplayElement {
    private double btcPrice;
    private double ethPrice;
    private CoinData coinData;

    public FakeCoinMarketCap(CoinData coinData) {
        this.coinData = coinData;
        coinData.registerObserver(this);
    }

    @Override
    public void update(double btcPrice, double ethPrice, double boredApePrice) {
        this.btcPrice = btcPrice;
        this.ethPrice = ethPrice;
        display();
    }

    @Override
    public void display() {
        System.out.println("=======CMC price=======");
        System.out.println("btcPrice: " + btcPrice + ", ethPrice: " + ethPrice);
        System.out.println();
    }
}
