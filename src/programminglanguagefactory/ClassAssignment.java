package programminglanguagefactory;

import java.util.Scanner;

public class ClassAssignment {

    public static void main(String[] args) {

        createAProgrammingLanguageObject();

    }

    public static void createAProgrammingLanguageObject() {

        Scanner read = new Scanner(System.in);

        System.out.println("");
        System.out.print("What is your favorite programming language to write code in?: ");
        String favoritePL = read.nextLine();

        System.out.println("");
        System.out.print("Could you write object oriented code in this language(true or false): ");
        boolean oopFeatures = read.nextBoolean();
        read.nextLine();

        System.out.println("");
        System.out.print("What is the file extension for your favorite programming language?\n" +
                "Do not include the dot. :");
        String fileExtension = read.nextLine();

        ProgrammingLanguage object = new ProgrammingLanguage(favoritePL, oopFeatures, fileExtension);
        System.out.println("");
        System.out.println(object.toString());
    }
}
