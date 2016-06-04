package week1.day2.student;

import java.util.Comparator;

/**
 * Created by DeBasser on 04.06.2016.
 */
public interface StudentComparator {
    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
            String StudentName1 = s1.getName().toUpperCase();
            String StudentName2 = s2.getName().toUpperCase();

            return StudentName1.compareTo(StudentName2);


        }

    };

    @Override
    public int compareTo(Student compareStu1, Student compareStu2) {
        String StudentName1 = compareStu1.getName().toUpperCase();
        String StudentName2 = compareStu2.getName().toUpperCase();

        return StudentName1.compareTo(StudentName2);
    }

}
