package week1.day2.student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DeBasser on 31.05.2016.
 */
public class GroupArrayList implements List<Comparable> {
    private ArrayList<Student> groupList;

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

/*    public boolean groupSort (){
        groupList.sort();
    }*/

    public int compareTo(Student comparestu) {
        int compareage=((Student)comparestu).getBirthDay().getYear();
        /* For Ascending order*/
        return this.getBirthDay().getYear()-compareage;

        /* For Descending order do like this */
        //return compareage-this.studentage;
    }
}



