

public class Hotel {

    // Attributes (what the hotel KNOWS)
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // Constructor 1 - Hotel starts with no booked rooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {

        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    // Constructor 2 - Hotel starts with existing bookings
    public Hotel(String name, int numberOfSuites, int numberOfRooms,
                 int bookedSuites, int bookedBasicRooms) {

        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    // Get hotel name
    public String getName() {
        return name;
    }

    // Get total number of king suites
    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    // Get total number of basic double rooms
    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    // Get number of booked king suites
    public int getBookedSuites() {
        return bookedSuites;
    }

    // Get number of booked basic double rooms
    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    // Derived getter - calculate available king suites
    public int getAvailableSuites() {
        return numberOfSuites - bookedSuites;
    }

    // Derived getter - calculate available basic double rooms
    public int getAvailableRooms() {
        return numberOfRooms - bookedBasicRooms;
    }

    // Book king suites or basic double rooms
    public boolean bookRoom(int roomCount, boolean suite) {

        // Make sure requested number of rooms is valid
        if (roomCount <= 0) {
            return false;
        }

        // Check if guest wants a king suite
        if (suite) {

            // Make sure enough suites are available
            if (roomCount <= getAvailableSuites()) {
                bookedSuites += roomCount;
                return true;
            }

        } else {

            // Make sure enough basic rooms are available
            if (roomCount <= getAvailableRooms()) {
                bookedBasicRooms += roomCount;
                return true;
            }
        }

        // Booking failed if not enough rooms are available
        return false;
    }
}
