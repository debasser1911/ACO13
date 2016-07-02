package design_patterns.decorator;

/**
 * Created by DeBasser on 26.06.2016.
 */
public class CreateBeverage {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        System.out.println(espresso.cost());
        Milk milk = new Milk(espresso);
        System.out.println(milk.cost());
    }
}
