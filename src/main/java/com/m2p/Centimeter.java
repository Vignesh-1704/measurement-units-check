package com.m2p;

public class Centimeter {
//        public boolean checkEquality(String firstMeasurement, String secondMeasurement) {
//            return firstMeasurement.equals(secondMeasurement);

    private final double magnitude;

    public Centimeter(double magnitude){
        this.magnitude = magnitude;
    }

    public static Centimeter conversionMetreToCm(double meter)
    {
        return new Centimeter(meter * 100);
    }
    public static Centimeter conversionCmToKm(double cm)
    {
        return new Centimeter(cm / 100000 );
    }

    @Override
    public boolean equals(Object object){
        if(this == object){
            return true;
        }
        if(object.getClass() != getClass()){
            return false;
        }
        Centimeter that = (Centimeter) object;
        return magnitude == that.magnitude;
    }

}

