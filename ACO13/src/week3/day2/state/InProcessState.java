package week3.day2.state;

/**
 * Created by DeBasser on 05.06.2016.
 */
public class InProcessState implements State {
    CoffeeMachine coffeeMachine;

    public InProcessState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void moneyIn() {
        System.out.println("Money already in");
    }

    @Override
    public void makeChoise() {
        System.out.println("You've already make choise");
    }

    @Override
    public void makeDrink() {
        System.out.println("Drink already making");
    }

    @Override
    public void cancel() {
        System.out.println("Sorry man, it's too late");
    }

    @Override
    public void giveMoney() {

    }
}
