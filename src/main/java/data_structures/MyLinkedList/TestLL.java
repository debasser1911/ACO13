package data_structures.MyLinkedList;

/**
 * Created by Andrey on 12.07.2016.
 */
public class TestLL {
    public static void main(String[] args) {
        MyLinkedList<String> myll = new MyLinkedList<>();
        myll.add("A");
        myll.add("B");
        myll.add("C");
        myll.add("D");
        myll.add("E");
        myll.add("F");
        System.out.println(myll.get(0));
        System.out.println(myll.get(1));
        System.out.println(myll.get(2));
        System.out.println(myll.get(3));
        System.out.println(myll.get(4));
        System.out.println(myll.get(5));
    }
}

