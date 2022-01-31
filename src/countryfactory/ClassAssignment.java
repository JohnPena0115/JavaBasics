package countryfactory;

import java.util.Scanner;

public class ClassAssignment {

    public static void main(String[] args) {

        createACountryObject();

    }

    public static void createACountryObject() {

        Scanner read = new Scanner(System.in);

        System.out.println("");
        System.out.print("Name a country that has held your interest?: ");
        String country = read.nextLine();

        System.out.println("");
        System.out.print("What is " + country + "'s capital?:");
        String capital = read.nextLine();

        System.out.println("");
        System.out.print("What is " + country + "'s current population?\n"
                        + "Please type out the numeral form: ");
        long population = read.nextLong();
        read.nextLine();

        System.out.println("");
        System.out.print("Does any portion of " + country + "lie in\n"
                        + "the northern hemisphere?(true or false): ");
        boolean isInNorthernHemisphere = read.nextBoolean();

        Country countryObject = new Country(country, capital, population, isInNorthernHemisphere);

        System.out.println("");
        System.out.println(countryObject.toString());

    }
}
