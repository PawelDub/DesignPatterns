package state;

import state.states.ATMState;
import state.states.NoCardState;

/**
 * Created by Pawel_D on 2017-06-30.
 */
public class ATMMachine implements ATMState {
    private ATMState state  = new NoCardState(this);
    private int pinEnteredLeft = 3;

    public void setPinEnteredLeft(int pinEnteredLeft) {
        this.pinEnteredLeft = pinEnteredLeft;
    }

    public int getPinEnteredLeft() {
        return pinEnteredLeft;
    }

    public void setState(ATMState state) {
        System.out.println("state = --> " + state.getClass().getSimpleName());
        this.state = state;
    }

    @Override
    public void insertCard() {
        state.insertCard();
    }

    @Override
    public void enterPIN(int pin) {
        state.enterPIN(pin);
    }

    @Override
    public void requestMonney(int amount) {
        state.requestMonney(amount);
    }

    @Override
    public void ejectCard() {
        state.ejectCard();
    }
}
