package eu.chrost.day1.s2instructions;

public class Switch {
    public static void main(String[] args) {
        int i = 29;
        int remainderByThree = i % 3;
        
        if (remainderByThree == 0) {
            System.out.println("i podzielne przez 3");
        } else if (remainderByThree == 1) {
            System.out.println("i podzielone przez 3 daje reszte 1");
        } else {
            System.out.println("i podzielone przez 3 daje reszte 2");
        }

        switch (remainderByThree) {
            case 0 -> System.out.println("i podzielne przez 3");
            case 1 -> System.out.println("i podzielone przez 3 daje reszte 1");
            case 2 -> System.out.println("i podzielone przez 3 daje reszte 2");
            //wersja alternatywna - wykonywana wtedy gdy nie pasuje zadna z poprzednich galezi
            default -> System.out.println("i podzielone przez 3 daje reszte 2");
        }

        switch (remainderByThree) {
            case 0 -> {
                System.out.println("i podzielne przez 3");
                System.out.println("druga instrukcja");
            }
            case 1 -> System.out.println("i podzielone przez 3 daje reszte 1");            
            default -> System.out.println("i podzielone przez 3 daje reszte 2");
        }

        //starsza wersja - dzialajaca w kazdej wersji Javy (nowsza dziala od 13 w gore)
        //obecnie niezalecana - mniejsza czytelnosc + pulapki zwiazane z instrukcja break
        switch (remainderByThree) {
            case 0: 
                System.out.println("i podzielne przez 3");
                //przy braku instrukcji break wykona sie rowniez kod z kolejnej galezi !
                break;
            case 1:
                System.out.println("i podzielone przez 3 daje reszte 1");
                break;                
            case 2:
                System.out.println("i podzielone przez 3 daje reszte 2");            
        }

        String remainderAsString = switch (remainderByThree) {
            case 0 -> {
                System.out.println("Dodatkowa instrukcja");
                //yield pozwala zwrocic wartosc z wielolinijkowego bloku
                yield "ZERO";
            }
            case 1 -> "ONE";
            //tu default jest obowiazkowy aby pokryc wszystkie wartosci
            default -> "TWO";
        };
        System.out.println(remainderAsString);

    }
}
