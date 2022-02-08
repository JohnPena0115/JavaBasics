public class Recursion {

    public static void main(String[] args) {

        countdownRecursive(15);
        countdownIterative(4);

    }

    public static void countdownRecursive(int number){

        if (number == 0) {

            System.out.println(number + "\n");
            return;

        }else {

            System.out.println(number);
            countdownRecursive(number-1);
        }
    }

    public static void countdownIterative(int number){

        while(number >= 0) {

            if(number == 0) {

                System.out.println(number + "\n");
                number--;

            } else {

                System.out.println(number);
                number--;

            }

        }
    }
}
