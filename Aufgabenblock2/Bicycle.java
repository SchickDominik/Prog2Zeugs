package Aufgabenblock2;

public class Bicycle {
    int brakes;
    int velocity;
    String name;
    String bikeType;

    public Bicycle() {
    }
    public Bicycle(int brakes, int velocity, String name, String bikeType) {
        this.brakes = brakes;
        this.velocity = velocity;
        this.name = name;
        this.bikeType = bikeType;
    }
    public Bicycle(Bicycle other) {
        this.brakes = other.brakes;
        this.velocity = other.velocity;
        this.name = other.name;
        this.bikeType = other.bikeType;
    }

    public int getBrakes() {
        return brakes;
    }

    public void setBrakes(int brakes) {
        this.brakes = brakes;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    
}
