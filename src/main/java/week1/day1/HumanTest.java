package main.java.week1.day1;

/**
 * Created by DeBasser on 21.05.2016.
 */
public class HumanTest {
    public static void main(String[] args) {
        Human person = new Human("Petya", 30, "man", 188, 90);
        person.age = 25;
        person.name = "Vasis";
        String info = person.asString();
        System.out.println(info);
        Human person1 = new Human("Kolia", 25, "man", 180, 80);
        System.out.println(person1.asString());
        System.out.println(person.toString() + person.getAge());
        person.getAge();

    }

}
