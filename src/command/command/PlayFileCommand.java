package command.command;

import command.receiver.Player;

/**
 * Created by Pawel_D on 2017-06-30.
 */
public class PlayFileCommand implements Command {

    private Player player;

    public PlayFileCommand(Player player) {
        super();
        this.player = player;
    }

    @Override
    public void execute() {
        player.play();
    }

    @Override
    public void undo() {
        player.stop();
    }
}
