public class Hotel {

    // attributes
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    // constructor 1  - hotel starts with no rooms
    public Hotel(String name, int numberOfSuites, int numberOfRooms) {

        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }

    // constructor 2 - hotel starts with bookings
        public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {

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


