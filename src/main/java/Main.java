
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

        // TESTING - cleanRoom() method
        System.out.println("\n=== CLEAN ROOM ===");
        room1.cleanRoom();
        System.out.println("Occupied: " + room1.isOccupied());
        System.out.println("Dirty: " + room1.isDirty());
        System.out.println("Available: " + room1.isAvailable());

        // TESTING - RESERVATION

        Reservation reservation1 = new Reservation("king", 3, true);

        System.out.println("\n=== RESERVATION TEST ===");
        System.out.println("Room Type: " + reservation1.getRoomType());
        System.out.println("Weekend: " + reservation1.isWeekend());
        System.out.printf("Nightly Price: $%.2f%n", reservation1.getReservationTotal());

        // TEST SETTERS
        reservation1.setRoomType("double");
        reservation1.setNumberOfNights(2);
        reservation1.setWeekend(false);

        System.out.println("\nUpdated Nights: " + reservation1.getNumberOfNights());
        System.out.printf("Updated Total: $%.2f%n", reservation1.getReservationTotal());

        // Create employee object
        Employee employee1 = new Employee(
                101, "Phil", "Front Desk", 20.00, 45);

        System.out.println("=== MANUAL TIME CARD ===");

        // Exercise 2 - add testing for new methods punchIn() & punchOut() - manual
        // Employee clocks in at 9 am
        employee1.punchIn(9);

        //Employee then clocks out at 5 pm
        employee1.punchOut(17);


        System.out.println();

        // Exercise 2  - display updated hours and pay
        // Test employee methods

        System.out.println("Employee: " + employee1.getName());
        System.out.println("Hours Worked: " + employee1.getHoursWorked());
        System.out.println("Regular Hours: " + employee1.getRegularHours());
        System.out.println("Overtime Hours: " + employee1.getOvertimeHours());

        System.out.printf("Total Pay: $%.2f%n", employee1.getTotalPay());

        // New Exercise 3 overloaded methods
        System.out.println("\n=== AUTOMATIC TIME CARD ===");

        // Automatically clock in using current time
        employee1.punchIn();

        // Automatically clock out using current time
        employee1.punchOut();

        System.out.println("Updated Hours: " + employee1.getHoursWorked());


        // HOTEL TEST STARTS HERE

        Hotel hotel1 = new Hotel("Hotel California", 20, 60);

        System.out.println("\n=== HOTEL TEST ===");

        // Display hotel information
        System.out.println("Hotel: " + hotel1.getName());
        System.out.println("Total Suites: " + hotel1.getNumberOfSuites());
        System.out.println("Total Basic Rooms: " + hotel1.getNumberOfRooms());

        // Check availability before booking
        System.out.println("\n=== BEFORE BOOKING ===");
        System.out.println("Available Suites: " + hotel1.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel1.getAvailableRooms());

        // Book 3 King suites
        boolean suiteBooked = hotel1.bookRoom(3, true);

        // Book 20 basic rooms
        boolean basicBooked = hotel1.bookRoom(20,false);


        // Display booking results
        System.out.println("\n=== BOOKING RESULTS ===");
        System.out.println("Suite Booking Successful: " + suiteBooked);
        System.out.println("Basic Booking Successful: " + basicBooked);


        // Check availability after booking
        System.out.println("\n=== BOOKING RESULTS ===");
        System.out.println("Booked Suites: " + hotel1.getBookedSuites());
        System.out.println("Booked Basic Rooms: " + hotel1.getBookedBasicRooms());
        System.out.println("Available Suites: " + hotel1.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel1.getAvailableRooms());

        // Second constructor test //

        Hotel hotel2 = new Hotel("New York New York", 10, 30, 3, 15);

        System.out.println("\n=== SECOND HOTEL TEST ===");

        System.out.println("Hotel: " + hotel2.getName());
        System.out.println("Booked Suites: " + hotel2.getBookedSuites());
        System.out.println("Booked Rooms: " + hotel2.getBookedBasicRooms());
        System.out.println("Available Suites: " + hotel2.getAvailableSuites());
        System.out.println("Available Rooms: " + hotel2.getAvailableRooms());


    }
}
