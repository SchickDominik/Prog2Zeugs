package Aufgabenblock3;

import java.time.LocalTime;

public class DoubleDecker extends Airplane {
    
    private boolean isCockpitOpen = true;
    final int LOOPING_SPEED = 320;
    
    public boolean getLooping() {
        if (this.getMaxSpeed() >= LOOPING_SPEED && !isCockpitOpen) {
            return true;
        }
        else {
            return false;
        }
    }
    @Override
    public LocalTime calcArrivalTime(LocalTime departure, int distance) {
        return departure.plusMinutes((long) (distance / (getMaxSpeed() / 60)));
    }
    public DoubleDecker(String manufacturer, int maxSpeed, boolean isCockpitOpen) {
        super(maxSpeed, manufacturer, 2);
        this.isCockpitOpen = isCockpitOpen;
    }
    public DoubleDecker(String manufacturer, int maxSpeed) {
        super(maxSpeed, manufacturer, 2);
    }

    @Override
    public String toString() {
        return "Is Cockpit open: " + this.isCockpitOpen() + 
        "\nSpeed: " + this.getMaxSpeed() +
        "\nManufacturer: " + this.getManufacturer();
    }

    public boolean isCockpitOpen() {
        return isCockpitOpen;
    }

    public void setCockpitOpen(boolean isCockpitOpen) {
        this.isCockpitOpen = isCockpitOpen;
    }
    
}
