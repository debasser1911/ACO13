package week1.day2.student;

import utils.MyDate;

/**
 * Created by DeBasser on 22.05.2016.
 */
public class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Petya", new MyDate(1990, 10, 25), 'M');
        Student st2 = new Student("Vasia", new MyDate(1990, 10, 25), 'M');
        GroupArrayList gal = new GroupArrayList();

        gal.addStudent(st1);
        gal.addStudent(st2);

      gal.showGroup();
       // gal.ifContains(st2);
        //gal.ifContains(st1);
gal.removeStudent(0);
        System.out.println();
gal.showGroup();



/*        ArrayList stud = new ArrayList();
        stud.add(st1);
        System.out.println(stud.toString());*/

    }
}
