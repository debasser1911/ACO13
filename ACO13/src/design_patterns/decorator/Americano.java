package design_patterns.decorator;

/**
 * Created by DeBasser on 26.06.2016.
 */
public class Americano extends Beverage {
    public String getDescription() {
        return "Americano";
    }

    @Override
    public double cost() {
        return 15.0;
    }
}
