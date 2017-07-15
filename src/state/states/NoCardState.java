package state.states;

import state.ATMMachine;

public class NoCardState implements ATMState {

    private ATMMachine atmMachine;

    public NoCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card inserted");
        atmMachine.setState(new HasCardState(atmMachine));
    }

    @Override
    public void enterPIN(int pin) {
        System.out.println("Insert Card first");

    }

    @Override
    public void requestMonney(int amount) {
        System.out.println("No Card inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("No Card inserted");
    }
}