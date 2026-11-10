
public class Main {

    // Testing
    public static void main(String[] args) {

        // Create employee object
        Employee employee1 = new Employee(
                101, "John", "Front Desk", 20.00, 45);

        // Test employee methods
        System.out.println("Employee: " + employee1.getName());

        System.out.println("Regular Hours: "
                + employee1.getRegularHours());

        System.out.println("Overtime Hours: "
                + employee1.getOvertimeHours());

        System.out.printf("Total Pay: $%.2f%n",
                employee1.getTotalPay());
    }
}
