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
}
