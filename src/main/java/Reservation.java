
public class Reservation {

    // Attributes (what the reservation KNOWS)
    private String roomType;
    private int numberOfNights;
    private boolean weekend;

    // Constructor (sets the initial values)
    public Reservation(String roomType, int numberOfNights, boolean weekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.weekend = weekend;
    }

    // Get room type
    public String getRoomType() {
        return roomType;
    }

    // Change room type
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    // Derived getter - calculate nightly price
    public double getPrice() {

        double price = 0;

        if (roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        }

        // Increase price by 10% for weekend
        if (weekend) {
            price = price * 1.10;
        }

        return price;
    }

    // Get number of nights
    public int getNumberOfNights() {
        return numberOfNights;
    }

    // Change number of nights
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    // Check weekend status
    public boolean isWeekend() {
        return weekend;
    }

    // Change weekend status
    public void setWeekend(boolean weekend) {
        this.weekend = weekend;
    }

    // Derived getter - calculate reservation total
    public double getReservationTotal() {
        return getPrice() * numberOfNights;
    }
}


