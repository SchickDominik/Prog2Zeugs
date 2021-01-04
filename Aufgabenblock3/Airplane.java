package Aufgabenblock3;

abstract class Airplane extends FlyingBody implements iLandable{
    public final static int DEFAULT_WINGS_COUNT = 1;
    private int wingsCount = DEFAULT_WINGS_COUNT;
    private int minRunwayLength;
    private int minRunwayWidth;

    public Airplane(int maxSpeed, String manufacturer, int wingsCount) {
        super(maxSpeed, manufacturer);
        this.wingsCount = wingsCount;
    }
    
    public int getWingsCount() { 
        return this.wingsCount; 
    }
    public void setWingsCount(int wingsCount) { 
        if (wingsCount > 0) this.wingsCount = wingsCount;
    }
    // per default soll ein Flugzeug keinen looping können 
    public boolean getLooping() { 
        return false; 
    } 
    @Override
    public String toString() {
        return "Airplane [manufacturer=" + getManufacturer() + ", maxSpeed=" +    maxSpeed + ", wingsCount=" + wingsCount + "]";
    }
    
    public boolean landingCheck(Runway r) {
        if (this.getMinRunwayLength() <= r.getLength() && this.getMinRunwayWidth() <= r.getWidth()) {
            return true;
        }
        else {
            return false;
        }
    }

    public int getMinRunwayLength() {
        return minRunwayLength;
    }

    public void setMinRunwayLength(int minRunwayLength) {
        if (minRunwayLength > 0 ){
            this.minRunwayLength = minRunwayLength;
        }
    }

    public int getMinRunwayWidth() {
        return minRunwayWidth;
    }

    public void setMinRunwayWidth(int minRunwayWidth) {
        if (minRunwayWidth > 0) {
            this.minRunwayWidth = minRunwayWidth;
        }
    }
}