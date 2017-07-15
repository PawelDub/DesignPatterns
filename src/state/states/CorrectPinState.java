package state.states;

import state.ATMMachine;

/**
 * Created by Pawel_D on 2017-06-30.
 */
public class CorrectPinState implements ATMState {

    private ATMMachine atmMachine;

    public CorrectPinState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card has already inserted");
        System.out.println("ATM blocked");
        atmMachine.setState(new OutOfOrderState());
    }

    @Override
    public void enterPIN(int pin) {
        System.out.println("Pin has already entered");
    }

    @Override
    public void requestMonney(int amount) {
        System.out.println("Withdrawal money = " + amount);
        atmMachine.setState(new NoCardState(atmMachine));
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setState(new NoCardState(atmMachine));
    }
}
