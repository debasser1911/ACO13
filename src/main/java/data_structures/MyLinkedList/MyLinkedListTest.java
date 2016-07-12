package data_structures.MyLinkedList;

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
        list.add(20);

        for (Object o : list) {
            System.out.println(o);

        }

        expected = 5;
        actual = (Integer) list.get(0);
        result = actual == expected;

        System.out.printf("Method add, result %s, actual -%d", result, actual, expected);


        expected = 5;
        actual = (Integer) list.remove(0);
        result = actual == expected;

        System.out.printf("Method add, result %s, actual -%d", result, actual, expected);
    }


}
