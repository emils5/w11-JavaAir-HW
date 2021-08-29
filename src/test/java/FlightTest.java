import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    Flight flight;
    Pilot pilot;
    ArrayList<CabinCrew> cabinCrews;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    ArrayList<Passenger> passengers;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Plane plane1;

    @Before
    public void before(){
        pilot = new Pilot("Mark", Rank.CAPTAIN, "AB");
        cabinCrew1 = new CabinCrew("Jackie", Rank.FLIGHT_ATTENDANT);
        cabinCrew2 = new CabinCrew("Jen", Rank.FLIGHT_ATTENDANT);
        passenger1 = new Passenger("Alex", 2);
        passenger2 = new Passenger("Luis", 1);
        passenger3 = new Passenger("Joe", 1);
        plane1 = new Plane(PlaneType.AIRBUS320);
        flight = new Flight(pilot, cabinCrews, passengers, plane1,"TK101", "IST",
                "GLA","08:00");
    }


    @Test
    public void flightHasPilot(){
        assertEquals(pilot, flight.getPilot());
    }

    @Test
    public void flightHasPlane(){
        assertEquals(plane1, flight.getPlane());
    }

    @Test
    public void hasFlightNumber(){
        assertEquals("TK101", flight.getFlightNumber());
    }

    @Test
    public void hasDestination(){
        assertEquals("IST", flight.getDestination());
    }

    @Test
    public void hasDepartureAirport(){
        assertEquals("GLA", flight.getDepartureAirport());
    }

    @Test
    public void hasDepartureTime(){
        assertEquals("08:00", flight.getDepartureTime());
    }

    @Test
    public void canShowNumberOfEmptySeats(){
        flight.bookPassenger(passenger1);
        assertEquals(119, flight.getNumberOfAvailableSeats());
    }

    @Test
    public void canBookPassenger(){
        flight.bookPassenger(passenger1);
        flight.bookPassenger(passenger2);
        assertEquals(2, flight.getPassengerNumber());
    }


}
