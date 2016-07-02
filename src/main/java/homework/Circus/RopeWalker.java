package homework.Circus;

/**
 * Created by istomina on 22.06.2016.
 */
public class RopeWalker extends Artist implements Performance {

    public RopeWalker(String name, double salary) {
        this.setName(name);
        this.salary = salary;
        artists.add(this);
    }

    @Override
    public void perform() {
        System.out.println("RopeWalker performing");
    }
}
