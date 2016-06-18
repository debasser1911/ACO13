package week4;

import java.util.Arrays;

/**
 * Created by DeBasser on 18.06.2016.
 */
public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {3, 6, 2, 6, 4, 5, 8, 7, 5, 5, 7};
        long start = System.currentTimeMillis();
        long finish = System.currentTimeMillis();
        System.out.printf("LineSearch -%d ms", finish - start);
        boolean isContains = contains(array, 8);

        Arrays.sort(array);
        int[] sortedArray = array;

        boolean isContains2 = binarySearch(sortedArray, 8);
        System.out.printf("BinarySearch -%d ms", finish - start);
    }

    private static boolean binarySearch(int[] sortedArray, int number) {
        int start = 0;
        int end = sortedArray.length - 1;

        while (start != end) {
            int middle = start + (end - start) / 2;
            if (sortedArray[middle] < number) {
                end = middle + 1;
            } else if (sortedArray[middle] > number) {
                end = middle - 1;
            } else {
                return true;
            }
        }
        return true;
    }


    private static boolean contains(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) return true;
        }
        return false;
    }
}

