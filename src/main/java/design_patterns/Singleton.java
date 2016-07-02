package design_patterns;

/**
 * Created by DeBasser on 05.06.2016.
 */
public class Singleton {
    private static volatile Singleton instance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (instance == null)
            synchronized (Singleton.class) {
                if (instance == null)
                    instance = new Singleton();

            }
        return instance;
    }
}
