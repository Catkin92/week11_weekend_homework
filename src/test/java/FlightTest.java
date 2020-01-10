import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    private Plane plane;
    private Flight flight;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
        flight = new Flight(plane, "FR756", "AMS", "EDI", "10:00");
    }

    @Test
    public void canGetPlane() {
        assertEquals(plane, flight.getPlane());
    }

    @Test
    public void canGetFlightNumber() {
        assertEquals("FR756", flight.getFlightNumber());
    }
}
