package week2.day2.abstract_classes;

/**
 * Created by DeBasser on 04.06.2016.
 */
public class LukKang extends Fighter {
    public LukKang(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void hit(Fighter fighter) {
        fighter.health -= damage;
        System.out.println(fighter.health);
    }
}
