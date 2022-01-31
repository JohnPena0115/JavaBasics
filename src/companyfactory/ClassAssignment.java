package companyfactory;

import java.util.Scanner;

public class ClassAssignment {

    public static void main(String[] args) {

        createACompanyObject();

    }

    public static void createACompanyObject(){

        Scanner read = new Scanner(System.in);

        System.out.println("");
        System.out.print("Type out the name of the first company that comes to mind?: ");
        String companyName = read.nextLine();

        System.out.println("");
        System.out.print("When was " + companyName + " founded?: " );
        short yearFounded = read.nextShort();
        read.nextLine();

        System.out.println("");
        System.out.print("What is " + companyName + "'s market cap? If your company's market cap\n" +
                "is 100M type out 100,000,000 as opposed to 100M or 100 million: ");
        long marketCap = read.nextLong();

        Company object = new Company(companyName,yearFounded,marketCap);

        System.out.println("");
        System.out.println(object.toString());
    }
}
