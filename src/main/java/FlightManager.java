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

    public int calculateWeightRemaining() {
        Plane plane = this.flight.getPlane();
        int weightRemaining = plane.getWeight() / 2;

        for (Passenger passenger : this.flight.getPassengers()) {
            weightRemaining -= weightBookedByPassenger(passenger);
        }
        return weightRemaining;
    }

    public int getSeatNumber() {
        int min = 1;
        int max = this.flight.getPlane().getCapacity();

        int seatNumber = (int)Math.random() * max + min;

        return seatNumber;
    }

    public void addPassenger(Passenger passenger) {

        if (this.flight.availableSeatCount() > 0 && this.calculateWeightRemaining() >= this.weightBookedByPassenger(passenger)) {
            this.flight.addPassenger(passenger);
            passenger.addFlight(this.flight);
        }
    }
}
