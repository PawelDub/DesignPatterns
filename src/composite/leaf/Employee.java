package composite.leaf;

import composite.component.Resource;

/**
 * Created by Pawel_D on 2017-07-14.
 */
public class Employee implements Resource{
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    @Override
    public void doWork() {
        System.out.println(name + " is working");
    }
}
