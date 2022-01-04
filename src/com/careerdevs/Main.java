package com.careerdevs;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String firstName = "John";

        String lastName = "Pena";

        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        System.out.println(createFullName("Bugs", "Bunny"));
    }

    public static String createFullName(String firstName, String lastName) {

        String output = firstName + " " + lastName;

        return output;
    }
}
