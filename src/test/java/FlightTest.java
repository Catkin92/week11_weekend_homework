import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Plane plane;
    private Flight flight;
    private Flight flight2;
    private Passenger passenger;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FR756", "AMS", "EDI", "10:00");
        flight2 = new Flight(plane, "GZ724", "SIA", "GLA", "12:00");
        passenger = new Passenger("Eugene Kim", 2);
        flight2.addPassenger(passenger);
    }

    @Test
    public void canGetPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }

    @Test
    public void canGetFlightDestination() {
        assertEquals("AMS", flight.getDestination());
    }

    @Test
    public void canGetFlightDepartureAirport() {
        assertEquals("EDI", flight.getDepartureAirport());
    }

    @Test
    public void canGetFlightDepartureTime() {
        assertEquals("10:00", flight.getDepartureTime());
    }

    @Test
    public void passengerCountStartsAtZero() {
        assertEquals(0, flight.getPassengerCount());
    }

    @Test
    public void canAddPassengersToFlight() {
        flight.addPassenger(passenger);
        assertEquals(1, flight.getPassengerCount());
    }

    @Test
    public void canGetNumberOfAvailableSeatsOnFlight() {
        assertEquals(30, flight.availableSeatCount());
        assertEquals(29, flight2.availableSeatCount());
    }
}
