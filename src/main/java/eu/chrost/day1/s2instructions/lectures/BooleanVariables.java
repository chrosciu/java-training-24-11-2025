package eu.chrost.day1.s2instructions.lectures;

public class BooleanVariables {
    public static void main(String[] args) {
        boolean aTrue = true;
        boolean aFalse = false;

        System.out.println(aTrue);

        boolean aNotTrue = !aTrue;
        System.out.println(aNotTrue);

        int i = 9;

        boolean isEven = (i % 2 == 0);

        boolean isDivisibleByThree = (i % 3 == 0);

        if (isEven) {
            System.out.println("i jest parzyste");
        } else {
            System.out.println("i jest nieparzyste");
        }

        if (isDivisibleByThree) {
            System.out.println("i jest podzielne przez 3");
        } else {
            System.out.println("i jest niepodzielne przez 3");
        }

        boolean isDivisibleByTwoOrThree = isEven || isDivisibleByThree; //ta wersja nie sprawdza drugiego warunku gdzy pierwszy jest prawdziwy
        isDivisibleByTwoOrThree = isEven | isDivisibleByThree; //ta wersja sprawdza oba warunki

        if (isDivisibleByTwoOrThree) {
            System.out.println("i jest podzielne przez 2 lub przez 3");
        } else {
            System.out.println("i jest niepodzielne ani przez 2 ani przez 3");
        }

        boolean isDivisibleByTwoAndThree = isEven && isDivisibleByThree; //ta wersja nie sprawdza drugiego warunku gdzy pierwszy jest falszywy
        isDivisibleByTwoAndThree =   isEven & isDivisibleByThree; //ta wersja sprawdza oba warunki

        if (isDivisibleByTwoAndThree) {
            System.out.println("i jest podzielne przez 2 i przez 3");
        } else {
            System.out.println("i jest niepodzielne albo 2 albo przez 3");
        }

        if ((i % 2 == 0) && (i % 3 == 0)) {
            System.out.println("i jest podzielne przez 2 i przez 3");
        } else {
            System.out.println("i jest niepodzielne albo 2 albo przez 3");
        }

        //poprawne ale malo czytelne - lepiej jest odwrocic kolejnosc if/else aby nie bylo negacji
        if (!isEven) {
            //
        } else {
            //
        }

    }
}
