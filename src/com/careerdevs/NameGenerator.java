package com.careerdevs;

public class NameGenerator {

    String firstName;
    String lastName;

    NameGenerator(String firstName, String lastName){

        this.firstName = firstName;
        this.lastName = lastName;

    }

    public String generateFullName () {

        return this.firstName + " " + this.lastName;
    }

    public static String generateFullName (String firstName, String lastName){

        return firstName + " " + lastName;

    }
}
