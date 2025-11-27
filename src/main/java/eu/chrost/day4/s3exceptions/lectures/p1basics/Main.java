package eu.chrost.day4.s3exceptions.lectures.p1basics;

public class Main {
    public static void main(String[] args) {
        String s = "abc";
        try {
            int i = getIntNumberFromString(s);
            System.out.println(i);
        } catch (NumberFormatException e) {
            System.out.println("String could not be parsed");
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static int getIntNumberFromString(String s) {
        return Integer.parseInt(s);
    }
}
