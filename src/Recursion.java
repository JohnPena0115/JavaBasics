public class Recursion {

    public static void main(String[] args) {

        countdownRecursive(15);
        countdownIterative(4);
        System.out.println(sumRecursive(12));

    }

    public static void countdownRecursive(int number){

        if (number == 0) {

            System.out.println(number + "\n");

        }else {

            System.out.println(number);
            countdownRecursive(number-1);
        }
    }

    public static void countdownIterative(int number){

        while(number >= 0) {

            if(number == 0) {

                System.out.println(number + "\n");

            } else {

                System.out.println(number);

            }
            number--;

        }
    }

    public static int sumRecursive(int num) {

        if (num == 1) {

            return num;

        } else {

            return  num + sumRecursive(num - 1) ;
        }
    }
}
