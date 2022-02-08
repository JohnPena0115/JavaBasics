public class Recursion {

    public static void main(String[] args) {

        countDown(15);

    }

    public static void countDown(int number){

        if (number == 0) {

            System.out.println(number);
            return;

        }else {

            System.out.println(number);
            countDown(number-1);
        }
    }
}
