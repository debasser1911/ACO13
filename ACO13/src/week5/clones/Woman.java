package week5.clones;

/**
 * Created by DeBasser on 26.06.2016.
 */
public class Woman extends Person {
    public Child child;

    public Woman(String name, int age) {
        super(name, age);
    }

    public Woman(String name, int age, Child child) {
        super(name, age);
        this.child = child;
    }

    @Override
    public String toString() {
        return "Woman{" + super.toString() +
                "child=" + child +
                '}';
    }

}
