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

}

}
