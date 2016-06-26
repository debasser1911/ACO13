package design_patterns.decorator;

/**
 * Created by DeBasser on 26.06.2016.
 */
public abstract class Beverage {


    protected String decription;

    public String getDecription() {
        return decription;
    }

    public abstract double cost();
}
