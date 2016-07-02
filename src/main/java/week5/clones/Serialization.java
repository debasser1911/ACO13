package week5.clones;

import java.io.*;

/**
 * Created by DeBasser on 26.06.2016.
 */
public class Serialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Child child = new Child("Ivasik", 12);
        Woman woman = new Woman("Anna", 35);
        Man person = new Man("Vasia", 25);

        ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(
                "C:\\codding\\code\\ACO13\\ACO13\\src\\resources\\Man.txt"
        )));
        ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(
                "C:\\codding\\code\\ACO13\\ACO13\\src\\resources\\Man.txt"
        )));
        oos.writeObject(person);
        oos.flush();
        oos.close();

        Man clone = (Man) ois.readObject();
        ois.close();
        System.out.println(person.toString());

    }
}
