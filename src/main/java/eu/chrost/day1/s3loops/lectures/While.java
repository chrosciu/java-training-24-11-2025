package eu.chrost.day1.s3loops.lectures;

public class While {
    public static void main(String[] args) {
        //zalozenie - chcemy wypisac na ekran liczby od 1 do 10
        int i = 1;

        while (i <= 10) {
            System.out.println(i++);            
        }

        int j = 100;

        while (j <= 10) {
            //to nie wykona sie nigdy
            System.out.println(j++);            
        }

        int k = 1;

        // while (k > 0) {
        //     //ta petla bedzie wykonywac sie bez konca !
        //     System.out.println(k++);            
        // }
    }
}
