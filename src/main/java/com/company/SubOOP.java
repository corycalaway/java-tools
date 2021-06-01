package com.company;

public class SubOOP  extends OOP{

    int powerLevel = 9000;
    int inc = 100;

    public SubOOP(String n, int a) {
        super(n, a);


        System.out.println("My power level is over:"+ powerLevel);

    }

    void nailedIt() {
        System.out.println("Called using ths!");
    }
    void increasePowerLevel() {
        powerLevel = powerLevel + inc;
        this.nailedIt();
        System.out.println("My power level is now:"+ powerLevel);
    }

    public void disp(){
        System.out.println("disp() method of Child class");
    }
    public void newMethod(){
        System.out.println("new method of child class");
    }

}
