package Aufgabenblock2;

public class OverloadApp {
    public static void main(String[] args) {
        Overload o1 = new Overload("Dominik");
        o1.print();
        Overload o2 = new Overload(o1);
        o2.print("Hallo zusammen!");
    }
}
