package com.careerdevs.carfactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        donationRequest();

    }



    public static void donationRequest() {


            Scanner read = new Scanner(System.in);

            System.out.print("Hello. We have e-mailed this form because you have expressed\n" +
                    "interest in donating your car.\n" +
                    "Do you still wish to continue? (Y or N): ");

            char confirmation = read.nextLine().charAt(0);


            if (Character.toLowerCase(confirmation) == 'n') {

                System.out.println("We are sorry to hear that.\n" +
                                "If at any point you change your mind\n"+
                                "do not hesitate to reach out.");
                System.exit(0);

            }

            System.out.print("Great! What is your legal name?: ");
            String owner = read.nextLine();



            System.out.print("What is the make and model of the car you wish to donate?: ");


            String[] car = read.nextLine().split(" ");


            String make = car[0];
            String model = car[1];

        System.out.println("Could you please confirm the following: " + carDonation(owner, make, model));

    }



    public static String carDonation(String owner, String make, String model){

        return "I, " + owner + ", wish to donate my " + make + " " + model + " to the Make-A-Wish foundation.";

    }

}
