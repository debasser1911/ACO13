package week3.day2.state;

import java.util.Observer;

/**
 * Created by DeBasser on 05.06.2016.
 */
public interface Observeble {
    void addObserver(MyObserver observer);
    void removeObserver(MyObserver observer);
    void notifyObserver();

}
