package edu.handong.csee.java.hw2.converters;

/**
 * Class to convert Kilometer to Meter
 */
public class KMToMConverter implements Convertible{
    private double firstValue;
    private double afterValue;
    private String originalMeasure;

    /**
     * Method to save the value of Kilometer
     */
    public void setFromValue (double fromValue){
        firstValue = fromValue;
    }

    /**
     * Metod to return the value of Meter
     */
    public double getConvertedValue(){
        return afterValue;
    }

    /**
     * Method to save the value converted to Meter
     */
    public void convert(){
        afterValue = firstValue * 1000;
    }
}