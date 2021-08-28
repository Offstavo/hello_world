package com.example.helloworld;

public class arrays {
    public static void main(String[] args) {

        String[] students = new String[5];
        students[1] = "Michael";
        students[0] = "Sarah";
        students[2] = "Tom";
        students[3] = "Brad";
        students[4] = "Madelin";

        System.out.println(students[2]);

        String[] employees = {"Michael","Tom","Sarah"};

        int[] numbers = {1,2,3,4,5,6};
        for (int i=0; i<6; i++){
            System.out.println(numbers[i]);
        }

        int[] numbers2 = {1,2,3,4,5,6};
        for (int i=0; i<numbers2.length; i++){
            System.out.println(numbers2[i]);
        }
    }
}
