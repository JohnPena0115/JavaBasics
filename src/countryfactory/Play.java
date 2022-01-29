package countryfactory;

public class Play {

    public static void main(String[] args) {

        Country ecuador = new Country("ecuador", "Quito", 2_011_000, true);
        System.out.println(ecuador.toString());

        Country australia = new Country("australia", "Canberra", 25_690_000, false);
        System.out.println(australia.toString());

    }
}
