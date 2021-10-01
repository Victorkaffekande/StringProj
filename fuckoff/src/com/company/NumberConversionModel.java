 package com.company;

public class NumberConversionModel {

    public String getGreetingMessage(String name){
        String output = "hello" + name + ".Greetings";
        return output;
    }

    public double getMilesFromKilometers(double km)
    {
       double output = km * 0.621371192;
       return output;
    }

    public double getKilometersFromMiles(double miles){
        double output = miles * 1.609344;
        return output;
    }

}
