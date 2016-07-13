package week5.clones;

import java.io.Serializable;

/**
 * Created by DeBasser on 26.06.2016.
 */
public class Man extends Person implements Serializable {
    public Woman wife;


    public Man(String name, int age) {
        super(name, age);
    }

    public Man(String name, int age, Woman wife) {
        super(name, age);
        this.wife = wife;
    }

    @Override
    public Man clone() throws CloneNotSupportedException {
        return (Man) super.clone();
    }
}
