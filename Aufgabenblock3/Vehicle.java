package Aufgabenblock3;

public class Vehicle {
    private String owner;
    private int actV;


    public void accelerate(int dV) {
        if (dV > 0) {
            actV += dV;
        }
    }
    public void decelerate(int dV) {
        if (dV > 0) {
            actV -= dV;
        }
        if (actV<0) {
            actV = 0;
        }
    }

    public void setVelocity(int v) {
        if (v > 0) {
            actV = v;
        }
    }
    public int getVelocity() {
        return actV;
    }
    public void setOwner(String o) {
        this.owner = o;
    }
    public String getOwner() {
        return this.owner;
    }

    public void print() {
        System.out.println("Owner: " + this.getOwner() + "\nVelocity: " + this.getVelocity());
    }

    public Vehicle(String owner, int actV) {
        this.owner = owner;
        this.actV = actV;
    }

}
