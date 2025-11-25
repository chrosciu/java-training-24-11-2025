package eu.chrost.day2.s1arrays.lectures;

public class ForEach {
    public static void main(String[] args) {
        int[] predefinedArray = {3, 4, 7};

        for (int element : predefinedArray) {
            System.out.println(element);
        }

        for (var element : predefinedArray) {
            System.out.println(element);
        }
    }
}
