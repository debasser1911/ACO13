package week2.day2.abstract_classes;

/**
 * Created by DeBasser on 04.06.2016.
 */
public class Subzero extends Fighter {


    public int extraDamage;

    public Subzero(String name, int damage) {
        super(name, damage);
        extraDamage = (int)(Math.random() * 20);

    }

    @Override
    public void hit(Fighter fighter) {
        fighter.health -= damage + extraDamage;
        System.out.println(fighter.health);
    }
}
