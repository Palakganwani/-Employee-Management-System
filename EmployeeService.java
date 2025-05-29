import java.util.*;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();
    private int currentId = 1;

    public void addEmployee(String name, int age, double salary, String department, String role) {
        Employee emp = new Employee(currentId++, name, age, salary, department, role);
        employees.add(emp);
        System.out.println("Employee added successfully with ID: " + emp.getId());
    }

    public void updateEmployee(int id, Scanner sc) {
        Employee emp = findById(id);
        if (emp == null) {
            System.out.println("Employee not found.");
            return;
        }
        System.out.print("Enter new name: ");
        emp.setName(sc.next());
        System.out.print("Enter new age: ");
        emp.setAge(sc.nextInt());
        System.out.print("Enter new salary: ");
        emp.setSalary(sc.nextDouble());
        System.out.print("Enter new department: ");
        emp.setDepartment(sc.next());
        System.out.print("Enter new role: ");
        emp.setRole(sc.next());
        System.out.println("Employee updated.");
    }

    public void deleteEmployee(int id) {
        Employee emp = findById(id);
        if (emp != null) {
            employees.remove(emp);
            System.out.println("Employee deleted.");
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void searchById(int id) {
        Employee emp = findById(id);
        if (emp != null) {
            System.out.println(emp);
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void searchByName(String name) {
        boolean found = false;
        for (Employee e : employees) {
            if (e.toString().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(e);
                found = true;
            }
        }
        if (!found) System.out.println("No employee found with that name.");
    }

    public void showAll() {
        if (employees.isEmpty()) {
            System.out.println("No employees to show.");
            return;
        }
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    public void filterByDepartment(String department) {
        boolean found = false;
        for (Employee e : employees) {
            if (e.toString().toLowerCase().contains(department.toLowerCase())) {
                System.out.println(e);
                found = true;
            }
        }
        if (!found) System.out.println("No employees found in that department.");
    }

    public void sortByName() {
        employees.sort(Comparator.comparing(e -> e.toString().toLowerCase()));
        System.out.println("Sorted by name:");
        showAll();
    }

    public void sortBySalaryDesc() {
        employees.sort((a, b) -> Double.compare(b.getSalary(), a.getSalary()));
        System.out.println("Sorted by salary (descending):");
        showAll();
    }

    private Employee findById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) return e;
        }
        return null;
    }
}
