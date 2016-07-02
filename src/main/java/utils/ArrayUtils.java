package utils;

/**
 * Created by DeBasser on 22.05.2016.
 */
public class ArrayUtils {
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] createArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = (int) (Math.random() * 1000);
        }
        return array;
    }

    public static void selectSort(int[] array){
        if(array == null || array.length <=1) return;;
        for (int i = 0; i < array.length ; i++) {
            int idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[idx]){
                    idx = j;
                }

            }
            int tmp = array[i];
            array[i] = array[idx];
            array[idx] = tmp;

        }
    }
    public static void isertSort(int[] array) {
    }
/*    public static void bubbleSort(int[] array){
        if(array == null || array.length <=1) return;;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if(array[j] > array[j + i]);
            }
        }*/
    }
