package eu.chrost.day1.s1variables.lectures;

public class FloatingVariables {
    public static void main(String[] args) {
        double d = 0.5;
        System.out.println(d);

        //nie kompiluje sie - utrata wartosci 
        //int i = 0.5;

        double a = 1;
        double b = 3;

        double quotient = a / b;
        System.out.println(quotient);

        int intA = 1;
        int intB = 3;

        double quotientOfInt = intA / intB;
        System.out.println(quotientOfInt);

        double quotientOfConvertedInt = intA / (double)intB;
        System.out.println(quotientOfConvertedInt);

        double quotientOfLiterals = 1 / 3;
        System.out.println(quotientOfLiterals); 

        quotientOfLiterals = 1 / 3.0;
        System.out.println(quotientOfLiterals);

        quotientOfLiterals = 1 / 3d;
        System.out.println(quotientOfLiterals);
    }
}
