package command.command;

import command.receiver.Player;

import java.util.List;

public class PlayerFileListCommand implements Command {

    private Player player;
    private List<String> fileList;

    public PlayerFileListCommand(Player player, List<String> fileList) {
        this.player = player;
        this.fileList = fileList;
    }

    @Override
    public void execute() {
        for (String file : fileList) {
            new LoadFileCommand(player, file).execute();
            new PlayFileCommand(player).execute();
        }
    }

    @Override
    public void undo() {
        player.stop();
        player.closeFile();
    }
}
