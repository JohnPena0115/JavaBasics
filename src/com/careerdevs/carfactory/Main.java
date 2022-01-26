package com.careerdevs.carfactory;

import com.careerdevs.Car;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //donationRequest();
        createACarObject();

    }



    public static void donationRequest() {


            Scanner read = new Scanner(System.in);

            System.out.println("Hello. We have e-mailed this form because you have expressed\n" +
                    "interest in donating your car.");

            System.out.println("");

            System.out.print("Do you still wish to continue? (Y or N): ");


            char confirmation = read.nextLine().charAt(0);


            if (Character.toLowerCase(confirmation) == 'n') {

                System.out.println("");
                System.out.println("We are sorry to hear that.\n" +
                                "If at any point you change your mind\n"+
                                "do not hesitate to reach out.");
                System.exit(0);

            }

            System.out.println("");
            System.out.print("Great! What is your legal name?: ");
            String owner = read.nextLine();

            System.out.println("");
            System.out.print("What is the make and model of the car you wish to donate?: ");


            String[] car = read.nextLine().split(" ");
            String make = car[0];
            String model = car[1];

            System.out.println("");
            System.out.println("Could you please confirm the following: " + carDonation(owner, make, model));

    }



    public static String carDonation(String owner, String make, String model){

        return "I, " + owner + ", wish to donate my " + make + " " + model + " to the Make-A-Wish foundation.";

    }

    public static void createACarObject(){

        Scanner read = new Scanner(System.in);

        System.out.println("");
        System.out.print("What is the make and model of the car you are returning?");

        String[] carReturned = read.nextLine().split(" ");
        String make = carReturned[0];
        String model = carReturned[1];

        System.out.println("");
        System.out.print("What is the current mileage on the odometer?");
        int mileage = read.nextInt();

        System.out.println("");
        System.out.print("In decimal format, roughly, what percentage of fuel is left in the tank?");
        float fuelRemaining = read.nextFloat();

        Car returnedCar = new Car(make, model, mileage, fuelRemaining);

        System.out.println("");
        System.out.println(returnedCar.toString());

    }

}
