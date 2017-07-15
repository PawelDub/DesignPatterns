package state.states;

/**
 * Created by Pawel_D on 2017-06-30.
 */
public interface ATMState {
    void insertCard();
    void enterPIN(int pin);
    void requestMonney(int amount);
    void ejectCard();
}
