package week1.day2.student;

import utils.MyDate;

/**
 * Created by Andrey on 22.05.2016.
 */
public class ololo {
    public static void main(String[] args) {
        System.out.println("hello world");
        Student st6 = new Student("Ivan", new MyDate(1992,3,24), 'm');
        Student st7 = new Student("Peta", new MyDate(1987,3,24), 'm');

        System.out.println(st6.toString());
        System.out.println(st7.toString());

    }
}
