package countryfactory;

import java.text.NumberFormat;

public class Country {

    String name;
    String capital;
    long population;
    boolean isNorthernHemisphere;

    Country (String name, String capital, long population, boolean isNorthernHemisphere){

        this.name = name;
        this.capital = capital;
        this.population = population;
        this .isNorthernHemisphere = isNorthernHemisphere;
    }

    @Override

    public String toString(){

        String nameFormatted = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        NumberFormat displayFriendlyPopulation = NumberFormat.getInstance();


        if (isNorthernHemisphere){

            System.out.println("");
            return "The capital of " + nameFormatted + " is " + capital + ". " +
                    nameFormatted + " has a population of " + displayFriendlyPopulation.format(population) +
                    "\nand at least a portion of the country lies in the northern hemisphere.";

        } else {

            System.out.println("");
            return "The capital of " + nameFormatted + " is " + capital + ". " +
                    nameFormatted + " has a population of " + displayFriendlyPopulation.format(population) +
                    "\nand no portion of the country lies in the northern hemisphere.";
        }
    }

}
