package design_patterns.state;

/**
 * Created by DeBasser on 05.06.2016.
 */
public class NoMoneyState implements State {
    CoffeeMachine coffeeMachine;

    public NoMoneyState(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void moneyIn() {
        System.out.println("Make you choise");
        coffeeMachine.setCurrentState(coffeeMachine.getMakingChoise());
    }

    @Override
    public void makeChoise() {
        System.out.println("First put the money");
    }

    @Override
    public void makeDrink() {

    }

    @Override
    public void cancel() {

    }

    @Override
    public void giveMoney() {

    }
}
