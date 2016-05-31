package homeworktest;

import utils.MyString;

/**
 * Created by istomina on 31.05.2016.
 */
public class MyStringTest {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f'};
        char[] chars2 = new char[10];
        String str = "Vasia";
        MyString mystring = new MyString(chars);
        MyString mystring2 = new MyString(chars2);
        MyString mystring3 = new MyString(str);

        System.out.println(mystring.length());
        System.out.println(mystring.toString());
        System.out.println(mystring2.toString());
        System.out.println(mystring.concat(mystring3));
    }
}
