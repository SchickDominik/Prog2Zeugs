package Aufgabenblock2;

import java.security.Key;

public class Keyboard {
    String productName;
    int numberOfKeys;
    boolean hasNumpad;
    boolean isWireless;

    public static void main(String[] args) {
        Keyboard k1 = new Keyboard();
        Keyboard k2 = new Keyboard("Parthica", 93, true, false);
        Keyboard k3 = new Keyboard(k2);
        k3.setHasNumpad(false);
        k3.setWireless(true);
        k3.setProductName("Parthica 2.0");
        System.out.println(k3.getProductName());
        System.out.println(k2.getNumberOfKeys());
        k2.setNumberOfKeys(-4);
        System.out.println(k2.getNumberOfKeys()); //muss gleich bleiben
        System.out.println(k2.isWireless() == k3.isWireless()); //muss false werden
        System.out.println(k2.isHasNumpad());
        k2.setHasNumpad(false);
        System.out.println(k2.isHasNumpad());

    }

    public Keyboard() {
    }
    public Keyboard(String productName, int numberOfKeys, boolean hasNumpad, boolean isWireless) {
        this.productName = productName;
        setNumberOfKeys(numberOfKeys);
        this.hasNumpad = hasNumpad;
        this.isWireless = isWireless;
    }
    public Keyboard(Keyboard other) {
        this.productName = other.productName;
        this.numberOfKeys = other.numberOfKeys;
        this.hasNumpad = other.hasNumpad;
        this.isWireless = other.isWireless;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getNumberOfKeys() {
        return numberOfKeys;
    }

    public void setNumberOfKeys(int numberOfKeys) {
        if (numberOfKeys >= 0) {
            this.numberOfKeys = numberOfKeys;
        }
    }

    public boolean isHasNumpad() {
        return hasNumpad;
    }

    public void setHasNumpad(boolean hasNumpad) {
        this.hasNumpad = hasNumpad;
    }

    public boolean isWireless() {
        return isWireless;
    }

    public void setWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }
    
}
