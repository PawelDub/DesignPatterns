package command.receiver;

/**
 * Created by Pawel_D on 2017-06-30.
 */
public interface Player {
    void loadFile(String filename);
    void play();
    void stop();
    void closeFile();
}
