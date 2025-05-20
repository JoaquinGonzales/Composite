package HierarchicalOrganizationTests;

import HierarchicalOrganization.Employee;
import HierarchicalOrganization.IndividualEmployee;
import HierarchicalOrganization.Manager;
import org.junit.jupiter.api.Test;

public class HierarchicalOrganizationTest {
    @Test
    public void hierarchicalOrganizationTest()
    {
        Manager manager = new Manager("Joaquin");
        IndividualEmployee employee1 = new IndividualEmployee("employee 1", 2400.0);
        IndividualEmployee employee2 = new IndividualEmployee("employee 2", 2500.0);
        IndividualEmployee employee3 = new IndividualEmployee("employee 3", 2600.0);
        IndividualEmployee employee4 = new IndividualEmployee("employee 4", 2000.0);

        manager.add(employee1);
        manager.add(employee2);
        manager.add(employee3);
        manager.add(employee4);

        manager.showDetails();
    }
}
