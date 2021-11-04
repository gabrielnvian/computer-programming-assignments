public class Airplane {
    private String airline;
    private String origin;
    private String destination;
    private int flightNumber;
    private int numberOfPassengers;

    public Airplane(String airline, String origin, String destination, int flightNumber, int numberOfPassengers) {
        this.airline = airline;
        this.origin = origin;
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getAirline() {
        return airline;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    @Override
    public String toString() {
        return airline + " " + flightNumber + " -- From: " + origin + ", To: " + destination + " with " + numberOfPassengers + " passengers";
    }
}
