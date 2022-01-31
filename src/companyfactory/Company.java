package companyfactory;

import java.text.NumberFormat;

public class Company {

     String name;
     short yearEstablished;
     long marketCap;

     Company (String name, short yearEstablished, long marketCap) {

         this.name = name;
         this.yearEstablished = yearEstablished;
         this.marketCap = marketCap;
     }

     @Override

     public String toString(){

         String nameFormatted = Character.toLowerCase(name.charAt(0)) + name.substring(1);
         NumberFormat humanFriendlyMarketCap = NumberFormat.getInstance();

         return "Company{" +
                 "name=\""+ nameFormatted + "\"" +
                 ", founded=" + yearEstablished +
                 ", marketCap=" + humanFriendlyMarketCap.format(marketCap) +
                 "}";
     }

    public String displayString() {

         String nameFormatted = Character.toUpperCase(name.charAt(0)) + name.substring(1);
         NumberFormat displayFriendlyMarketCap = NumberFormat.getInstance();

         System.out.println("");
         return nameFormatted + " has a market cap of " + displayFriendlyMarketCap.format(marketCap) + ". It was founded in "
                 + yearEstablished + ".";


     }
}
