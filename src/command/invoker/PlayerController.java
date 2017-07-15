package command.invoker;

import command.command.Command;

public class PlayerController {

    private Command command;

    public PlayerController() {
    }

    public PlayerController(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }

    public void pressUndoButton(){
        command.undo();
    }
}
