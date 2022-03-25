package com.company.patient;

public class Heart extends Organ{

    private int heartRate;

    //Update the constructor
    public Heart(String name, String medicalCondition, int heartRate) {
        super(name, medicalCondition);
        this.heartRate = heartRate;
    }

    //Method Override with additional information
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart Rate: " + getHeartRate());
    }

    //Getters and Setters
    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
}
