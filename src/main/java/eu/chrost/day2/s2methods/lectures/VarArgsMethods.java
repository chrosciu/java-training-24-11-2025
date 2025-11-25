package eu.chrost.day2.s2methods.lectures;

public class VarArgsMethods {
    public static void main(String[] args) {
        System.out.println(sum(1, 4, 7));
        System.out.println(sum());
        System.out.println(sumWithPrefix("Sum is: ", 2, 3, 5));
    }

    public static int sum(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    public static String sumWithPrefix(String prefix, int... values) {
        int sum = sum(values);
        return prefix + sum;
    }
}
