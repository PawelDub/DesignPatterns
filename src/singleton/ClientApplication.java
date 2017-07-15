package singleton;

import singleton.singleton.Singleton;

/**
 * Created by Pawel_D on 2017-07-02.
 */
public class ClientApplication {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton);
        singleton = Singleton.getInstance();
        System.out.println(singleton);
        singleton.close();
        singleton = Singleton.getInstance();
        System.out.println(singleton);
        singleton = Singleton.getInstance();
        System.out.println(singleton);
        singleton = Singleton.getInstance();
        System.out.println(singleton);
        singleton.close();
        singleton = Singleton.getInstance();
        System.out.println(singleton);
    }
}
