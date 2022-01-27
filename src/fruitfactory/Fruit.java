package fruitfactory;

public class Fruit {

    String name;
    String color;
    boolean hasSeeds;

    Fruit(String name, String color, boolean hasSeeds){

        this.name = name;
        this.color = color;
        this.hasSeeds = hasSeeds;

    }

    @Override

    public String toString() {

        if (hasSeeds) {

            System.out.println("");
            return Character.toUpperCase(name.charAt(0)) + name.substring(1) + "s typically have a "
                    + color + " color and can have seeds.";
        } else {

            System.out.println("");
            return Character.toUpperCase(name.charAt(0)) + name.substring(1) + "s typically have a "
                    + color + " color and do not have seeds.";

        }
    }
}
