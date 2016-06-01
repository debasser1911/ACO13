package week1.day2.student;

import utils.MyDate;

/**
 * Created by DeBasser on 22.05.2016.
 */
public class Student {
    private String name;

    private MyDate birthDay;

    private char gender;
    private double averageMark;

    public Student(String name, MyDate birthDay, char gender) {
        this.name = name;
        this.birthDay = birthDay;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(MyDate birthDay) {
        this.birthDay = birthDay;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(double averageMark) {
        this.averageMark = averageMark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", " + birthDay +
                ", gender=" + gender +
                ", averageMark=" + averageMark +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (getGender() != student.getGender()) return false;
        if (Double.compare(student.getAverageMark(), getAverageMark()) != 0) return false;
        if (getName() != null ? !getName().equals(student.getName()) : student.getName() != null) return false;
        return getBirthDay() != null ? getBirthDay().equals(student.getBirthDay()) : student.getBirthDay() == null;

    }

}

