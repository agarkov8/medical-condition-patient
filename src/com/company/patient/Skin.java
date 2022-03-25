package com.company.patient;

public class Skin extends  Organ{

    private String color;
    private  int softness;

    //Update the constructor
    public Skin(String name, String medicalCondition, String color, int softness) {
        super(name, medicalCondition);
        this.color = color;
        this.softness = softness;
    }

    //Method Override with Additional Information
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Skin color: " + getColor());
    }

    //Getters and Setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSoftness() {
        return softness;
    }

    public void setSoftness(int softness) {
        this.softness = softness;
    }
}
