package week1.day2.student;

import utils.MyDate;

/**
 * Created by DeBasser on 22.05.2016.
 */
public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Petya", new MyDate(1990, 10, 25), 'M');
        Student st2 = new Student("Vasia", new MyDate(1996, 10, 25), 'M');
        Student st3 = new Student("Kolya", new MyDate(1998, 10, 25), 'M');
        Student st4 = new Student("Andrii", new MyDate(2016, 10, 25), 'M');
        GroupArrayList gal = new GroupArrayList();

        gal.addStudent(st1);
        gal.addStudent(st2);
        gal.addStudent(st3);
        gal.addStudent(st4);

        gal.showGroup();
        System.out.println(gal.ifContains(st2));
        System.out.println(gal.ifContains(st1));

        System.out.println();
/*        gal.removeStudent(st1);*/
        gal.sort();

        System.out.println();
        gal.showGroup();



/*        ArrayList stud = new ArrayList();
        stud.add(st1);
        System.out.println(stud.toString());*/

    }
}
