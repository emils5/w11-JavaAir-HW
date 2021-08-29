import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void before(){
        pilot = new Pilot("Mark", Rank.CAPTAIN, "AB");
    }

    @Test
    public void pilotHasRank(){
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicense(){
        assertEquals("AB", pilot.getLicence());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("Welcome onboard. Your captain is speaking", pilot.flyPlane());
    }

}
