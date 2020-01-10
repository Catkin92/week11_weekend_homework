import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void canGetPlaneType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void canGetPlaneCapacity() {
        assertEquals(30, plane.getCapacity());
    }

    @Test
    public void canGetPlaneWeight() {
        assertEquals(3000, plane.getWeight());
    }
}
