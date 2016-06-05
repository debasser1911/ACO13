package week1.day2.student;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by DeBasser on 31.05.2016.
 */
public class GroupArrayList {
    private ArrayList<Student> groupList;
    private Comparator<Student> comparator = new AgeComparator();

    public GroupArrayList() {
        this.groupList = new ArrayList<Student>();
    }


    public void addStudent(Student student) {
        groupList.add(student);

    }

    public void showGroup() {
        for (int i = 0; i < groupList.size(); i++) {
            System.out.println(groupList.get(i));
        }
    }

    public Student removeStudent(String name) {

        for (int i = 0; i < groupList.size(); i++) {
            if (groupList.get(i).getName().equals(name)) {
                return groupList.remove(i);
            }
        }
        return null;
    }


    public Student removeStudent(Student student) {
        for (int i = 0; i < groupList.size(); i++) {
            if (groupList.get(i).equals(student)) {
                return groupList.remove(i);
            }

        }
        return null;
    }

    //remove by index
    public void removeStudent(int index) {
        if (index < 0) {
            System.out.println("Incorrect index");
        }
        groupList.remove(index);


    }


    public boolean ifContains(Student student) {
        for (int i = 0; i < groupList.size(); i++) {
            if (groupList.get(i).equals(student)) {
                System.out.println("Object present in list");
                return true;
            }

        }
        System.out.println("Object is NOT present in list");
        return false;
    }

    public void sort() {
        Collections.sort(groupList, comparator);
    }


    public void setComparator(Comparator<Student> comparator) {
        this.comparator = comparator;
    }
}



