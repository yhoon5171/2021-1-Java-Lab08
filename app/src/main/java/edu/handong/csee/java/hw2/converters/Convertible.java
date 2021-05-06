package edu.handong.csee.java.hw2.converters;

/**
 * Interface that all converter classes will use
 */
public interface Convertible {

    /**
     * Method that save the input value that should be converted
     */
    public void setFromValue(double fromValue);

    /**
     * Method that returns converted value
     */
    public double getConvertedValue();

    /**
     * Convert the value according to the input measurement
     */
    public void convert();

}