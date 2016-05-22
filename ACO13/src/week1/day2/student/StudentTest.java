package week1.day2.student;

import utils.MyDate;

/**
 * Created by DeBasser on 22.05.2016.
 */
public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Petya", new MyDate(1990, 10, 25), 'M');
        Student st2 = new Student("Vasia", new MyDate(1990, 10, 25), 'M');

        Group group = new Group("ACO13");
        group.addStudent(st1);
        group.addStudent(st2);

        group.showGroup();
    }
}
