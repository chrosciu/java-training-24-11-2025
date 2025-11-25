package eu.chrost.day2.s2methods.lectures;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        int[] intArray = {3, 4, 7};

        int newElement = 9;
        int[] extendedArray = appendToArray(intArray, newElement);
        System.out.println(Arrays.toString(extendedArray));

        int anotherNewElement = 12;
        int[] furtherExtendedArray = appendToArray(extendedArray, anotherNewElement);
        System.out.println(Arrays.toString(furtherExtendedArray));
    }

    public static int[] appendToArray(int[] existingArray, int elementToAppend) {
        if (existingArray.length == 0) {
            return new int[]{elementToAppend};
        }

        int[] newArray = new int[existingArray.length + 1];
        System.arraycopy(existingArray, 0, newArray, 0, existingArray.length);
        newArray[existingArray.length] = elementToAppend;
        return newArray;
    }
}
