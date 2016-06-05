package week1.day2.student;

import java.util.Comparator;

/**
 * Created by DeBasser on 04.06.2016.
 */
public class MarkComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {
        return (int) ((int) s1.getAverageMark() - s2.getAverageMark());
    }
}
