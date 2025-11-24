package eu.chrost.day1.s3loops.lectures;

public class DoWhile {
    public static void main(String[] args) {
        //zalozenie - chcemy wypisac na ekran liczby od 1 do 10
        int i = 1;

        do { 
            System.out.println(i++);
        } while (i <= 10);

        int j = 100;

        do { 
            System.out.println(j++);
        } while (j <= 10);
    }
}
