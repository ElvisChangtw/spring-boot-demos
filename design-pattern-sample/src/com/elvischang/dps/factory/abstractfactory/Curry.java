package com.elvischang.dps.factory.abstractfactory;

/**
 * @author elvischang
 * @create 2022-09-22-下午 11:34
 **/
public abstract class Curry {

    String name;
    String region;
    Integer price;
    Sauce sauce;
    Potato potato;

    abstract void prepare();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


}
