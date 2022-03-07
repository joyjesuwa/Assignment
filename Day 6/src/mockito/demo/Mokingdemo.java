package mockito.demo;

import org.junit.Before;
import org.mockito.Mockito;
public class Mokingdemo {
    EmployeeService employeeService;

    @Before
    public void setUp() {
        employeeService = Mockito.mock(EmployeeService.class);
        EmployeeManager employeeManager = new EmployeeManager();
        employeeManager.setEmployeeService(employeeService);
    }
}
