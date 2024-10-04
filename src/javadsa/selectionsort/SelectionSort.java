package javadsa.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] intArray = {20, 35, -15, 7, 55, 1 -22};


        for (int unsortedIndex = intArray.length - 1; unsortedIndex >= 0; unsortedIndex-- ) {

            int largest = 0;
            for (int i = 1; i <= unsortedIndex; i++) {
                   if (intArray[i] > intArray[largest]) {
                       largest = i;
                   }
            }
            swap(intArray, largest, unsortedIndex);
        }

        System.out.println(Arrays.toString(intArray));
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
