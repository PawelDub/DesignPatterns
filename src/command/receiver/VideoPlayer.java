package command.receiver;

/**
 * Created by Pawel_D on 2017-06-30.
 */
public class VideoPlayer implements Player {

    private String filename;

    @Override
    public void loadFile(String filename) {
        System.out.println("Load video file: " + filename);
        this.filename = filename;
    }

    @Override
    public void play() {
        System.out.println("Play video file: " + filename);
    }

    @Override
    public void stop() {
        System.out.println("Stop video file: " + filename);
    }

    @Override
    public void closeFile() {
        System.out.println("Close video file: " + filename);
        this.filename = null;
    }
}
