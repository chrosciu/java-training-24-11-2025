package eu.chrost.day5.autoboxing;

public class Main {
    public static void main(String[] args) {
        double primitiveDouble = 10.5;

        Double wrapperDouble = primitiveDouble; //autoboxing
        //mozna tez tak, ale jest to mniej wygodne
        //Double wrapperDouble = Double.valueOf(primitiveDouble); //autoboxing

        double anotherPrimitiveDouble = wrapperDouble; //unboxing
        //mozna tez tak, ale jest to mniej wygodne
        //double anotherPrimitiveDouble = wrapperDouble.doubleValue(); //unboxing

        Double nullDouble = null;
        double test = nullDouble; //unboxing - rzuci NullPointerException

        //double <-> Double
        //long <-> Long
        //boolean <-> Boolean
        //int <-> Integer //wyjatek !
        //char <-> Character //wyjatek !
    }
}
