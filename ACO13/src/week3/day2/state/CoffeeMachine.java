package week3.day2.state;

/**
 * Created by DeBasser on 05.06.2016.
 */
public class CoffeeMachine implements State {
    private State currentState;
    private State noMoney;
    private State makingChoise;
    private State InProcess;
    private State outOfOrder;

    private int coffeePrice;


    public CoffeeMachine() {
        this.noMoney = new NoMoneyState(this);
        this.makingChoise = new MakingChoiseState(this);
        this.InProcess = new InProcessState(this);
        this.outOfOrder = new OutOfOrderState(this);

        currentState = noMoney;
        coffeePrice = 15;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State state) {
        this.currentState = state;
    }

    @Override
    public void moneyIn() {
        currentState.moneyIn();
    }

    @Override
    public void makeChoise() {
        currentState.makeChoise();
    }

    @Override
    public void makeDrink() {
        currentState.makeDrink();
        if (currentState.getClass() == InProcessState.class) {
            System.out.println("Making cofee");
            try {
                Thread.sleep(5000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Done");

        }
    }

    @Override
    public void cancel() {
        currentState.cancel();
    }

    @Override
    public void giveMoney() {
        System.out.println("Take your money");
        currentState.giveMoney();
    }


    public State getNoMoney() {
        return noMoney;
    }

    public State getMakingChoise() {
        return makingChoise;
    }

    public State getInProcess() {
        return InProcess;
    }

    public State getOutOfOrder() {
        return outOfOrder;
    }
}
