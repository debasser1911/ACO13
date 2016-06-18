package week4;

import week3.day2.MyLinkedList.MyLinkedList;

import java.util.List;

/**
 * Created by DeBasser on 18.06.2016.
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        List list = new MyLinkedList();
        list.add(5);

        int expected = 1;
        int actual = list.size();
        boolean result = actual == expected;
        System.out.printf("Method add, result %s, actual -%d", result, actual, expected);


        list.get(15);

        int expected2 = 5;
        int actual2 = (Integer) list.get(3);
        result = actual == expected;
        System.out.printf("Method add, result %s, actual -%d", result, actual, expected);
    }


}
