import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {
    Plane plane;

    @Before
    public void before(){
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasCapacity(){
        assertEquals(150, plane.getPlane().getCapacity());
    }

    @Test
    public void planeHasWeight(){
        assertEquals(1000, plane.getPlane().getTotalWeight());
    }
}
