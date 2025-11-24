package eu.chrost.day1.s1variables.lectures;

public class IntegerVariables {
    public static void main(String[] args) {
        int i = 123;
        System.out.println(i);

        int j = 0;
        System.out.println(j);

        int a = 30;
        int b = 20;

        int sum = a + b;
        System.out.println(sum);

        int diff = a - b;
        System.out.println(diff);

        int product = a * b;
        System.out.println(product);

        int quotient = a / b;
        System.out.println(quotient);

        int bigA = 1000000;
        int bigB = 1_000_000;

        int bigProduct = bigA * bigB;
        System.out.println(bigProduct);

        //long longBigB = (long) bigB;

        /* Przyklad mnozenia z rzutowaniem typow
        - rzutowanie na typ long zalatwia sprawe */
        long longBigProduct = bigA * (long)bigB; //rzutowanie na long zalatwia sprawe
        System.out.println(longBigProduct);

        int c = 3;
        long longC = c;
        System.out.println(longC);

        long d = 5;
        //int intD = d; nie kompiluje sie - trzeba wykonac rzutowanie wprost
        int intD = (int)d;
        System.out.println(intD);

        long e = 5l;
    }
}
