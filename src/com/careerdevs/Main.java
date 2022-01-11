package com.careerdevs;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        String firstName = "John";
//
//        String lastName = "Pena";
//
//        String fullName = firstName + " " + lastName;
//
//        System.out.println(fullName);
//
//        System.out.println(createFullName("Bugs", "Bunny"));
//
//        System.out.println(NameGenerator.generateFullName("Daffy", "Duck"));
//
//        NameGenerator testing = new NameGenerator("Charlie", "Brown");
//
//        String output = testing.generateFullName();
//
//        System.out.println(output);

        Car exampleChevy = new Car("Camaro","Chevy", 10_000, .10f);
        Car exampleFord = new Car("Mustang","Ford", 30_000, .50f);
        Car exampleDodge = new Car("Hellcat", "Dodge", 100, .90f);

        Car[] cars = {exampleChevy, exampleFord, exampleDodge};

        for (int i = 0; i < cars.length; i++){

            System.out.println(cars[i].model + " " + cars[i].make);

        }

        // System.out.println(Arrays.toString(numbers));
    }



//    public static String createFullName(String firstName, String lastName) {
//
//        String output = firstName + " " + lastName;
//
//        return output;
//    }

}
