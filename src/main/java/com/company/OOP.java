package com.company;

import java.lang.reflect.Constructor;

// A class is a blueprint for creating objects.
public class OOP {

    String name;
    int age;


    public OOP(String n, int a) {
        name = n;
        age = a;
    }

    void study() {

        System.out.println("Time to study");
    }

    void improving() {
        System.out.println("Time to study");
    }

    void resting() {

    }


}


// Constructor
//    Constructor name must be the same as its class name
//    A Constructor must have no explicit return type
//    A Java constructor cannot be abstract, static, final, and synchronized