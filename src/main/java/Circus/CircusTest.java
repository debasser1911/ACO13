package main.java.Circus;

/**
 * Created by istomina on 22.06.2016.
 */
public class CircusTest {
    public static void main(String[] args) {
        Artist art = new Artist();
        RopeWalker rw = new RopeWalker("Mike", 1500.00);
        art.artists.add(rw);
        rw.perform();
        System.out.println(art.artists.size());
        System.out.println(art.artists.get(0).toString());
    }


}
