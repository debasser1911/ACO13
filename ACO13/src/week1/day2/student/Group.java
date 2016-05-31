package week1.day2.student;

/**
 * Created by DeBasser on 22.05.2016.
 */
public class Group {
    private int counter;
    private static final int GROUP_SIZE = 200;
    private String name;
    private Student[] students;

    public Group(String name) {
        this.name = name;
        this.students = new Student[GROUP_SIZE];
    }

    public Group(String name, int groupSize) {
        this.name = name;
        this.students = new Student[groupSize];
    }

    public Group(String name, Student[] students) {
        this.name = name;
        this.students = students;
    }

    public boolean addStudent(Student student) {
        if (student == null) return false;
        if (counter >= students.length) return false;
        if(counter > students.length){

        }
        //todo check if present in group
        students[counter] = student;
        counter++;
        return true;
    }

    public void showGroup() {
        for (int i = 0; i < counter; i++) {
            System.out.println(students[i].toString());
        }
    }
    public Student search(String name){
        return null;
    }
    public boolean deleteStudent (Student student){
        return false;
    }
}

