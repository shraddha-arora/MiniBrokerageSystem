package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class Trader {

    double funds;
    String name;
    HashMap<String, Integer> holdings;


    Trader(String name, double funds, HashMap<String, Integer> holdings) {
        this.name = name;
        this.funds = funds;
        this.holdings = holdings;
    }

    public double getFunds() {
        return funds;
    } //to get funds of trader

    public String getName() {
        return name;
    } //to get the name of trader

    public HashMap<String, Integer> getHoldings() {
        return holdings;
    } //to get the holdings of trader

    public void setFunds(double funds) {
        this.funds = funds;
    } //to set funds of trader

    public void setName(String name) {
        this.name = name;
    } //to set the name of trader

    @Override
    public String toString() {
        return "name= " + name + ",funds= " + funds + ",holdings= " + holdings;
    }

    public HashMap<String, Integer> createHashMap(String string) {
        HashMap<String, Integer> hashMap = new HashMap<>();
        if (string.endsWith("None")) {

        } else {
            String holdings = string.substring(string.indexOf("{") + 1, string.indexOf("}"));
            String[] holdingsSplit = holdings.split("[,: ]");
            for (int i = 0; i < holdingsSplit.length; i++) {
                if (holdingsSplit[i].length() == 0)
                    continue;
                else {
                    hashMap.put(holdingsSplit[i], Integer.parseInt(holdingsSplit[++i]));
                }

            }

        }
        return hashMap;

    }
}
