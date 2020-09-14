package main.java.Circus;

/**
 * Created by istomina on 22.06.2016.
 */
public class CircusActor extends Artist implements Performance {
    public CircusActor(String name, double salary) {
        this.setName(name);
        this.salary = salary;
        artists.add(this);
    }


    @Override
    public void perform() {
        System.out.println("CircusActor performing");
    }
}
