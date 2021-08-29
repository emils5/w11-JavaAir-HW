import java.util.ArrayList;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrew> cabinCrews;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrew> cabinCrews, ArrayList<Passenger> passengers, Plane plane,
                  String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilot = pilot;
        this.cabinCrews = new ArrayList<>();
        this.passengers = new ArrayList<>();
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public Plane getPlane() {
        return plane;
    }

    public int getPassengerNumber() {
        return this.passengers.size();
    }



    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public int getNumberOfAvailableSeats(){
        return this.plane.getPlane().getCapacity() - getPassengerNumber();
    }

    public boolean bookPassenger(Passenger passenger) {
        if (getPassengerNumber() < plane.getPlane().getCapacity()) {
            this.passengers.add(passenger);
            return true;
        } else {
            return false;
        }
    }
}
