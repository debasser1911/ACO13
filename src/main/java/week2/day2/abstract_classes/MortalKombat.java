package week2.day2.abstract_classes;

/**
 * Created by DeBasser on 04.06.2016.
 */
public class MortalKombat {
    public static void main(String[] args) {
        Fighter f1 = new LukKang("Luck", 20);
        Fighter f2 = new Subzero("Sub", 15);


        Arena arena = new Arena(f1, f2);
        arena.startFight();
    }
}
