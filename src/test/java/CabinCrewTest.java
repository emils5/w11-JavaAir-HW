import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {
    CabinCrew cabinCrew1;

    @Before
    public void name() {
        cabinCrew1 = new CabinCrew("Jackie", Rank.FLIGHT_ATTENDANT);
    }

    @Test
    public void hasRank() {
        assertEquals(Rank.FLIGHT_ATTENDANT, cabinCrew1.getRank());
    }

    @Test
    public void canMakeAnnouncement(){
        assertEquals("Fasten your seatbelts", cabinCrew1.messageToPassengers("Fasten your seatbelts"));
    }
}
