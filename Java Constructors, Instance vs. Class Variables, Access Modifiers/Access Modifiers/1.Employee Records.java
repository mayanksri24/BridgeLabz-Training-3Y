
class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    // Constructor
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Public method to update private salary
    public void updateSalary(double newSalary) {
        this.salary = newSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployee() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + salary);
    }
}

class Manager extends Employee {
    private String team;

    public Manager(int employeeID, String department, double salary, String team) {
        super(employeeID, department, salary);
        this.team = team;
    }

    public void displayManager() {
        // Access public employeeID and protected department
        System.out.println("Manager - ID: " + employeeID + ", Department: " + department + ", Team: " + team);
    }

    public static void main(String[] args) {
        Manager m1 = new Manager(201, "IT", 75000, "Backend Team");
        m1.displayEmployee();
        m1.displayManager();
        m1.updateSalary(80000);
        System.out.println("Updated Salary: " + m1.getSalary());
    }
}
