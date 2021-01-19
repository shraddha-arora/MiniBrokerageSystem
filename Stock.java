package com.company;

public class Stock{
    String ticker;
    String type;
    final double open,high, low, close;

    Stock(String ticker, String type, double open, double high, double low, double close){
        this.ticker = ticker;
        this.type = type;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
    }

    public String getTicker(){
        return ticker;
    } //returning value of scrip
    public void setTicker(String ticker){
        this.ticker = ticker;
    } //setting scrip
    public String getType(){
        return type;
    } //returning sector
    public void setType(String type){
        this.type = type;
    } //setting sector
    public double getOpen(){
        return open;
    } //returning value of open price
    public double getHigh(){
        return high;
    } //returning value of high price
    public double getLow(){
        return low;
    } //returning value of low price
    public double getClose(){
        return close;
    } //returning value of close price

    @Override
    public String toString() {
        return String.format("scrip: "+ticker+", sector: "+type+", O:"+open+", H:"+high+", L:"+low+", C:"+close);
    }

}

