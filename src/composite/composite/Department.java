package composite.composite;

import com.sun.org.apache.regexp.internal.RE;
import composite.component.Resource;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel_D on 2017-07-14.
 */
public class Department implements Resource{

    private List<Resource> resources = new ArrayList<>();
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public Department() {
    }

    public List<Resource> getResources() {
        return resources;
    }

    public void setResources(List<Resource> resources) {
        this.resources = resources;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addResources(Resource resource) {
        resources.add(resource);
    }

    public void remove(Resource resource) {
        resources.remove(resource);
    }

    @Override
    public void doWork() {
        for (Resource resource : resources) {
            resource.doWork();
        }
    }
}
