public class Room {
        // attributes (what the room Knows)
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

        // constructor (Sets the initial values)

    public Room( int numberOfBeds, double price, boolean isOccupied, boolean isDirty) {

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

        // Derived getter - calculates availability
        public boolean isAvailable() {
            return !isOccupied && !isDirty;
        }
    }

