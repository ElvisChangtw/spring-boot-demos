package com.elvischang.dps.factory.factorymethod;

/**
 * @author elvischang
 * @create 2022-09-22-下午 11:34
 **/
public abstract class Curry {

    String name;
    String region;
    Integer price;

    public void prepare() {
        System.out.println("Preparing " + name);
    }

    public void heat(){
        System.out.println("Heating " + name);
    }
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
