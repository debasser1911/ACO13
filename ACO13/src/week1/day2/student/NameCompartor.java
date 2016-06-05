package week1.day2.student;

import java.util.Comparator;

/**
 * Created by DeBasser on 04.06.2016.
 */
public class NameCompartor implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
