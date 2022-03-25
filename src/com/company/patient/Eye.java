package com.company.patient;

public class Eye extends Organ {

    private String color;
    private boolean isOpened;

    //updating the constructor
    public Eye(String name, String medicalCondition, String color, boolean isOpened) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }

    //method override and adding exclusive information regarding the eyes
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + getColor());
    }

    //We use this method to open the eye
    public void open(){
        setOpened(true);
        System.out.println(getName() + " is opened!");
    }

    //We use this method to close the eye
    public void close(){
        setOpened(false);
        System.out.println(getName() + " is closed");
    }

    //Getters and Setters for the additional private variables
    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public boolean isOpened() {
        return isOpened;
    }

    public void setOpened(boolean opened) {
        isOpened = opened;
    }
}
