package Aufgabenblock2;

import Aufgabenblock2.Aufgabe4.Address;

public class PlayerApp {
    public static void main(String[] args) {
        Address a1 = new Address("Musicstreet", 12, 21465, "Canberra", "AUS");
        Player hans = new Player("07", "Hans Hinterwaldler", a1, "01924321456", "01924321457", "Hans@mail.co.uk");
        Player sepp = new Player("07", "Sepp Sossenbinder", a1, "017479846542", "017479846543", "Sepp@mail.co.uk");
        System.out.println(hans.getPlayerAddress());
        System.out.println(sepp.getPlayerAddress());
        hans.getPlayerAddress().setCity("Sydney");
        System.out.println(hans.getPlayerAddress());
        System.out.println(sepp.getPlayerAddress());
    }
}
