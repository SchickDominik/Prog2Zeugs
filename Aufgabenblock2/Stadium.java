package Aufgabenblock2;

public class Stadium {
    String name = "Max Musterstadion";
    String address = "Musterstrasse 7, Musterstadt";
    int maxCapacity = 10000;
    int currentCapacity = 0;

    public static void main(String[] args) {
        Stadium s1 = new Stadium();
        System.out.println(s1.getAddress());
        Stadium s2 = new Stadium("Allianz Arena", "München", 75021, 72348);
        System.out.println(s2.getName());
        System.out.println(s2.getMaxCapacity());
        Stadium s3 = new Stadium(s2);
        System.out.println(s3.getName());
        System.out.println(s3.getCurrentCapacity());
        s3.setCurrentCapacity(10);
        System.out.println(s3.getCurrentCapacity());
        System.out.println(s2.getCurrentCapacity());
    }

    public Stadium() {
    }
    public Stadium(String name, String address, int maxCapacity, int currentCapacity) {
        this.name = name;
        this.address = address;
        setMaxCapacity(maxCapacity);
        setCurrentCapacity(currentCapacity);
    }
    public Stadium(Stadium other) {
        this.name = other.name;
        this.address = other.address;
        this.maxCapacity = other.maxCapacity;
        this.currentCapacity = other.currentCapacity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        if (maxCapacity >= 0){
            this.maxCapacity = maxCapacity;
        }
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        if (currentCapacity >= 0 && currentCapacity <= this.maxCapacity) {
            this.currentCapacity = currentCapacity;
        }
    }

    
}
