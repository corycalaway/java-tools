package com.company;

public class SubOOP  extends OOP{

    int powerLevel = 9000;
    int inc = 100;

    public SubOOP(String n, int a) {
        super(n, a);


        System.out.println("My power level is over:"+ powerLevel);

    }

    void increasePowerLevel() {
        powerLevel = powerLevel + inc;
        System.out.println("My power level is now:"+ powerLevel);
    }
}
