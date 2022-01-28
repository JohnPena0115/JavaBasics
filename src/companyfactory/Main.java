package companyfactory;

public class Main {

    public static void main(String[] args) {

        Company google = new Company("google", (short)1998, 1_714_000_000_000L);
        System.out.println(google.toString());


    }
}
