import java.util.*;

class Employee {
    private String empName;
    private String role;

    public Employee(String empName, String role) {
        this.empName = empName;
        this.role = role;
    }

    public void display() {
        System.out.println(empName + " - " + role);
    }
}

class Department {
    private String deptName;
    private List<Employee> employees = new ArrayList<>();

    public Department(String deptName) {
        this.deptName = deptName;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showDept() {
        System.out.println("Department: " + deptName);
        for (Employee e : employees) {
            e.display();
        }
    }
}

class Company {
    private String companyName;
    private List<Department> departments = new ArrayList<>();

    public Company(String companyName) {
        this.companyName = companyName;
    }

    public void addDepartment(Department d) {
        departments.add(d);
    }

    public void showCompany() {
        System.out.println("Company: " + companyName);
        for (Department d : departments) {
            d.showDept();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Company comp = new Company("TechWorks");

        Department it = new Department("IT");
        Department hr = new Department("HR");

        it.addEmployee(new Employee("Suresh", "Developer"));
        it.addEmployee(new Employee("Kiran", "Tester"));

        hr.addEmployee(new Employee("Priya", "Recruiter"));
        hr.addEmployee(new Employee("Anita", "Trainer"));

        comp.addDepartment(it);
        comp.addDepartment(hr);

        comp.showCompany();
    }
}
