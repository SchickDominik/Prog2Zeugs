package Aufgabenblock3;

import java.time.LocalTime;

public class TransportAircraft extends Airplane {

    private String airline;
    private int airSpeed;
    private int maxCapacity;

    public TransportAircraft(String manufacturer, int maxSpeed, String airline, int airSpeed, int maxCapacity) {
        super(maxSpeed, manufacturer, DEFAULT_WINGS_COUNT);
        this.airline = airline;
        this.airSpeed = airSpeed;
        this.maxCapacity = maxCapacity;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public int getAirSpeed() {
        return airSpeed;
    }

    public void setAirSpeed(int airSpeed) {
        if (airSpeed > 0 && airSpeed < this.getMaxSpeed()) {
            this.airSpeed = airSpeed;
        }
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        if (maxCapacity > 0) {
            this.maxCapacity = maxCapacity;
        }
    }

    @Override
    public LocalTime calcArrivalTime(LocalTime departure, int distance) {
        LocalTime arrival = departure.plusMinutes((long) (distance / (getMaxSpeed() / 60)));
        return arrival;
    }
    public LocalTime calcArrivalTime(LocalTime departure, int distance, boolean flyingWithMaxSpeed) {
        LocalTime arrival;
        if (flyingWithMaxSpeed == true) {
            arrival = calcArrivalTime(departure, distance);
        }
        else {
            arrival = departure.plusMinutes((long) (distance / (getAirSpeed() / 60)));
        }
        return arrival;
    }



    
    
}
