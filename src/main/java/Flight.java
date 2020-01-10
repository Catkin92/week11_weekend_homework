import java.util.ArrayList;

public class Flight {

    private Plane plane;
    private String flightNumber;
    private ArrayList<Passenger> passengers;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Plane plane, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.passengers = new ArrayList<Passenger>();
    }


    public Plane getPlane() {
        return this.plane;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getDestination() {
        return this.destination;
    }

    public String getDepartureAirport() {
        return this.departureAirport;
    }

    public String getDepartureTime() {
        return this.departureTime;
    }

    public int getPassengerCount() {
        return this.passengers.size();
    }

    public ArrayList<Passenger> getPassengers() {
        ArrayList<Passenger> passengerList =  this.passengers;
        return passengerList;
    }

    public int availableSeatCount() {
        int availableSeats = this.plane.getCapacity() - this.getPassengerCount();
        return availableSeats;
    }

    public void addPassenger(Passenger passenger) {
        if (this.availableSeatCount() > 0) {
            this.passengers.add(passenger);
        }
    }
}
