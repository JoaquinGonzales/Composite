package HierarchicalOrganization;

public class IndividualEmployee implements Employee{
    private String name;
    private double salary;

    public IndividualEmployee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return this.salary;
    }

    @Override
    public String showDetails() {
        return String.format("Empleado: %s, Salario: $ %s ",this.name, this.salary);
    }
}
