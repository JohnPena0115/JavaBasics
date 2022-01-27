package programminglanguagefactory;

public class ProgrammingLanguage {

    String name;
    boolean isObjectOriented;
    String fileExtension;


    ProgrammingLanguage(String name, boolean isObjectOriented, String fileExtension) {

        this.name = name;
        this.isObjectOriented = isObjectOriented;
        this.fileExtension = fileExtension;

    }

    @Override

    public String toString() {

        String nameFormatted = Character.toUpperCase(name.charAt(0)) + name.substring(1);
        if(isObjectOriented){

            System.out.println("");
            return nameFormatted + " has object oriented features " +
                    "and has a ." + fileExtension + " file extension.";

        } else{

            System.out.println("");
            return  nameFormatted + " does not object oriented " +
                    "functionality. " + nameFormatted + " has a ." + fileExtension +
                    " file extension.";
        }

    }
}
