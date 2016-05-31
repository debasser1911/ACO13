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

    public void removeStudent(String name) {
        String[] equalNames = new String[groupList.size()];
        int index;
        for (int i = 0; i < groupList.size(); i++) {
            index = groupList.indexOf(groupList.get(i).getName().contains(name));
                groupList.remove(index);
            }
/*            for (int j = 0; j < equalNames.length; j++) {
                equalNames[j] = groupList.get(i).getName();
                System.out.println(equalNames[i]);*/
            }



       public void removeStudent() {
        String[] equalNames = new String[groupList.size()];
        for (int i = 0; i < groupList.size(); i++) {

            for (int j = 0; j < equalNames.length; j++) {
                equalNames[j] = groupList.get(i).getName();
                System.out.println(equalNames[i]);
            }
        }


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



