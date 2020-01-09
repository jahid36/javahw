package com;

public class InfixHwBipolobSir {

    public static void main(String [] agrs ) {


        System.out.println("_ Java Home Work _");

        System.out.println("... Data Types Method ...");

        dataTypes();
        operators();



    }

// DataTypes Method

    public static void dataTypes() {


        int jak1Int = 15;
        byte jak2Byt = 10;
        short jak3Shot = 20;
        long jak4Lon = 40l;
        float jak5Flot = 250f;
        double jak6Duble = 200d;

        char jak7Variable = 'T';

        boolean jak8Bolan = false;





        System.out.println(jak1Int);
        System.out.println(jak2Byt);
        System.out.println(jak3Shot);
        System.out.println(jak4Lon);
        System.out.println(jak5Flot);
        System.out.println(jak6Duble);
        System.out.println(jak7Variable);
        System.out.println(jak8Bolan);



    }

// Arithmetic Operators Method

    public static void operators(){


        System.out.println("... Arithmetic Operators ...");


        // + Additive operator

        int tNumOne = 110;
        int tNumTwo = 20;

        // - Subtraction operator

        int tNumthree =50;
        int tNumFour = 30;

        // * Multiplication operator

        int tNumfive = 4;
        int tNumSix = 6;

        // / Division operator

        int tNumseven = 10;
        int tNumEight = 5;

        // % Remainder operator

        int tNumNine = 15;
        int tNumTen = 10;




        System.out.println(tNumOne + tNumTwo);
        System.out.println(tNumthree - tNumFour);
        System.out.println(tNumfive * tNumSix);
        System.out.println(tNumseven / tNumEight);
        System.out.println("Remainder :-" +" " +  tNumNine % tNumTen);


        // Unary Operators Method

        System.out.println("... Unary Operators ...");


        // ++ Increment operator

        int tVal = 20;

        tVal++;

        // -- Decrement operator

        int tValtwo = 20;

        tValtwo--;

        // ! Logical complement operator

        boolean tValu = !false;


        System.out.println(tVal);
        System.out.println(tValtwo);
        System.out.println(!tValu);



    }




}


