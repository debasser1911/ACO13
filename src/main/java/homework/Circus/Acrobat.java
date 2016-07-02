package homework.Circus;

/**
 * Created by istomina on 22.06.2016.
 */
public class Acrobat extends Artist implements Performance {
    public Acrobat(String name, double salary) {
        this.setName(name);
        this.salary = salary;
        artists.add(this);
    }

    @Override
    public void perform() {
        System.out.println("Acrobat performing");
    }
}
