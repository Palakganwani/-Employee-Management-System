public class Employee {
    private int id;
    private String name;
    private int age;
    private double salary;
    private String department;
    private String role;

    public Employee(int id, String name, int age, double salary, String department, String role) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.department = department;
        this.role = role;
    }

    public int getId() { return id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setSalary(double salary) { this.salary = salary; }
    public void setDepartment(String department) { this.department = department; }
    public void setRole(String role) { this.role = role; }

    
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Age: " + age +
               ", Salary: " + salary + ", Department: " + department +
               ", Role: " + role;
    }

    public double getSalary() {
    return salary;
    }

}
