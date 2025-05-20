package HierarchicalOrganization;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private String name;
    private List<Employee> employees;

    public Manager(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void add(Employee employee)
    {
        this.employees.add(employee);
    }

    public void showDetails()
    {
        double totalSalary = 0;
        for (Employee employee: employees) {
            System.out.println(employee.showDetails());
            totalSalary += employee.getSalary();
        }
        System.out.println(String.format("Manager: %s, SalarioTotal: $ %s", this.name, totalSalary));
    }
}
