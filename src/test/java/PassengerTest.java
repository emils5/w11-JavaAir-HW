import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    Passenger passenger;

    @Before
    public void before(){
        passenger = new Passenger("Alex", 2);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Alex", passenger.getName());
    }

    @Test
    public void passengerHasBag(){
        assertEquals(2, passenger.getNumberOfBags());
    }
}
