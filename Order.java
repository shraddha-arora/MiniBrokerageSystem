package com.company;

import java.util.UUID;

public class Order {
    String type,scrip,name;
    double qty,rate;
    Order(String name, String type, String scrip, double qty, double rate){
        this.name = name;
        this.type = type;
        this.scrip = scrip;
        this.qty = qty;
        this.rate = rate;
    }
    public String getName(){return name;} //to get name of user
    public String getType(){return type;} //to get type of order, buy or sell
    public String getScrip(){
        return scrip;
    } //to get Ticker
    public double getQty(){return qty;}

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "user : " + name + ", type=" + type + ", scrip=" + scrip + ", qty=" + qty + ", rate=" + rate;
    }
}
