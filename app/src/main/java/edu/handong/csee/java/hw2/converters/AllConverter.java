package edu.handong.csee.java.hw2.converters;

/**
 * Class to Convert value of one measurement to the other avaiable measurements
 */
public class AllConverter{
    private double fromValue;
    private String originalMeasure;

    /**
     * Method to save the input value that should be converted
     */
    public AllConverter setFromValue(double fromValue){
        this.fromValue = fromValue;

        return this;
    }

    /** 
     * Method to save the original measurement inputted
     */
    public AllConverter setOriginalMeasure(String originalMeasure){
        this.originalMeasure = originalMeasure;

        return this;
    }

    /**
     * If Kilometer, convert to Meter and Mile;;
     * If Mile, convert to Kilometer;;
     * If Ton, convert to Gram and Kilogram
     */
    public AllConverter convertAndPrintOut(){
        if (originalMeasure.equals("KM")){
            KMToMConverter kmToMConverter = new KMToMConverter();
            KMToMILEConverter kmToMileConverter = new KMToMILEConverter();

            kmToMConverter.setFromValue(fromValue);
            kmToMConverter.convert();
            System.out.println(fromValue +" " + originalMeasure + " to " + kmToMConverter.getConvertedValue() + " M");

            kmToMileConverter.setFromValue(fromValue);
            kmToMileConverter.convert();
            System.out.println(fromValue +" " + originalMeasure + " to " + kmToMileConverter.getConvertedValue() + " MILE");
        }

        else if (originalMeasure.equals("TON")){
            TONToGConverter tonToGConverter = new TONToGConverter();
            TONToKGConverter tonToKgConverter = new TONToKGConverter();

            tonToKgConverter.setFromValue(fromValue);
            tonToKgConverter.convert();
            System.out.println(fromValue +" " + originalMeasure + " to " + tonToKgConverter.getConvertedValue() + " KG");

            tonToGConverter.setFromValue(fromValue);
            tonToGConverter.convert();
            System.out.println(fromValue +" " + originalMeasure + " to " + tonToGConverter.getConvertedValue() + " G");            
        }
        
        else{
            System.out.println("AllConverter cannot support the measure!");
        }

        return this;
    }
}