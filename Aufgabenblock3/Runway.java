package Aufgabenblock3;

public class Runway {
    public int length = 100;
    public int width = 50;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length > 0) {
            this.length = length;
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0) {
            this.width = width;
        }
    }

    public Runway() {
    }

    public Runway(int length, int width) {
        this.setLength(length);
        this.setWidth(width);
    }

    public Runway(Runway other) {
        this.setLength(other.getLength());
        this.setWidth(other.getWidth());
    }

    @Override
    public String toString() {
        return "Länge " + this.getLength() + " Breite: " + this.getWidth();
    }
}
