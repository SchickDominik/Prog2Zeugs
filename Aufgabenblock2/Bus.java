package Aufgabenblock2;

public class Bus {
    private int capacity = 30;
    private int currentPassenger;

    public Bus(){
        setCurrentPassenger(0);
    }
    public Bus(int capacity) {
        setCapacity(capacity);
    }

    
    @Override
    public String toString(){
        String s = "Ich bin ein Bus mit " + currentPassenger + " Passagieren.";
        return s;
    }

    public void getOut(){
        setCurrentPassenger(getCurrentPassenger() - 1);
    }
    public void getOut(int x){
        setCurrentPassenger(getCurrentPassenger() - x);
    }

    public void getIn(){
        setCurrentPassenger(getCurrentPassenger() + 1);
    }
    public void getIn(int x){
        setCurrentPassenger(getCurrentPassenger() + x);
    }
    
    public int getCapacity() {
        return capacity;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
    public int getCurrentPassenger() {
        return currentPassenger;
    }
    public void setCurrentPassenger(int currentPassenger) {
        this.currentPassenger = currentPassenger;
    }

    
}
