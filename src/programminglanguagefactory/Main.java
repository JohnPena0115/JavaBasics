package programminglanguagefactory;

public class Main {

    public static void main(String[] args) {

        ProgrammingLanguage python = new ProgrammingLanguage("python", true, "py");
        System.out.println(python.toString());

        ProgrammingLanguage haskell = new ProgrammingLanguage("haskell", false, "hs");
        System.out.println(haskell.toString());
    }
}
