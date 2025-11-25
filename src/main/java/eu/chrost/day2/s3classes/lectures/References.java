package eu.chrost.day2.s3classes.lectures;

public class References {
    public static void main(String[] args) {
        //typy primitywne - przypisanie kopiuje wartosc i tworzy nowe niezalezne miejsce w pamieci
        int x = 10;
        int y = x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //zmiana wartosci x nie wplywa na y
        x = 7;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        //typy referencyjne - przypisanie kopiuje referencje (adres w pamieci) do obiektu
        Point p1 = new Point();
        p1.x = 3.5;
        p1.y = 4.5;
        p1.print();

        //zmiana wartosci p1 wplywa na p2 poniewaz oba wskazuja na ten sam obiekt
        Point p2 = p1;
        p2.print();

        p2.x = 7.5;
        p1.print();
        p2.print();
    }
}
