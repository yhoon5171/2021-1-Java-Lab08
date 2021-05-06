package edu.handong.csee.java.hw2.converters;

/**
 * Class to convert Ton to Kilogram
 */
public class TONToKGConverter implements Convertible{
    private double firstValue;
    private double afterValue;
    private String originalMeasure;

	/**
	 * Method to save the value of Ton
	 */
    public void setFromValue (double fromValue){
        firstValue = fromValue;
    }

	/**
 	 * Method to return the value of Kilogram
	 */
    public double getConvertedValue(){
        return afterValue;
    }

	/**
 	 * Method to save the value converted to Kilogram
 	 */
    public void convert(){
        afterValue = firstValue * 1000;
    }
}