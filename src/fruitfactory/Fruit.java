package fruitfactory;

public class Fruit {

    String fruitType;
    String color;
    boolean existSeedLessVariety;
    String fruitTypeFormatted;




    Fruit(String fruitType, String color, boolean existSeedLessVariety){

        this.fruitType = fruitType;
        this.color = color;
        this.existSeedLessVariety = existSeedLessVariety;
    }

    public String toString() {

        return "Fruit{" +
                "fruitType=\"" + fruitType + "\"" +
                ", color=\"" + color +  "\"" +
                ", seedLessVariety=" + existSeedLessVariety + "}";
    }


    /*
    *
    * In the future, you'll have to account for fruits
    * that end in -ch, -o, or ry.
    *
    * fruitTypeFormatted, as currently written, will not work in those instances.
    *
    * */
    public String displayString() {

        fruitTypeFormatted = Character.toUpperCase(this.fruitType.charAt(0)) + this.fruitType.substring(1);

        if (existSeedLessVariety) {

            System.out.println("");
            return  fruitTypeFormatted + "s typically have a " + color + " color and seedless varieties do exist.";

        } else {

            System.out.println("");
            return  fruitTypeFormatted + "s typically have a " + color + " color and no seedless varieties exist.";

        }
    }
}
