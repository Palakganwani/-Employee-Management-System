import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeService service = new EmployeeService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Employee Management System ===");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Delete Employee");
            System.out.println("4. Search by ID");
            System.out.println("5. Search by Name");
            System.out.println("6. Show All Employees");
            System.out.println("7. Filter by Department");
            System.out.println("8. Sort by Name");
            System.out.println("9. Sort by Salary (Descending)");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    System.out.print("Enter salary: ");
                    double salary = sc.nextDouble();
                    System.out.print("Enter department: ");
                    String dept = sc.next();
                    System.out.print("Enter role: ");
                    String role = sc.next();
                    service.addEmployee(name, age, salary, dept, role);
                    break;
                case 2:
                    System.out.print("Enter employee ID to update: ");
                    service.updateEmployee(sc.nextInt(), sc);
                    break;
                case 3:
                    System.out.print("Enter employee ID to delete: ");
                    service.deleteEmployee(sc.nextInt());
                    break;
                case 4:
                    System.out.print("Enter employee ID to search: ");
                    service.searchById(sc.nextInt());
                    break;
                case 5:
                    System.out.print("Enter name to search: ");
                    service.searchByName(sc.next());
                    break;
                case 6:
                    service.showAll();
                    break;
                case 7:
                    System.out.print("Enter department to filter: ");
                    service.filterByDepartment(sc.next());
                    break;
                case 8:
                    service.sortByName();
                    break;
                case 9:
                    service.sortBySalaryDesc();
                    break;
                case 0:
                    System.out.println("Exiting system. Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
