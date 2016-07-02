package week1.day2.student;

import utils.MyDate;

/**
 * Created by DeBasser on 22.05.2016.
 */
public class TDD {
    public static void main(String[] args) {
        Group group = new Group("ACO");
        Student st1 = new Student("Petya", new MyDate(1990, 10, 25), 'M');
        boolean expected = true;
        boolean actual = group.addStudent(st1);

        System.out.printf("Method name - %s, result - %s," + " expected - %s, actual - %s\n",
                "addStudent", expected == actual, expected, actual);
    }
}
