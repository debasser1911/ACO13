package design_patterns.decorator;

/**
 * Created by DeBasser on 26.06.2016.
 */
public class Milk extends CondimentBeverage {
    public String description = "Milk";
    public double cost = 5.54;

    public Milk(Beverage beverage) {
        super(beverage);
    }
}
