package javadsa.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        System.out.println(11/ 2);

        mergeSort(intArray, 0, intArray.length);

        System.out.println(Arrays.toString(intArray));
    }

    //{ 20, 35, -15, 7, 55, 1, -22};
    public static void mergeSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;

        //sorting left
        mergeSort(input, start, mid);

        /**
         * Just the first left:
         * 1. mergeSort(input, 0, 3);
         * mid = 1
         * LEFT mergeSort(input, 0, 1); returns; (20)
         * RIGHT mergeSort(input, 1, 3); for (35, -15)
         * mid = 2
         * LEFT mergeSort(input, 1, 2); returns; (35)
         * RIGHT mergeSort(input, 2, 3); returns; (-15)
         * merge(input, 1, 2, 3); for the -15 and 35
         * merge(input, 0, 1, 3); for merging 20 with (-15, 35);
        **/
        //sorting right
        mergeSort(input, mid, end);
        /**
         * Just the right:
         * 1. mergeSort(input, 3, 7);
         * mid = 5
         * LEFT mergeSort(input, 3, 5);
         * mid = 4
         * LEFT mergeSort(input, 3, 4); returns; (7)
         * RIGHT mergeSort(input, 4, 5); returns; (55)
         * merge(input, 3, 4, 5); for the 7, 55
         * Right mergeSort(input, 5, 7);
         * mid = 6
         * LEFT mergeSort(input, 5, 6); returns (1);
         * RIGHT mergeSort(input, 6, 7); returns (-22);
         * merge (input, 5, 6, 7); for -22, 1
         * merge (input, 3, 5, 7); for (7, 55) + (-22, 1)
         */

        /**
         * for the final
         *
         * merge (input, 0, 3, 7); for merging final
         */


        //merge
        merge(input, start, mid, end);


    }

    public static void merge(int[] input, int start, int mid, int end) {
        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;

        int tempIndex = 0;
        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        System.arraycopy(input, i , input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
