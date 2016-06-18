package week3.day2.state;

import week1.day2.student.MarkComparator;

/**
 * Created by DeBasser on 05.06.2016.
 */
public class MakingChoiseState implements State {
CoffeeMachine coffeeMachine;

    public MakingChoiseState(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void moneyIn() {
        System.out.println("Money already in");
    }

    @Override
    public void makeChoise() {
        System.out.println("Nice choise");
        System.out.println("Are you sure?");

    }

    @Override
    public void makeDrink() {
        System.out.println("Making drink");
        coffeeMachine.setCurrentState(coffeeMachine.getInProcess());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Done");
        coffeeMachine.setCurrentState(coffeeMachine.getNoMoney());
    }

    @Override
    public void cancel() {
        System.out.println("Making cancel");
    }

    @Override
    public void giveMoney() {
        System.out.println("Take your money");
        coffeeMachine.setCurrentState(coffeeMachine.getNoMoney());
    }
}
