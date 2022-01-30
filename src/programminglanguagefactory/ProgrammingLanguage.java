package programminglanguagefactory;

public class ProgrammingLanguage {

    String languageName;
    boolean hasOOPFunctionality;
    String fileExtension;



    ProgrammingLanguage(String languageName, boolean hasOOPFunctionality, String fileExtension) {

        this.languageName = languageName;
        this.hasOOPFunctionality = hasOOPFunctionality;
        this.fileExtension = fileExtension;

    }

    @Override

    public String toString() {
        String nameFormatted = Character.toLowerCase(languageName.charAt(0)) + languageName.substring(1);

        return "ProgrammingLanguage{" +
                "name=\"" + nameFormatted + "\"" +
                ", oopFunctionality=" + hasOOPFunctionality +
                ", fileExtension=\"" + fileExtension + "\"" + "}" ;
    }


    public String displayString() {
        String nameFormatted = Character.toUpperCase(languageName.charAt(0)) + languageName.substring(1);

        if(hasOOPFunctionality){

            System.out.println("");
            return nameFormatted + " has object oriented features " +
                    "and has a ." + fileExtension + " file extension.";

        } else{

            System.out.println("");
            return  nameFormatted + " does not have object oriented functionality. " +
                    nameFormatted + " has a ." + fileExtension + " file extension.";

        }

    }
}
