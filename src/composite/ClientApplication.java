package composite;

import composite.component.Resource;
import composite.composite.Department;
import composite.leaf.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel_D on 2017-07-14.
 */
public class ClientApplication {
    public static void main(String[] args) {
        List<Resource> companyResource = createCompany();

        startWork(companyResource);
    }

    private static List<Resource> createCompany() {
        Department departmentIt = new Department("IT");
        departmentIt.addResources(new Employee("Franek"));
        departmentIt.addResources(new Employee("Karol"));

        Department subDepartmentIT = new Department("IT outsource");
        subDepartmentIT.addResources(new Employee("Consultant 1"));
        subDepartmentIT.addResources(new Employee("Consultant 2"));
        departmentIt.addResources(subDepartmentIT);

        Department  departmentHr = new Department("HR");
        departmentHr.addResources(new Employee("Jozef"));
        departmentHr.addResources(new Employee("Adam"));

        Employee employeeAnia = new Employee("Ania");

        List<Resource> companyResources = new ArrayList<>();
        companyResources.add(departmentHr);
        companyResources.add(departmentIt);
        companyResources.add(employeeAnia);
        return companyResources;
    }

    private static void startWork(List<Resource> companyResources) {
        for (Resource resource : companyResources){
            resource.doWork();
        }
    }
}
