package com.example.helloworld;

import java.util.Random;

public class random_number {
    public static void main(String[] args) {

        Random random = new Random();
        int number = random.nextInt();
        System.out.println("Number " + number);

        //use a domain so you dont get wierd values
//        Random random2 = new Random();
//        int number2 = random.nextInt(bound: 20);
//        System.out.println("Number " + number2);

    }
}
