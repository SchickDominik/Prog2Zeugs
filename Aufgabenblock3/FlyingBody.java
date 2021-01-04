package Aufgabenblock3;

import java.time.LocalTime;

public abstract class FlyingBody {
    public final static int DEFAULT_MAX_SPEED = 100;
    int maxSpeed= DEFAULT_MAX_SPEED;
    private String manufacturer;
    
    public String getManufacturer() {
        return this.manufacturer; 
    }
    public void setManufacturer(String manufacturer) { 
        this.manufacturer = manufacturer; 
    }
    public int getMaxSpeed() { 
        return this.maxSpeed; 
    }
    public void setMaxSpeed(int maxSpeed) { 
        if(maxSpeed > 0) this.maxSpeed = maxSpeed; 
    }

    public FlyingBody(int maxSpeed, String manufacturer) {
        this.maxSpeed = maxSpeed;
        this.manufacturer = manufacturer;
    }

    public abstract LocalTime calcArrivalTime(LocalTime departure, int distance);
}
