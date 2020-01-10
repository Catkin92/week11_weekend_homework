import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {

    private FlightManager flightManager;
    private FlightManager flightManager2;
    private Plane plane1;
    private Plane plane2;
    private Flight flight1;
    private Flight flight2;
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.BOEING787);
        flight1 = new Flight(plane1, "FR756", "AMS", "EDI", "10:00");
        flight2 = new Flight(plane2, "GZ724", "SIA", "GLA", "12:00");
        flightManager = new FlightManager(flight1);
        flightManager2 = new FlightManager(flight2);
        passenger1 = new Passenger("Eugene Kim", 3);
        passenger2 = new Passenger("Nelson Bananabread", 1);
        passenger3 = new Passenger("Daniel Toth", 1);
    }

    @Test
    public void canCalculateBaggageWeightAvailablePerPassenger() {
        assertEquals(50, flightManager.calculateWeightPerPassenger());
        assertEquals(10, flightManager2.calculateWeightPerPassenger());
    }

    @Test
    public void canCalculateWeightBookedByPassenger() {
        assertEquals(15, flightManager.weightBookedByPassenger(passenger1));
    }

    @Test
    public void canCalculateBaggageWeightRemaining() {
        flight1.addPassenger(passenger1);
        flight1.addPassenger(passenger2);
        assertEquals(1480, flightManager.calculateWeightRemaining());
    }

    @Test
    public void canAddPassengerToFlight() {
        flightManager.addPassenger(passenger1);
        assertEquals(29, flight1.availableSeatCount());
        assertEquals(flight1, passenger1.getFlight());
    }

    @Test
    public void cannotAddPassengerToFlightMaxCapacity() {
        flightManager2.addPassenger(passenger2);
        flightManager2.addPassenger(passenger3);
        assertEquals(1, flight2.getPassengerCount());
    }

    @Test
    public void cannotAddPassengerToFlightTooMuchBaggage() {
        flightManager2.addPassenger(passenger1);
        assertEquals(0, flight2.getPassengerCount());
    }
}
