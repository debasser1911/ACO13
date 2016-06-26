package design_patterns.state;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DeBasser on 05.06.2016.
 */
public class CoffeeCentre implements Observeble {
    private List<MyObserver> observers;
    private int teaPrice;
    private int coffeePrice;

    public CoffeeCentre() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void addObserver(MyObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(MyObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (MyObserver observer : observers) {

        }
    }

    public int getTeaPrice() {
        return teaPrice;
    }

    public void setTeaPrice(int teaPrice) {
        this.teaPrice = teaPrice;
    }

    public int getCoffeePrice() {
        return coffeePrice;
    }

    public void setCoffeePrice(int coffeePrice) {
        this.coffeePrice = coffeePrice;
    }
}