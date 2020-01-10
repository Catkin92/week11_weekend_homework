public class Passenger {

    private String name;
    private int bags;
    private Flight flight;
    private Integer seatNumber;

    public Passenger(String name, int bags) {
        this.name = name;
        this.bags = bags;
        this.flight = null;
        this.seatNumber = null;
    }

    public String getName() {
        return this.name;
    }

    public int getNumberOfBags() {
        return this.bags;
    }

    public Flight getFlight() {
        return this.flight;
    }

    public void addFlight(Flight flight) {
        this.flight = flight;
    }

    public Integer getSeatNumber() {
        return this.seatNumber;
    }
}
