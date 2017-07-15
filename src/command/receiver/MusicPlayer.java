package command.receiver;

public class MusicPlayer implements Player {

    private String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void loadFile(String filename) {
        System.out.println("load music file: " + filename);
        this.filename = filename;
    }

    @Override
    public void play() {
        System.out.println("Play music file: " + filename);
    }

    @Override
    public void stop() {
        System.out.println("Stop music file: " + filename);
    }

    @Override
    public void closeFile() {
        System.out.println("Close music file: " + filename);
        filename = null;
    }
}
