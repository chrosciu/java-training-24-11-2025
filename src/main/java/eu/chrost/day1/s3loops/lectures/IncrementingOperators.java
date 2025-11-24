package eu.chrost.day1.s3loops.lectures;

public class IncrementingOperators {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i); 

        i = i + 1;
        System.out.println(i);

        i += 1;
        System.out.println(i);

        i++;
        System.out.println(i); //w tej chwili 4

        System.out.println(i++); //wypisz wartosc 4 i podbij do 5
        System.out.println(i); //tu oczywiscie 5

        System.out.println(++i); //podbij do 6 i wypisz 6
        System.out.println(i); //tu oczywiscie 6

        i--;
        System.out.println(i); //z powrotem 5
    }
}
