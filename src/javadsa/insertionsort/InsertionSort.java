package javadsa.insertionsort;

import java.util.Arrays;

public class InsertionSort {

    public static void lectureImplementation() {

        int[] intArray = {20, 35, -15, 7, 55, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i - 1] > newElement; i--) {
                intArray[i] = intArray[i - 1];
            }

            intArray[i] = newElement;
        }
    }
    public static void main (String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1, -22};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++) {
            int newElement = intArray[firstUnsortedIndex];

            for (int i = firstUnsortedIndex - 1; i >= 0; i--) {
                if (newElement <= intArray[i]) {
                    intArray[i + 1] = intArray[i];
                    intArray[i] = newElement;
                }
            }
        }
        System.out.println(Arrays.toString(intArray));


    }
}
