package edu.handong.csee.java.hw2.converters;

/**
 * Class to convert Kilometer to Mile
 */
public class KMToMILEConverter implements Convertible{
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
     * Method to eturn the value of Mile
     */
    public double getConvertedValue(){
        return afterValue;
    }

    /**
     * Method to save the value converted to Mile
     */
    public void convert(){
        afterValue = Double.parseDouble(String.format("%.10f",firstValue * 0.625));
    }
}
