package design_patterns.decorator;

/**
 * Created by DeBasser on 26.06.2016.
 */
public class CondimentBeverage extends Beverage {

    private Beverage beverage;
    protected String description;
    protected double cost;

    public CondimentBeverage(Beverage beverage){
        this.beverage = beverage;
    }
    public String getDescription(){
        return beverage.decription + description;
    }

    @Override
    public double cost() {
        return beverage.cost() + cost;
    }
}
