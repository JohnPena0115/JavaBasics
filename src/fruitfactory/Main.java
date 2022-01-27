package fruitfactory;

public class Main {

    public static void main(String[] args) {

        Fruit apple = new Fruit("apple", "red", true);
        System.out.println(apple.toString());

        Fruit watermelon = new Fruit("watermelon", "light green", true);
        System.out.println(watermelon.toString());

    }
}
