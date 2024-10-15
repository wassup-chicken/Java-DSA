package javadsa.countingsort;

import java.util.Arrays;

public class CountingSort {

    public static void main(String[] args) {
        int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3, 10, 10, 10, 10, 10};
        //only use when range is reasonable - not too large
        //data set is reasonable size
        countingSort(intArray, 1, 10);
        System.out.println(Arrays.toString(intArray));

    }

    public static void countingSort (int[] input, int min, int max) {
        int[] countArray = new int[(max - min) + 1];

        for (int i = 0; i < input.length; i++) {
            countArray[input[i] - min] += 1;
        }

        System.out.println("CountArray: " + Arrays.toString(countArray));

        int j = 0;
        for (int i = min; i <= max; i++) {
            while (countArray[i - min] > 0) {
                input[j++] = i;
                //decrement after updating inputArray
                countArray[i - min] -= 1;
            }
        }

    }
}
