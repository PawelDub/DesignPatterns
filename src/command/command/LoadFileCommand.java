package command.command;

import command.receiver.Player;

/**
 * Created by Pawel_D on 2017-06-30.
 */
public class LoadFileCommand implements Command {

    private Player player;
    private String filename;

    public LoadFileCommand(Player player, String filename) {
        this.player = player;
        this.filename = filename;
    }

    @Override
    public void execute() {
        player.loadFile(filename);
    }

    @Override
    public void undo() {
        player.closeFile();
    }
}
