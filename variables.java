package com.example.helloworld;

import java.util.Arrays;

public class variables {
    public static void main(String[] args) {

        int number = 5;
        System.out.println(number);

        long myLong = 5;
        System.out.println(myLong);

        double myDouble = 4.5;
        System.out.println(myDouble);

        float myFloat = (float) 4.5;//by casting you tell the ide this is going to be a float number
        System.out.println(myFloat);

        char myChar = 'M';
        System.out.println(myChar);

        String name = "Michael";//String is not highlighted like the others because its a datatype not a class
        System.out.println(name);

        boolean myBoolean = true;
        System.out.println(myBoolean);
    }
}
