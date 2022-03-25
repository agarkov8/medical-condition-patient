package com.company.patient;

public class Organ {

    private String name;
    private String medicalCondition;

    //setting value of the variables using a constructor
    public Organ(String name, String medicalCondition) {
        this.name = name;
        this.medicalCondition = medicalCondition;
    }

    //this method is used to display certain text in the console
    public void getDetails(){
        System.out.println("Name: " + getName());
        System.out.println("Medical Condition: " + getMedicalCondition());
    }

    // Getters and Setter for the private variables
    public String getName() {
       return name;
    }


    public String getMedicalCondition() {
        return medicalCondition;
    }

}
