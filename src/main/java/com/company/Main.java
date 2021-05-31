package com.company;


public class Main {

    public static void main(String[] args) throws Exception {

        // Java_basics
        // Creates new object from Java_basics class
        Java_basics JavaNotes = new Java_basics();
        // uses the myJavaNotes method from Java_basics class
        JavaNotes.myJavaNotes();
        // prints JavaNotes in terminal
        System.out.println(JavaNotes);

        // try catch in java
        Java_basics javaTC = new Java_basics();
        javaTC.myJavaTryCatch();
        System.out.println(javaTC);


        // API Basics
        Java_basics myAPI = new Java_basics();
        myAPI.API_basic();
        System.out.println(myAPI);
        // Java_basics



        // OOP

        // single level inheritance
        OOP oopNotes = new OOP("cory", 31);
        SubOOP totalPowerLevel = new SubOOP("cory", 31);
        totalPowerLevel.increasePowerLevel();
//        System.out.println(totalPowerLevel.name);
//        System.out.println(oopNotes.name);
//        System.out.println(oopNotes.age);

        // multilevel inheritance
        MultiSubOOP screamLoud = new MultiSubOOP("Cory", 31);
        screamLoud.Scream();
        screamLoud.MakeScreamHappenAgain();

        SubOOP powerLevelIncrease = new SubOOP("C", 31);
        System.out.println(powerLevelIncrease.name);
        powerLevelIncrease.increasePowerLevel();
        powerLevelIncrease.increasePowerLevel();
        // OOP

    }
}
