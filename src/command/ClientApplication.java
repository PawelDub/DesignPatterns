package command;

import command.command.*;
import command.invoker.PlayerController;
import command.receiver.MusicPlayer;
import command.receiver.Player;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ClientApplication {
    public static void main(String[] args){

        PlayerController playerController;

        Player player = new MusicPlayer();

        Command command = new LoadFileCommand(player, "ZZ top");

        playerController = new PlayerController(command);
        playerController.pressButton();

        System.out.println("=========================================");

        command = new PlayFileCommand(player);
        playerController = new PlayerController(command);
        playerController.pressButton();
        playerController.pressUndoButton();

        System.out.println("=========================================");

        command = new StopFileCommand(player);

        playerController = new PlayerController(command);
        playerController.pressButton();
        playerController.pressUndoButton();

        System.out.println("=========================================");

        List<String> fileList = Arrays.asList("ZZ top", "Metalllica", "Iron Maiden");
        command = new PlayerFileListCommand(player, fileList);

        playerController = new PlayerController(command);
        playerController.pressButton();
        playerController.pressUndoButton();
    }
}
