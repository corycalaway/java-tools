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


    int add(int a,int b){return a+b;}  // 2 arguments
    int add(int a,int b,int c){return a+b+c;}  //3 arguments

    static int addAnother(int a, int b){return a+b;}  // 2 arguments of int data type
    static double addAnother(double a, double b){return a+b;}  // 2 arguments of double data type


    public void disp()
    {
        System.out.println("disp() method of parent class");
    }

}


// Constructor
//    Constructor name must be the same as its class name
//    A Constructor must have no explicit return type
//    A Java constructor cannot be abstract, static, final, and synchronized