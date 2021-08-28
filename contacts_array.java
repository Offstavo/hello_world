package com.example.helloworld;

import java.util.Scanner;

public class contacts_array {
    public static void main(String[] args) {

        String[] names = {"Michael","Sarah","Tom","Brad","Brian"};
        int[] numbers = {221223,378273,738263,636762,982773};
        for (int i=0; i<names.length; i++){
            System.out.println(names[i]);
        }

        System.out.println("please enter a name");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for(int i=0; i<names.length; i++){
            if(name.equals(names[i])){
                System.out.println(numbers[i]);
            }
        }
    }
}
