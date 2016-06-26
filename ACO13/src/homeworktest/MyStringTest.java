package homeworktest;

import utils.MyString;

/**
 * Created by istomina on 31.05.2016.
 */
public class MyStringTest {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f','j','f','s'};
        char[] chars2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] chars4 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] chars3 = new char[10];
        char[] chars6 = new char[10];
        String str = "abcdefgjklmnopst";
        MyString mystring = new MyString(chars);
        MyString mystring2 = new MyString(chars2);
        MyString mystring3 = new MyString(str);
        System.out.println(mystring.substring(6));

/*        System.out.println(mystring.length());
        System.out.println(mystring.toString());
        System.out.println(mystring2.toString());
        System.out.println(mystring.concat(mystring3));
        System.out.println(mystring2.contains(mystring2));
        System.out.println(mystring2.indexOf('c'));*/
        System.out.println(mystring3.substring(0, 4));

    }
    // или начальный индекс больше конечного или начальный индекс равен длине массива или конечный индекс равен длине массива
}
