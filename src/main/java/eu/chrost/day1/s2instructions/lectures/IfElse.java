package eu.chrost.day1.s2instructions.lectures;

public class IfElse {

    public static void main(String[] args) {
        int i = 3;

        if (i < 5) {
            System.out.println("i jest mniejsze niz 5");
        } else {
            //ta czesc nie jest obowiazkowa - else jest opcjonalne
            System.out.println("i jest wieksze lub rowne 5");
        }

        i = 29;

        if (i < 10)
            System.out.println("i jest mniejsze niz 10");        
            System.out.println("i jest mniejsze niz 20"); //uwaga - to nie jest czesc if-a i wykona sie zawsze !

        
        //dzielenie z reszta
        int remainder = 7 % 3;
        System.out.println("Reszta z dzielenia 7 przez 3 to: " + remainder);  
        
        //operator porownania + dzielenie z reszta = sprawdzenie parzystosci :)
        if (i % 2 == 0) {
            System.out.println("i jest parzyste");
        } else {
            System.out.println("i jest nieparzyste");
        }

        if (i % 3 == 0) {
            System.out.println("i podzielne przez 3");
        } else {
            if (i % 3 == 1) {
                System.out.println("i podzielone przez 3 daje reszte 1");
            } else {
                System.out.println("i podzielone przez 3 daje reszte 2");
            }            
        }

        if (i % 3 == 0) {
            System.out.println("i podzielne przez 3");
        } else if (i % 3 == 1) {
            System.out.println("i podzielone przez 3 daje reszte 1");
        } else {
            System.out.println("i podzielone przez 3 daje reszte 2");
        }
        
        if (i % 4 == 0) {
            System.out.println("i podzielne przez 4");
        } else if (i % 4 == 1) {
            System.out.println("i podzielone przez 4 daje reszte 1");
        } else if (i % 4 == 2) {
            System.out.println("i podzielone przez 4 daje reszte 2");    
        } else {
            System.out.println("i podzielone przez 4 daje reszte 3");
        }

        if (i % 2 != 0) {
            System.out.println("i jest nieparzyste");
        }

        if (i >= 10) {
            System.out.println("i jest wieksze badz rowne 10");
        }
        
    }
}
