package week5.clones;

/**
 * Created by DeBasser on 26.06.2016.
 */
public class Copying {
    public static void main(String[] args) throws CloneNotSupportedException {
        Child child = new Child("Ivasik", 12);
        Woman woman = new Woman("Anna", 35);
        Man person = new Man("Vasia", 25);
        Person clone = (Person) person.clone();

        System.out.println(person.toString());
        System.out.println(clone.toString());
    }
}
