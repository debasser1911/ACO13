package week3.day2.state;

/**
 * Created by DeBasser on 05.06.2016.
 */
public class CoffeeMachine implements State, MyObserver {
    private State currentState;
    private State noMoney;
    private State makingChoise;
    private State InProcess;
    private State outOfOrder;

    private int coffeePrice;
    private int teaPrice;


    public CoffeeMachine() {
        this.noMoney = new NoMoneyState(this);
        this.makingChoise = new MakingChoiseState(this);
        this.InProcess = new InProcessState(this);
        this.outOfOrder = new OutOfOrderState(this);

        currentState = noMoney;
        coffeePrice = 15;
        teaPrice = 10;
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

    public int getCoffeePrice() {
        return coffeePrice;
    }

    public void setCoffeePrice(int coffeePrice) {
        this.coffeePrice = coffeePrice;
    }

    public int getTeaPrice() {
        return teaPrice;
    }

    public void setTeaPrice(int teaPrice) {
        this.teaPrice = teaPrice;
    }


    @Override
    public void update(int coffeePrice, int teaPrice) {
        this.coffeePrice = coffeePrice;
        this.teaPrice = teaPrice;
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "coffeePrice=" + coffeePrice +
                ", teaPrice=" + teaPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoffeeMachine that = (CoffeeMachine) o;

        if (coffeePrice != that.coffeePrice) return false;
        if (teaPrice != that.teaPrice) return false;
        if (currentState != null ? !currentState.equals(that.currentState) : that.currentState != null) return false;
        if (noMoney != null ? !noMoney.equals(that.noMoney) : that.noMoney != null) return false;
        if (makingChoise != null ? !makingChoise.equals(that.makingChoise) : that.makingChoise != null) return false;
        if (InProcess != null ? !InProcess.equals(that.InProcess) : that.InProcess != null) return false;
        return outOfOrder != null ? outOfOrder.equals(that.outOfOrder) : that.outOfOrder == null;

    }

    @Override
    public int hashCode() {
        return 0;
    }
}
