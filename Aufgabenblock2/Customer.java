package Aufgabenblock2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Customer {
    String surname;
    String lasttname;
    Date dateOfBirth;
    String address;

    public Customer() throws ParseException {
        this.setSurname("Paul");
        this.setLasttname("Paulson");
        this.setAddress("Musterstadt");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        this.setDateOfBirth(formatter.parse("2004-03-07"));
    }
    
    public Customer(String surname, String lasttname, Date dateOfBirth, String address) {
        this.surname = surname;
        this.lasttname = lasttname;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
    }
    public Customer(Customer other) {
        this.surname = other.surname;
        this.lasttname = other.lasttname;
        this.dateOfBirth = other.dateOfBirth;
        this.address = other.address;
    }
    public Customer(String surname, String lasttname) {
        this.surname = surname;
        this.lasttname = lasttname;
        this.dateOfBirth = new Date();
        this.address = "-";
    }

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        Customer c1 = new Customer("Michael", "Michaelson", formatter.parse("1990-03-27"), "Lönneberga");
        System.out.println(c1.surname);
        System.out.println(c1.lasttname);
        System.out.println(c1.dateOfBirth);
        System.out.println(c1.address);

        Customer c2 = new Customer();
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Vorname");
        c2.setSurname(keyboard.nextLine());
        System.out.println("Nachname");
        c2.setLasttname(keyboard.nextLine());
        System.out.println("Geburtstag");
        c2.setDateOfBirth(formatter.parse(keyboard.nextLine()));
        System.out.println("Adresse");
        c2.setAddress(keyboard.nextLine());
        keyboard.close();

        System.out.println(c2.getSurname());
        System.out.println(c2.getLasttname());
        System.out.println(c2.getDateOfBirth());
        System.out.println(c2.getAddress());
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLasttname() {
        return lasttname;
    }

    public void setLasttname(String lasttname) {
        this.lasttname = lasttname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
