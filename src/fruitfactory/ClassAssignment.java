package fruitfactory;

import java.util.Scanner;

public class ClassAssignment {

    public static void main(String[] args) {

        createAFruitObject();

    }

    public static void createAFruitObject(){

        Scanner read = new Scanner(System.in);

        System.out.println("");
        System.out.print("What is your favorite fruit?\n" +
                "Please type the singular form.\n" +
                "For example, 'apple' as oppose to 'apples': ");
        String fruit = read.nextLine();

        System.out.println("");
        System.out.print("What color does your favorite fruit typically have?: ");
        String fruitColor = read.nextLine();

        System.out.println("");
        System.out.print("To the best of your knowledge, does your favorite fruit\n"+
                    "have a seedless variety (true or false)?: ");
        boolean canBeSeedless = read.nextBoolean();

        Fruit fruitObject = new Fruit(fruit, fruitColor, canBeSeedless);

        System.out.println("");
        System.out.println(fruitObject.toString());
    }
}
