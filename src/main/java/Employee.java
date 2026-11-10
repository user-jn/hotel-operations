
package com.pluralsight;

public class Employee {

    // Attributes (what the employee KNOWS)
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // Constructor (sets the initial values)
    public Employee(int employeeId, String name, String department,
                    double payRate, double hoursWorked) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    // Get employee ID
    public int getEmployeeId() {
        return employeeId;
    }

    // Get employee name
    public String getName() {
        return name;
    }

    // Get department
    public String getDepartment() {
        return department;
    }

    // Get hourly pay rate
    public double getPayRate() {
        return payRate;
    }

    // Get hours worked
    public double getHoursWorked() {
        return hoursWorked;
    }

    // Derived getter - regular hours cannot exceed 40
    public double getRegularHours() {
        return Math.min(hoursWorked, 40);
    }

    // Derived getter - overtime is anything over 40
    public double getOvertimeHours() {
        return Math.max(hoursWorked - 40, 0);
    }

    // Derived getter - calculate total employee pay
    public double getTotalPay() {

        double regularPay = getRegularHours() * payRate;
        double overtimePay = getOvertimeHours() * payRate * 1.5;

        return regularPay + overtimePay;
    }
}
