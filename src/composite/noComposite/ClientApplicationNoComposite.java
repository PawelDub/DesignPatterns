package composite.noComposite;

import composite.composite.Department;
import composite.leaf.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawel_D on 2017-07-14.
 */
public class ClientApplicationNoComposite {
    public static void main(String[] args) {
        List<Object> companyResources = createCompany();
        startWork(companyResources);
    }


    private static List<Object> createCompany() {
        Department departmentIT = new Department("IT");
        departmentIT.addResources(new Employee("Franek"));
        departmentIT.addResources(new Employee("Karol"));

        Department departmentHR = new Department("HR");
        departmentHR.addResources(new Employee("Jozef"));
        departmentHR.addResources(new Department("Adam"));

        Employee employeeAnia = new Employee("Ania");

        List<Object> companyResources = new ArrayList<>();
        companyResources.add(departmentHR);
        companyResources.add(departmentIT);
        companyResources.add(employeeAnia);
        return createCompany();
    }

    private static void startWork(List<Object> companyResources) {
        for (Object resource : companyResources) {
            if (resource instanceof NoCompositeEmployee) {
                NoCompositeEmployee employee = (NoCompositeEmployee) resource;
                employee.doWork();
            } else {
                NoCompositeDepartment department = (NoCompositeDepartment) resource;
                List<NoCompositeEmployee> employees = department.getEmployees();
                for (NoCompositeEmployee employee : employees) {
                    employee.doWork();
                }
            }
        }
    }
}