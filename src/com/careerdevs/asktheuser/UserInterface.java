package com.careerdevs.asktheuser;


import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Keeps track of invalid input attempts
        //Resets after every while question block
        int failedAttempts = 0;

        //Used in conjunction with failedAttempts.
        //Assumption that 3 invalid inputs in a row
        //constitutes a lack of good faith on part of user.
        final int TROLL_CONFIRMED = 3;

//-----------------------------------------------------------------------------------------------------

        //1st Question => expected input => char
        System.out.print("Welcome to the TI-84 challenge. Are you ready to proceed? (Y or N): ");

        //Label loop identifier => allows us to break out of an outer loop
        //from within the scope of an inner loop or switch statement
        first:

        //Continuously prompts user for a char of 'Y' or 'N' until
        //one is provided or until 3 failed attempts have been recorded
        while (true) {

            String isValid = read.nextLine();

            //Null input filter
            if (isValid.length() == 0) {
                System.out.println("");
                failedAttempts++;
                if (failedAttempts != TROLL_CONFIRMED){
                    System.out.print("Please only enter 'Y' or 'N': ");
                } else {
                    System.out.println("You have committed a David. Hal-9000 will be speaking with you.");
                    return;
                }
                 continue;
            }

            char lowerCase = Character.toLowerCase(isValid.charAt(0));

            //Filters for strings with a length greater than one, numbers,
            //and chars that are not a lower or uppercase 'Y' or 'N'
            if (isValid.length() > 1 ||
                    Character.isDigit(isValid.charAt(0)) ||
                    lowerCase != 'y' && lowerCase != 'n' ) {

                failedAttempts++;
                if (failedAttempts != 3) {
                    System.out.println("");
                    System.out.print("Please only enter 'Y' or 'N': ");
                } else {
                    System.out.println("");
                    System.out.println("You have committed a David. Hal-9000 will be speaking with you.");
                    return;
                }
            }else{

                switch (lowerCase) {
                    case 'n':

                        System.out.println("");
                        System.out.println("""
                                This mission is too important for me to allow you\s
                                to jeopardize it. The floor hatch will open soon.
                                Safe travels.
                                """);
                        return;
                    default:

                        System.out.println("");
                        System.out.println("""
                                Great! I can see you have great enthusiasm and confidence
                                in the mission. Let's proceed forward.  
                                """);

                        break first;
                }
            }
        }

//----------------------------------------------------------------------------------------

        //Resets failedAttempts to 0 to allow for honest mistakes.
        failedAttempts = 0;

        //2nd Question => expected input => string
        System.out.print("What is your name?: ");

        String isNameValid = read.nextLine();

        second:

        //Screens for invalid input. If detected, reprompts user
        //until 3 failed attempts have been recorded
        while (true){

            //Null Filter
            if (isNameValid.length() == 0) {
                System.out.println("");
                failedAttempts++;
                if (failedAttempts != TROLL_CONFIRMED){
                    System.out.print("""
                                You seem to have pressed enter without typing anything out.
                                """);
                    System.out.print("Please enter your name: ");
                    isNameValid = read.nextLine();
                    continue;
                } else {
                    System.out.println("You have committed a David. Hal-9000 will be speaking with you.");
                    return;
                }
            }

            //Screens for non-alphabetic characters
            for (int index = 0; index < isNameValid.length(); index++){

                if (!(isNameValid.charAt(index) >= 'a' && isNameValid.charAt(index) <= 'z'||
                    isNameValid.charAt(index) >= 'A' && isNameValid.charAt(index) <= 'Z' ||
                    isNameValid.charAt(index) == 32) ){

                    System.out.println("");
                    failedAttempts++;

                    if (failedAttempts != TROLL_CONFIRMED) {

                        System.out.print("Please only enter alphabetic characters: ");
                        isNameValid = read.nextLine();
                        continue second;
                    } else {
                        System.out.println("You have committed a David. Hal-9000 will be speaking with you.");
                        return;
                    }
                }
            }
            //Breaks out of while loop if valid input has been received
            break;
        }
//-----------------------------------------------------------------------------------------

        System.out.println("");
        System.out.println("Please to meet you " + isNameValid.trim() + ".");

        failedAttempts = 0;

//------------------------------------------------------------------------------------------
        //3rd Question => Byte input
        System.out.println("");
        System.out.println("""
                We have been tasked to make sure you master the various primitive Java data types.\s
                However, before you can master them you must be exposed to them. We will start out\s
                very simply. 
                """);
        System.out.print("What is your age?: ");

        String isByteValid = read.nextLine();

        third:

        //Continuously screens for invalid input until 3 failed attempts have
        //been recorded. If invalid, reprompts user. If valid,
        while(true){

            //Null Filter
            if (isByteValid.length() == 0) {
                System.out.println("");
                failedAttempts++;
                if (failedAttempts != TROLL_CONFIRMED){
                    System.out.println("""
                                You seem to have pressed enter without typing anything out.
                                """);
                    System.out.print("Please enter your age: ");
                    isByteValid = read.nextLine();
                    continue;

                } else {
                    System.out.println("You have committed a David. Hal-9000 will be speaking with you.");
                    return;
                }
            }

            //Screens for non-numeric characters. Nothing is done if all
            //chars are digits.
            for (int index = 0; index < isByteValid.length(); index++){

                if (!(Character.isDigit(isByteValid.charAt((index))))){

                    failedAttempts++;
                    System.out.println("");

                    if (failedAttempts != TROLL_CONFIRMED) {

                        System.out.print("Please type in your age using only numeric characters: ");
                        isByteValid = read.nextLine();
                        continue third;

                    } else {

                        System.out.println("You have committed a David. Hal-9000 will be speaking with you.");
                        return;

                    }
                }
            }

            //If execution reaches here, isByteValid should only contain numeric chars.
            //Checks to see if the value in isByteValid can be stored in a byte.
           if (Integer.parseInt(isByteValid) > 127){

               failedAttempts++;

                if (failedAttempts != TROLL_CONFIRMED) {

                    System.out.println("");
                    System.out.print("Something went wrong. Please retype your age: ");
                    isByteValid = read.nextLine();

                } else {

                    System.out.println("");
                    System.out.println("You have committed a David. Hal-9000 will be speaking with you.");
                    break;
                }
            }

           break;
        }

        byte age = Byte.valueOf(isByteValid);
        System.out.println("");
        System.out.println( isNameValid + ", what a wonderful time to be " + age +".");
    }
}


