package singleton.singleton;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class Singleton {
    private static Singleton INSTANCE;

    public final synchronized static Singleton getInstance() {
        if(Singleton.INSTANCE == null){
            INSTANCE = new Singleton();
        }
        return Singleton.INSTANCE;
    }

    public void close(){
        INSTANCE = null;
    }
}