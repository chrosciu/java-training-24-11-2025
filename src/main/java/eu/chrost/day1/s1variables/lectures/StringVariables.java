package eu.chrost.day1.s1variables.lectures;

public class StringVariables {
    public static void main(String[] args) {
        String name = "Marcin";
        System.out.println(name);

        String surname = "Chrost";
        System.out.println(surname);

        String fullName = name + " " + surname;
        System.out.println(fullName);

        int i = 3;
        String description = "i = " + i;
        System.out.println(description);

        System.out.println("i = " + i);

        //nie kompiluje sie - nie mozna robic wprost konwersji int -> String
        //String iAsString = (String)i;
        String iAsString = Integer.toString(i);
        System.out.println(iAsString);

        String s = "4";
        //nie kompiluje sie - nie mozna robic wprost konwersji String -> int
        //int sAsInt = (int)s;
        int sAsInt = Integer.parseInt(s);
        System.out.println(sAsInt);

        String badNumber = "a";
        //kompiluje sie, ale wyrzuca wyjatek w trakcie dzialania programu
        //int badNumberAsInt = Integer.parseInt(badNumber);
    }
}