package com.company.patient;

public class Eye extends Organ {
    private String color;
    private boolean isOpened;

    public Eye(String name, String medicalCondition, String color, boolean isOpened) {
        super(name, medicalCondition);
        this.color = color;
        this.isOpened = isOpened;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + getColor());
    }

    public void open(){
        setOpened(true);
        System.out.println(getName() + " is opened!");
    }

    public void close(){
        setOpened(false);
        System.out.println(getName() + " is closed");
    }

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
