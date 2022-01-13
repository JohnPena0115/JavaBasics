package com.careerdevs.sayhello;

import java.util.Scanner;

import static com.careerdevs.NameGenerator.generateFullName;

public class SayHello {

    public static void main(String[] args) {

       // whatIsYourName();

          whatIsYourFullName();


    }

    public static void whatIsYourName(){

        Scanner read = new Scanner(System.in);

        System.out.print("What is your name?\nName:");

        String response = read.nextLine();

        System.out.println("Hello, nice to meet you " + response + ".");
    }

    public static void whatIsYourFullName(){

        Scanner read = new Scanner(System.in);

        System.out.print("What is your first name: ");

        String firstResponse = read.next();

        System.out.print("What is your last name: ");

        String secondResponse = read.next();

        System.out.println("It is so nice to formally meet you " + generateFullName(firstResponse, secondResponse) + ".");
    }

}
