import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        // create a room object
        Room room1 = new Room(2, 150.00, false, false);

        //test room information
        System.out.println("=== ROOM TEST ===");
        System.out.println("Beds: " + room1.getNumberOfBeds());
        System.out.println("Price: $" + room1.getPrice());
        System.out.println("Occupied: " + room1.isOccupied());
        System.out.println("Dirty: " + room1.isDirty());
        System.out.println("Available: " + room1.isAvailable());

        // Test check-in
        System.out.println("\n=== CHECK IN ===");
        room1.checkIn();
        System.out.println("Occupied: " + room1.isOccupied());
        System.out.println("Dirty: " + room1.isDirty());
        System.out.println("Available: " + room1.isAvailable());

        // Test check out
        System.out.println("\n=== CHECK OUT ===");
        room1.checkOut();
        System.out.println("Occupied: " + room1.isOccupied());
        System.out.println("Dirty: " + room1.isDirty());
        System.out.println("Available: " + room1.isAvailable());


        // Create employee object
        Employee employee1 = new Employee(
                101, "Phil", "Front Desk", 20.00, 45);

        System.out.println();

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
