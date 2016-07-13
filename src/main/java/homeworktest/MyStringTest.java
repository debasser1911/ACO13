package homeworktest;


import main.java.data_structures.MyString;

/**
 * Created by istomina on 31.05.2016.
 */
public class MyStringTest {
    public static void main(String[] args) {
        char[] chars = {'a', 'b', 'c', 'd', 'e', 'f', 'j', 'f', 's'};
        char[] chars2 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char[] chars4 = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
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

}
