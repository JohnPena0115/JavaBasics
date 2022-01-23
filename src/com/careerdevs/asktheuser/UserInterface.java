package com.careerdevs.asktheuser;


import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        int failedAttempts = 0;

        System.out.print("Welcome to the TI-84 challenge. Are you ready to proceed? (Y or N): ");


        while (true) {

            String isValid = read.nextLine();

            if (isValid.length() == 0) {
                System.out.println("");
                failedAttempts++;
                if (failedAttempts != 3){
                    System.out.println("Please only enter 'Y' or 'N': ");
                } else {
                    System.out.println("You have committed a David. Hal-9000 will be speaking with you.");
                    break;
                }
                continue;
            }

            char lowerCase = Character.toLowerCase(isValid.charAt(0));

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

                if (Character.toLowerCase(lowerCase) == 'y') {

                    System.out.println("");
                    System.out.println("""
                        Great! I can see you have great enthusiasm and confidence
                        in the mission. Let's proceed forward.""");
                    break;
                } else if (Character.toLowerCase(lowerCase) == 'n') {

                    System.out.println("");
                    System.out.println("""
                        This mission is too important for me to allow you to
                        to jeopardize it. The floor hatch will open soon.
                        Safe travels.""");
                    break;
                }
            }
        }
    }
}
