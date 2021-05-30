package com.company;

public class Java_basics {


    //method
    public static void myJavaNotes() {

        System.out.println("Hello World");

        // Variables
        int num = 5;
        double doubley = 4.6;
        char firstInitial = 'K';
        String name = "Cory";
        boolean isHome = true;

        // Prints num variable
        System.out.println(num);
        System.out.println(doubley);
        System.out.println(firstInitial);
        System.out.println(name);
        System.out.println(isHome);

    }

    public static void myJavaTryCatch() {


        String face = "Perfect";
        // trys this code
        try {
            // prints face variable
            System.out.println(face);

            // creates an array
            int[] myNumbers = {1, 2, 3};
            // fails due to myNumbers[10] not existing
            System.out.println(myNumbers[10]);

            // if fails catches
        } catch(Exception e) {
            System.out.println("Fail");

            // executes after trycatch is complete
        } finally {
            System.out.println("Done");
        }

    }

}
