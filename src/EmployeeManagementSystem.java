import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeManagementSystem {
    private List<Employee> employees;

    public EmployeeManagementSystem() {
        this.employees = new ArrayList<>();
    }

    // Create
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Read
    public void showAllEmployees() {
        System.out.println("Employee List:");
        employees.forEach(Employee::showInfo);
    }

    //delete
    public void removeEmployee(int employeeId) {
        Predicate<Employee> predicate = employee -> employee.getID() == employeeId;
        employees.removeIf(predicate);
    }

    // Update ví dụ cho ID trước mấy cái khác thêm sau do ko cóa time hehe :)))
    public void updateEmployeeID(int employeeId, Employee updatedEmployee) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.get(i);
            if (employee.getID() == employeeId) {
                employees.set(i, updatedEmployee);
                System.out.println("Employee with ID " + employeeId + " has been updated.");
                return;
            }
        }
        System.out.println("Employee with ID " + employeeId + " not found.");
    }


}
