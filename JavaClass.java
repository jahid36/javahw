package com;

public class JavaClass {

public static void main (String[] jahid){
    System.out.println("Arithmatic operation..." );
    operators();
}
//This is an operator practice method
public static void operators(){
    int intNumOne = - 20;
    int intNumTwo = 3;

    System.out.println("Reminder:" + " "+ intNumOne % intNumTwo);

    double doubleNumOne = 20.0;
    double doubleNumTwo = 3.0;
    double doubleNum =(double)(intNumOne/intNumTwo);
    System.out.println(doubleNumOne/doubleNumTwo);

}

}