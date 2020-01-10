public class FlightManager {

    private Flight flight;

    public FlightManager(Flight flight) {
        this.flight = flight;
    }

    public int calculateWeightPerPassenger() {
        Plane plane = this.flight.getPlane();
        int availableWeight = (plane.getWeight() / 2) / plane.getCapacity();
        return availableWeight;
    }

    public int weightBookedByPassenger(Passenger passenger) {
        int weight = 5 * passenger.getNumberOfBags();
        return weight;
    }
}
