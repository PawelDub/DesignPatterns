package state.states;

/**
 * Created by Pawel_D on 2017-06-30.
 */
public class OutOfOrderState implements ATMState {
    @Override
    public void insertCard() {
        System.out.println("Out of Order");
    }

    @Override
    public void enterPIN(int pin) {
        System.out.println("Out of Order");
    }

    @Override
    public void requestMonney(int amount) {
        System.out.println("Out of Order");
    }

    @Override
    public void ejectCard() {
        System.out.println("Out of Order");
    }
}
