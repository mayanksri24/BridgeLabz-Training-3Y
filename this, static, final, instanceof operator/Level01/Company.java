public class Company {
    private static String companyName;
    private static int employeeCount = 0;

    private final int id;
    private String name;
    private String role;

    public Company(String name, int id, String role) {
        this.name = name;
        this.id = id;
        this.role = role;
        employeeCount++;
    }

    public static void setCompanyName(String name) {
        companyName = name;
    }

    public static void showTotalEmployees() {
        System.out.println("Total Employees: " + employeeCount);
    }

    public void showDetails() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + role);
    }

    public static void main(String[] args) {
        Company.setCompanyName("Tech Solutions Inc.");

        Company e1 = new Company("Thamarai", 101, "Software Engineer");
        Company e2 = new Company("Rohan", 102, "Project Manager");

        Company.showTotalEmployees();
        e1.showDetails();
        e2.showDetails();
    }
}
