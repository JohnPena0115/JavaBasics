package fruitfactory;

public class Play {

    public static void main(String[] args) {

        Fruit apple = new Fruit("apple", "red", true);
        System.out.println(apple.displayString());

        Fruit watermelon = new Fruit("watermelon", "light green", true);
        System.out.println(watermelon.displayString());

    }
}
