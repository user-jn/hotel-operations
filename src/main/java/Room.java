public class Room {
    // attributes (what the room Knows)
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;


    // constructor (Sets the initial values)

    public Room(int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {

        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }
    // getters + derived getters

    // get number of beds
    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    // Get room price
    public double getPrice() {
        return price;
    }

    // Check if room is occupied
    public boolean isOccupied() {
        return isOccupied;
    }

    // Check if room is dirty
    public boolean isDirty() {
        return isDirty;
    }

    // Derived getter - calculates availability must be empty and clean
    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    // updating room with methods
    // Check in a guest
    public void checkIn() {
        // Only check in if room is available
        if (isAvailable()) {
            isOccupied = true;
            isDirty = true;
        }
    }

    // check out a guest
    public void checkOut() {
            isOccupied = false;
        }

        // Clean room
        public void cleanRoom() {

            // Only clean if room is not occupied
            if (isOccupied) {
                isDirty = false;

            }
        }

    }