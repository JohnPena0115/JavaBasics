package com.careerdevs.asktheuser;

import java.text.NumberFormat;
import java.util.Scanner;

public class UserInterface {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        NumberFormat input = NumberFormat.getInstance();

        System.out.println("");
        System.out.print("What is your name?: ");
        String name = read.nextLine();

        System.out.println("");
        System.out.print("Welcome, " + name + ". Are you ready to proceed forward (Y or N)?: ");
        char charConfirmation = read.next().charAt(0);

        if (charConfirmation == 'Y') {

            System.out.println("");
            System.out.println("Great, let's proceed forward " + name + ".");

        } else {

            System.out.println("");
            System.out.println("Sorry to hear that " + name + ". Have a nice day.");
        }

        System.out.println("");
        System.out.println(name + ", the following is just a series of questions meant to expose\n"+
                "you to Java primitive types. Your first question, down below will deal\n" +
                "with the primitive boolean.");
        System.out.println("");
        System.out.print("Is 0 an even or odd number(true or false)? :");
        boolean booleanResponse = read.nextBoolean();

        if(booleanResponse){

            System.out.println("");
            System.out.println("Incorrect. 0 is neither even or odd. Nevertheless, you typed a\n"+
                    "value, 'true', that could be stored as a boolean. The only other value\n" +
                    "could be stored as a boolean is 'false.");
        } else {

            System.out.println("");
            System.out.println("Correct. O is neither even or odd so 'false' is the correct\n" +
                    "answer. The keyword false can be stored as a boolean. The only\n" +
                    "other keyword that could be stored as a boolean is 'true'.");
        }

        System.out.println("");
        System.out.print("Let's proceed on to the byte primitive type. Type a number\n" +
                "anywhere from -128 to 127: ");
        byte byteResponse = read.nextByte();
        read.nextLine();
        System.out.println("");
        System.out.println("Great, the number you provided, " +byteResponse + ", can be stored as a\n" +
                "byte. Any number smaller than -128 or greater than 127\n"  +
                "would have thrown a 'value out of range' exception.");

        System.out.println("");
        System.out.print("Let's tackle the 'short' primitive data type. Pick a\n" +
                "anywhere from -32,000 to 32,000: ");
        short shortResponse = read.nextShort();
        read.nextLine();
        System.out.println("");
        System.out.println("Great, the number you provided, " + input.format(shortResponse) + ", can be stored as a\n" +
                "short. Actually, short's can store slightly larger and smaller numbers than the ones\n" +
                "I provided you with. Any number equal to or larger than -32,768 and equal to or smaller\n" +
                "than 32,767 could be stored as a valid short. The Java compiler would throw an exception\n" +
                "if you tried to assign values outside of that range to a short variable.");

        System.out.println("");
        System.out.print("Just as a short can store larger whole numbers than a byte, an int, another\n" +
                "Java primitive data type, can store larger whole numbers than a short. The\n" +
                "largest value a int can hold is " + input.format(Integer.MAX_VALUE)+ "." + " Based on the pattern\n" +
                "you have seen so far, what would you say is the smallest value an int can store?: ");
        int intResponse = read.nextInt();
        read.nextLine();
        System.out.println("");

        if (intResponse != Integer.MIN_VALUE) {

            System.out.println("Not quite. Based on the pattern we have seen so far in order\n" +
                    "to get the smallest value an int could store we would add 1\n" +
                    "to the max possible value an int could store and negate that result.\n" +
                    "The correct response for int would be " + input.format(Integer.MIN_VALUE) + ".");
        }else{

            System.out.println("Great job. You saw the pattern of adding 1 to " + input.format(Integer.MAX_VALUE)  +
                    "\nand then negating that result => " + input.format(Integer.MIN_VALUE) + ".");
        }

        System.out.println("");
        System.out.print("Let's tackle the last primitive data type that deals with whole numbers => long.\n" +
                "This time instead of giving the max value a 'long' could hold and asking you\n" +
                "to figure out the min value, I will give the min value " + input.format(Long.MIN_VALUE)+ "\n" +
                "and ask you to figure out the max value: ");
        long longResponse = read.nextLong();
        read.nextLine();
        System.out.println("");

        if (longResponse != Long.MAX_VALUE) {

            System.out.println("Not quite. This time you needed to take the absolute value of adding\n" +
                    "1 to " + input.format(Long.MIN_VALUE) + ".\n\n" + input.format(Long.MAX_VALUE) + " would have been the correct answer.");
        } else {

            System.out.println(input.format(Long.MAX_VALUE) + " is indeed the write answer.\n" +
                    "Congratulations on picking up on the pattern.");
        }

        System.out.println("");
        System.out.println("Let's move away from storing whole numbers and look at how we could store\n" +
                "decimal numbers in Java. Though a float can store the decimal 3.4028235 followed by\n" +
                "38 zeroes, it's accuracy only extends to 6 or 7 digits. If you multiplied the constant pi\n" +
                "by 2 in Java you would get '6.2831855'. Type out the number you get when you google\n" +
                "'pi * 2' to see the difference in accuracy: ");
        float floatResponse = read.nextFloat();
        read.nextLine();
        System.out.println("");

        if(floatResponse == 6.2831853) {

            System.out.println("Great job. Your google-fu is strong.");

        } else {

            System.out.println("Not quite. 6.2831853 would have been the  correct answer.");

        }
    }
}
