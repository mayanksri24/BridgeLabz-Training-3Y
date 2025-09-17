
package com.bridgelabz.oops.levelone;

public class EmployeeInfo {
    String empName;
    int empId;
    double empSalary;

    // Constructor
    EmployeeInfo(String name, int id, double salary) {
        empName = name;
        empId = id;
        empSalary = salary;
    }

    // Method to show details
    void showDetails() {
        System.out.println("Name : " + empName);
        System.out.println("ID   : " + empId);
        System.out.println("Salary : " + empSalary);
    }

    public static void main(String[] args) {
        EmployeeInfo e1 = new EmployeeInfo("Sohan", 101, 45000);
        e1.showDetails();
    }
}
