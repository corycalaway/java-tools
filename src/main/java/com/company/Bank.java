package com.company;


public class Bank {

    public Bank() {

    }

    void getRateOfInterest() {
        System.out.println("Print this");
    }

}

class SBI extends Bank {

    public SBI() {

    }

    void getRateOfInterest() {
        System.out.println("8%");
    }

}

class ICICI extends Bank {

    public ICICI() {

    }

    void getRateOfInterest() {
        System.out.println("7%");
    }
}

class AXIS extends Bank {

    public AXIS() {

    }

    void getRateOfInterest() {
        System.out.println("9%");
    }
}