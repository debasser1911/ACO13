package week3.day2.state;

/**
 * Created by DeBasser on 05.06.2016.
 */
public class CoffeeMachineTest {
    public static void main(String[] args) {
        CoffeeCentre cc = new CoffeeCentre();
/*        cc.addObserver();*/
        CoffeeMachine cm = new CoffeeMachine();
        CoffeeMachine cm2 = new CoffeeMachine();
        CoffeeMachine cm3 = new CoffeeMachine();

        cm.makeChoise();
        cm.moneyIn();
        cm.makeChoise();
        cm.makeDrink();
        cm.giveMoney();
    }


}
