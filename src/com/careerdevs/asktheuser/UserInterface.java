package com.careerdevs.asktheuser;


import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        //Keeps track of invalid input attempts
        int failedAttempts = 0;

        //Used in conjunction with failedAttempts.
        //Assumption that 3 invalid inputs in a row
        //constitutes a lack of good faith on part of user.
        final int TROLL_CONFIRMED = 3;

        //1st Question => char input
        System.out.print("Welcome to the TI-84 challenge. Are you ready to proceed? (Y or N): ");

        //Continuously prompts user for a char of 'Y' or 'N' until
        //one is provided.
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
                    break;
                }
                continue;
            }

            char lowerCase = Character.toLowerCase(isValid.charAt(0));

            //Filters for strings with a length greater than one,
            //numbers and input that is not 'Y' or 'N'
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
                    break;
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
                        break;
                    default:

                        System.out.println("");
                        System.out.println("""
                                Great! I can see you have great enthusiasm and confidence
                                in the mission. Let's proceed forward.  
                                """);

                }

                //If program has reached this point, intended input was
                //successfully received
                break;
            }
        }

        //Resets failedAttempts to 0 to allow for honest mistakes.
        failedAttempts = 0;

        //2nd Question => String input
        System.out.print("What is your name?: ");

        //Continuously prompts user for name until one
        //is provided
        while (true){

            String isNameValid = read.nextLine();

            //Null Filter
            if (isNameValid.length() == 0) {
                System.out.println("");
                failedAttempts++;
                if (failedAttempts != TROLL_CONFIRMED){
                    System.out.print("""
                                You seem to have pressed enter without typing anything out.
                                Please enter your name: 
                                """);
                } else {
                    System.out.println("You have committed a David. Hal-9000 will be speaking with you.");
                    break;
                }
                continue;
            }

            //Screens for non-alphabetic characters
            for (int index = 0; index < isNameValid.length(); index++){

                if (!(isNameValid.charAt(index) >= 'a' && isNameValid.charAt(index) <= 'z'||
                    isNameValid.charAt(index) >= 'A' && isNameValid.charAt(index) <= 'Z' ||
                    isNameValid.charAt(index) == 32)

                ){

                    failedAttempts++;
                    System.out.println("");

                    if (failedAttempts != TROLL_CONFIRMED) {
                        System.out.print("Please enter only alphabetic characters: ");
                        continue;

                    } else {

                        System.out.println("You have committed a David. Hal-9000 will be speaking with you.");
                        break;
                    }
                }
            }

            System.out.println("");
            System.out.println("Please to meet you " + isNameValid + ".");
        }
    }
}


