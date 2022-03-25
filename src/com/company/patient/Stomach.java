package com.company.patient;

public class Stomach extends Organ {

    private boolean isEmpty;

    //Update the constructor
    public Stomach(String name, String medicalCondition, boolean isEmpty) {
        super(name, medicalCondition);
        this.isEmpty = isEmpty;
    }

    //Method Override with Additional Information
    @Override
    public void getDetails() {
        super.getDetails();
        if (getisEmpty()){
            System.out.println("Need to be fed");
        } else{
            System.out.println("Stomach is full");
        }

    }

    //Create a digest method
    public void digest (){
        System.out.println("Digesting begin...");
    }

    //Getters and Setters
    public boolean getisEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

}
