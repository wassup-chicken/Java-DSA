package javadsa.quicksort;

import java.util.Arrays;

public class QuickSort {

    public static void main(String[] args) {
        int[] intArray = { 20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);
        System.out.println(Arrays.toString(intArray));

    }

    public static void quickSort(int[] input, int start, int end) {
        if (end - start < 2) {
            return;
        }

        int pivotIndex = partition(input, start, end);

        quickSort(input, start, pivotIndex);
        quickSort(input, pivotIndex + 1, end);

    }

    //{ 20, 35, -15, 7, 55, 1, -22};
    public static int partition(int[] input, int start, int end) {
        //This is using the first element as the first

        int pivot = input[start]; //20
        int i = start; //0
        int j = end; //7

        while (i < j) {

            // Empty loop body; handles right side traversal
            //this loop breaks when the right side element is less than pivot
            while (i < j && input[--j] >= pivot);
            //prefix decrement = decrement J and use the result as the index

            if (i < j) {
                input[i] = input[j];
            }
            // Empty loop body; handles the left side traversal
            // this loop breaks when the left side element is greater than pivot
            while (i < j && input[++i] <= pivot);
            //increment first
            if (i < j) {
                input[j] = input[i];
            }

        }
        input[i] = pivot;
        return i;
    }
}
