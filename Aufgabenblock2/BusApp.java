package Aufgabenblock2;

public class BusApp {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        System.out.println(b1.getCurrentPassenger());
        b1.getIn();
        System.out.println(b1.getCurrentPassenger());
        b1.getOut();
        System.out.println(b1.getCurrentPassenger());
        b1.getIn(20);
        System.out.println(b1.getCurrentPassenger());
        b1.getOut(24);
        System.out.println(b1.getCurrentPassenger()); //Ergibt -4 Fahrgäste.

        System.out.println("######################################");

        Bus witz = new Bus();
        witz.getIn(3);
        System.out.println(witz.getCurrentPassenger());
        witz.getOut(5);
        System.out.println(witz.getCurrentPassenger());
        witz.getIn(2);
        System.out.println(witz.getCurrentPassenger() == 0);
        System.out.println("Haha!");
    }
}
