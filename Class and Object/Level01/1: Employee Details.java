

class Employee {
    private String name;
    private int id;
    private double salary;

    Employee(String n, int i, double s) {
        name = n;
        id = i;
        salary = s;
    }

    void print() {
        System.out.println("Employee: " + name + " | ID: " + id + " | Salary: " + salary);
    }

    public static void main(String[] args) {
        Employee e = new Employee("Rohan", 200, 55000);
        e.print();
    }
}
