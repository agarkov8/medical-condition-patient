package com.company.patient;

public class Patient {

    //Declaring variables
    private String name;
    private  int age;

    private Eye leftEye;
    private Eye rightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    //Declaring the Constructor
    public Patient(String name, int age, Eye leftEye, Eye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }

    //Getters and Setters of all variables
    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }


    public Eye getLeftEye() {
        return leftEye;
    }


    public Eye getRightEye() {
        return rightEye;
    }


    public Heart getHeart() {
        return heart;
    }


    public Stomach getStomach() {
        return stomach;
    }


    public Skin getSkin() {
        return skin;
    }

}
