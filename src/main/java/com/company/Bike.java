package com.company;

abstract class Bike {
    abstract void getRateOfBikeInterest();
}

class SBIBike extends Bike {
    void getRateOfBikeInterest() {
        System.out.println("This is worth 7%");
    }
}

class PNBBike extends Bike {
    void getRateOfBikeInterest() {
        System.out.println("This is worth 5%");
    }
}