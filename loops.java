package com.example.helloworld;

public class loops {
    public static void main(String[] args) {

        int a=5;

        //For loops
        for(int i=a; i<10; i++){
            System.out.println("Hello");
        }

        //while loop
        while(a<10){
            System.out.println("Hello");
            a++;
        }

        while(a<10){
            System.out.println("Hello");
            break;//by adding a break we print hello only once
        }

        while(a<10){

            a++;

            if(a==8){
                continue;//if a is 8 hello is not printed
            }
            System.out.println("Hello");
        }

        //dowhile loop
        do{
            System.out.println("Hello");
        }while(a<5);

    }
}
