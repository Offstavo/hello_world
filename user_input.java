package com.example.helloworld;

import java.util.Scanner;

public class user_input {
    public static void main(String[] args) {
        System.out.println("Please enter a number");
        Scanner scanner = new Scanner(System.in);

        int answer = scanner.nextInt();
        System.out.println("Answer was " + answer);

        System.out.println("Enter a name");
        String name = scanner.next();
        System.out.println("Hello " + name);
    }
}
