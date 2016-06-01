package week1.day2.student;

import java.util.ArrayList;

/**
 * Created by DeBasser on 31.05.2016.
 */
public class GroupArratList {
    private ArrayList<Student> groupList;

    public GroupArratList() {
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


    public boolean removeStudent(String name) {

        for (int i = 0; i < groupList.size(); i++) {
            if (groupList.get(i).getName().equals(name)) {
                return groupList.remove(i);
            }
        }
        return false;
    }

    public void removeStudent(Student student) {
        int i = groupList.indexOf(student);
        groupList.remove(i);

    }


    public void removeStudent(int index) {
        if (index < 0) {
            System.out.println("Incorrect index");
        }
        groupList.remove(index);


    }

    public boolean ifContains(Student student) {
        if (groupList.contains(student)) {
            System.out.println("Object present in list");
            return true;
        } else {
            System.out.println("Object is NOT present in list");
            return false;
        }

    }


}



