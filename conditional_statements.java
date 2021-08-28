package com.example.helloworld;

import java.util.Arrays;

public class conditional_statements {
    public static void main(String[] args) {

        int a = 5;
        int b = 3;

        if(a>3){
            System.out.println("A is greater than 3");
        }



        boolean answer = a>3;
        if(answer == true){
            System.out.println("A is greater than 3");
        }else{
            System.out.println("A is less than 3");
        }



        if(a>0){
            System.out.println("A is positive");
        }else if(a<0){
            System.out.println("A is negative");
        }
        else{
            System.out.println("A is 0");
        }



        switch(a){
            case 1:
                System.out.println("A is one");
                break;
            case 2:
                System.out.println("A is two");
                break;
            case 3:
                System.out.println("A is three");
                break;
            default:
                System.out.println("A is not equal to one,two or three");
                break;
        }
        System.out.println("Continue ...");
    }
}
