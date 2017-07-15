package command.command;

import command.receiver.Player;

/**
 * Created by Pawel_D on 2017-06-30.
 */
public class StopFileCommand implements Command {

    private Player player;

    public StopFileCommand(Player player) {
        this.player = player;
    }

    @Override
    public void execute() {
        player.stop();
    }

    @Override
    public void undo() {
        player.play();
    }
}
