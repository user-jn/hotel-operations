
import java.time.LocalDateTime;
import java.time.Duration;
import java.time.LocalDateTime; // exercise 3 modify employee.jave w/overloaded methods for punchIn() & punchOut()

public class Employee {

    // Attributes (what the employee KNOWS)
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // Employee time card
    private int startTime;

    // Exercise 3 - store actual clocks in date & time
    private LocalDateTime clockInTime;

    // now track whether employee is clocked in
    private boolean punchedIn;



    // Constructor (sets the initial values)
    public Employee(int employeeId, String name, String department,
                    double payRate, double hoursWorked) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

        this.punchedIn = false;
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

    // Exercise 2 - Clock in employee
    public void punchIn(int time) {

        // Save the time employee started working
        startTime = time;
    }

    // Exercise 2 - Clock out employee
    public void punchOut(int time) {

        // Calculate hours worked during this shift
        int hoursWorkedThisShift = time - startTime;

        // Add shift hours to total hours worked
        hoursWorked += hoursWorkedThisShift;
    }

    // Exercise 3  overloaded methods
    // Overloaded punch in - automatically get current time
    public void punchIn() {

        // Get current date and time
        LocalDateTime now = LocalDateTime.now();

        // Save actual clock-in time, including minutes
        clockInTime = now;

        // also save the hour
        startTime = now.getHour();

        punchedIn = true;

        System.out.println("Clocked in at " + now.getHour() + ":" + String.format("%02d", now.getMinute()));
    }

    //

    }
}




