package HierarchicalOrganization;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Employee{
    private String name;
    private double totalSalary;
    private List<Employee> employees;

    public Manager(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void add(Employee employee)
    {
        this.employees.add(employee);
    }

    @Override
    public double getSalary() {
        for (Employee employee: employees) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    public void showDetails()
    {
        this.employees.forEach(Employee::showDetails);
        System.out.println(String.format("Manager: %s, Salario Total: $ %s", this.name, this.getSalary()));
    }
}
