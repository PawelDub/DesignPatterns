package composite.noComposite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel_D on 2017-07-14.
 */
public class NoCompositeDepartment {
    private List<NoCompositeEmployee> employees = new ArrayList<>();
    private String name;

    public NoCompositeDepartment(String name) {
        this.name = name;
    }

    public List<NoCompositeEmployee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<NoCompositeEmployee> employees) {
        this.employees = employees;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addEmployee(NoCompositeEmployee employee) {
        employees.add(employee);
    }

    public void remove(NoCompositeEmployee employee) {
        employees.remove(employee);
    }
}
