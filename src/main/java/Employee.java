public class Employee {
    // attributes
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;

    // constructor
    public Employee(int employeeId, String name, String department,
                    double payRate, double hoursWorked) {

        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;

    }

    // Getters

    // Get employee Id
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

}
