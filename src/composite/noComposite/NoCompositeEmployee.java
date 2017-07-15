package composite.noComposite;

/**
 * Created by Pawel_D on 2017-07-14.
 */
public class NoCompositeEmployee {
    private String name;

    public NoCompositeEmployee(String name){
        this.name = name;
    }

    public void doWork() {
        System.out.println(name + " is working");
    }
}
