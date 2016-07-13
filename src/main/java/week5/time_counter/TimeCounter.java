package week5.time_counter;

/**
 * Created by DeBasser on 25.06.2016.
 */
public class TimeCounter {
    public long counter(Action action) {
        long start = System.currentTimeMillis();
        action.run();
        long finish = System.currentTimeMillis();
        return finish - start;
    }

}
