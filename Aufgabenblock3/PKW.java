package Aufgabenblock3;

public class PKW extends Vehicle {
    private int maxV;

    

    public void setMaxV(int x) {
        if (x > this.getVelocity()) {
            this.maxV = x;
        }
    }

    public int getMaxV() {
        return this.maxV;
    }

    public PKW(String owner, int actV, int maxV) {
        super(owner, actV);
        this.maxV = maxV;
    }
    
    public void print(int n) {
        super.print();
        for (int i = 0; i < n; i++) {
            System.out.println("\n");
        }
    }

}
