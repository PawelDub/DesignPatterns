package state;

/**
 * Created by Pawel_D on 2017-06-30.
 */
public class ClientApplication {
    public static void main(String[] args){
        ATMMachine atmMachine = new ATMMachine();
        atmMachine.ejectCard();
        atmMachine.insertCard();
        atmMachine.insertCard();
        atmMachine.requestMonney(200);
        atmMachine.enterPIN(1313);
        atmMachine.enterPIN(1313);
        atmMachine.enterPIN(1313);
        atmMachine.enterPIN(2222);
        atmMachine.insertCard();
        atmMachine.requestMonney(100);
        atmMachine.ejectCard();
    }
}
