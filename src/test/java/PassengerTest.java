import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger;
    private Flight flight;
    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
        passenger = new Passenger("Eugene Kim", 2);
        flight = new Flight(plane, "FR756", "AMS", "EDI", "10:00");
    }

    @Test
    public void canGetName() {
        assertEquals("Eugene Kim", passenger.getName());
    }

    @Test
    public void canGetNumberOfBags() {
        assertEquals(2, passenger.getNumberOfBags());
    }

    @Test
    public void canAddFlightToPassenger() {
        passenger.addFlight(flight);
        assertEquals(flight, passenger.getFlight());
    }
}
