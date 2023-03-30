package com.m2p;

public class Centimeter {
//        public boolean checkEquality(String firstMeasurement, String secondMeasurement) {
//            return firstMeasurement.equals(secondMeasurement);

    private final double magnitude;

    public Centimeter(double magnitude){
        this.magnitude = magnitude;
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

