package com.elvischang.dps.oberver;

/**
 * @author elvischang
 * @create 2022-09-25-上午 03:04
 **/
public class OberserPatternDemo {

    public static void main(String[] args) {
        CoinData coinData = new CoinData();

        CryptoCurrencyObserver fakeCMC = new FakeCoinMarketCap(coinData);
        CryptoCurrencyObserver fakeOpenSea = new FakeOpenSea(coinData);


        coinData.setPrices(19116.3, 1341.5, 83);

        coinData.setPrices(20000, 2000, 100);

    }
}
