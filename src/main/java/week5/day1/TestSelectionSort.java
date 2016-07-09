package week5.day1;

import utils.ArrayUtils;

import java.util.Arrays;

/**
 * Created by DeBasser on 25.06.2016.
 */
public class TestSelectionSort {
    public static void main(String[] args) {
        int[] array = ArrayUtils.createArray(20);
        ArrayUtils.selectSort(array);
        System.out.println(Arrays.toString(array));
    }
}
