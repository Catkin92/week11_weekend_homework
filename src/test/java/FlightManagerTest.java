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

    @Before
    public void before() {
        plane1 = new Plane(PlaneType.BOEING747);
        plane2 = new Plane(PlaneType.BOEING787);
        flight1 = new Flight(plane1, "FR756", "AMS", "EDI", "10:00");
        flight2 = new Flight(plane2, "GZ724", "SIA", "GLA", "12:00");
        flightManager = new FlightManager(flight1);
        flightManager2 = new FlightManager(flight2);
    }

    @Test
    public void canCalculateBaggageWeightAvailablePerPassenger() {
        assertEquals(50, flightManager.calculateWeightPerPassenger());
        assertEquals(5, flightManager2.calculateWeightPerPassenger());
    }
}
