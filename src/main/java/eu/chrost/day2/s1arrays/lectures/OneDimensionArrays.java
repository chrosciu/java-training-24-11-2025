package eu.chrost.day2.s1arrays.lectures;

import java.util.Arrays;

public class OneDimensionArrays {
    public static void main(String[] args) {
        int[] intArray = new int[5];

        intArray[0] = 1;
        intArray[1] = 3;
        intArray[2] = 6;

        int arrayLength = intArray.length;
        System.out.println("arrayLength: " + arrayLength);

        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[" + i + "] -> " + intArray[i]);
        }

        int[] predefinedArray = {3, 4, 7};

        for (int i = 0; i < predefinedArray.length; i++) {
            System.out.println("predefinedArray[" + i + "] -> " + predefinedArray[i]);
        }

        predefinedArray[1] = 6;

        for (int i = 0; i < predefinedArray.length; i++) {
            System.out.println("predefinedArray[" + i + "] -> " + predefinedArray[i]);
        }

        //wykona sie ale wypisze nieczytelny wynik
        System.out.println(predefinedArray);

        System.out.println(Arrays.toString(predefinedArray));

        String arrayAsString = Arrays.toString(predefinedArray);
        System.out.println(arrayAsString);
    }
}
