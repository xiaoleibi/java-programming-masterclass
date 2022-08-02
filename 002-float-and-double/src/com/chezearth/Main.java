package com.chezearth;

public class Main {

    public static void main(String[] args) {

        float myFloatValue = Float.MAX_VALUE; // 3.4028235E38f;
        System.out.println("myFloatValue = " + myFloatValue);
        // width of int is 32 (4 bytes)
        int myIntValue = 5 / 2;
        // width of float is 32 (4 bytes)
        myFloatValue = (float)5 / 3;//prefer to use myFloatValue = 5f / 3f;
        // width of double is 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue); //sout is shortcut for System.out.println 
 
        System.out.println("myFloatValue = " + myFloatValue);
    
        System.out.println("myDoubleValue = " + myDoubleValue);


        double lbValue = 200d;
        double kgValue = lbValue * 0.453_592_37d;
        System.out.println(lbValue + " lb converts to " + kgValue + " kg");
        double myKgWeight = 99.6d; //double is the default type for variables
        double myLbWeight = myKgWeight / 0.453_592_37d;
        System.out.println("My body weight in lbs is " + myLbWeight);

    }
}
