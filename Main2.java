package com.company;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(new File("C:\\Users\\Shraddha\\Downloads\\INFY_15days_data (1).csv"));

            String data ="";
            ArrayList<Double> lastClosePrice = new ArrayList<Double>();
            ArrayList<Double> openPrice = new ArrayList<Double>();
            ArrayList<Double> highPrice = new ArrayList<Double>();
            ArrayList<Double> lowPrice = new ArrayList<Double>();
            ArrayList<Double> lastPrice = new ArrayList<Double>();
            ArrayList<Double> closePrice = new ArrayList<Double>();
            int i=0;

            while(input.hasNextLine()){
                data = input.nextLine();
                if(i==0){
                    i++;
                }
                else {
                    String[] dataSplit = data.split(",");
                    lastClosePrice.add(Double.parseDouble(dataSplit[2]));
                    openPrice.add(Double.parseDouble(dataSplit[3]));
                    highPrice.add(Double.parseDouble(dataSplit[4]));
                    lowPrice.add(Double.parseDouble(dataSplit[5]));
                    lastPrice.add(Double.parseDouble(dataSplit[6]));
                    closePrice.add(Double.parseDouble(dataSplit[7]));
                    i++;
                }
            }
            System.out.println();

            double sum = 0.0;
            for (Double j : closePrice) {
                sum =  sum + j;
            }

            double average = sum/closePrice.size();
            System.out.printf("Average is %.2f\n",average);

            double diff = 0.0;
            double value = 0.0;
            double maximum = closePrice.get(0);
            for (double temp : closePrice) {
                if (temp >= maximum) {
                    maximum = temp;
                } else {
                    diff = maximum - temp;
                    value = Math.max(diff, value);
                }
            }
            System.out.printf("Max Drawdown of the given stock: %.2f\n",value);
            double maxPotential = 0.0;
            for(int j=0;j<openPrice.size();j++){
                maxPotential = maxPotential + Math.abs(openPrice.get(j)-closePrice.get(j));
            }
            System.out.printf("Max Return Potential : %.2f\n",maxPotential);

            double percentage = Math.floor((100*maxPotential)/openPrice.get(0)*100)/100;
            System.out.println("Percentage max Return Potential: " + percentage +"%");
        }
        catch (Exception e){
            System.out.println("Something is not right.");
        }
    }

}
