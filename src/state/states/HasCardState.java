package state.states;

import state.ATMMachine;

/**
 * Created by Pawel_D on 2017-06-30.
 */
public class HasCardState implements ATMState {

    private ATMMachine atmMachine;

    public HasCardState(ATMMachine atmMachine) {
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
        if(pin == 2222) {
            System.out.println("Correct PIN");
            atmMachine.setState(new CorrectPinState(atmMachine));
            atmMachine.setPinEnteredLeft(3);
        } else {
            System.out.println("Incorrect pin");
            atmMachine.setPinEnteredLeft(atmMachine.getPinEnteredLeft() -1);
            if (atmMachine.getPinEnteredLeft() == 0){
                System.out.println("Card has been blocked. Contact with bank");
                atmMachine.setState(new NoCardState(atmMachine));
            }
        }
    }

    @Override
    public void requestMonney(int amount) {
        System.out.println("No pin entered");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atmMachine.setState(new NoCardState(atmMachine));
    }
}
