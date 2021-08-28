package com.example.helloworld;

public class arithmetic_operators {
    public static void main(String[] args) {

        //arithmetic operators
        int a = 5;
        int b = 2;
        int answer = a + b;
        System.out.println(answer);
        int answer2 = a - b;
        System.out.println(answer2);
        int answer3 = a * b;
        System.out.println(answer3);
        int answer4 = a / b;
        System.out.println(answer4);
        int answer5 = a % b;
        System.out.println(answer5);

        double answer6 = (double) a / b;//by doing this you have cast an integer into a double
        System.out.println(answer6);

        String firstName = "Emma";
        String lastName = "Watson";
        String fullName = firstName + lastName;
        System.out.println(fullName);

        a = a + 2;
        System.out.println(a);
        a++;
        System.out.println(a);
        a += 2;
        System.out.println(a);

    }

}
