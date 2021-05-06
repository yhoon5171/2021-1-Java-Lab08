package edu.handong.csee.java.hw2.converters;

/**
 * Class to convert Mile to Kilometer
 */
public class MILEToKMConverter implements Convertible{
    private double firstValue;
    private double afterValue;
    private String originalMeasure;

    /**
     * Method to save the value of Mile
     */
    public void setFromValue (double fromValue){
        firstValue = fromValue;
    }

    /**
     * Method to return the value of Kilometer
     */
    public double getConvertedValue(){
        return afterValue;
    }

    /**
     * Method to save the value converted to Kilometer
     */
    public void convert(){
        afterValue = Double.parseDouble(String.format("%.10f",firstValue * 1.6));
    }
}