package design_patterns.decorator;

/**
 * Created by DeBasser on 26.06.2016.
 */
public class Espresso extends Beverage {

    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
        return 10.0;
    }
}
