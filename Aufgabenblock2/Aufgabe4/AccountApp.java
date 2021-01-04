package Aufgabenblock2.Aufgabe4;

public class AccountApp {
    
    public static void testDate() {
        Date d1 = new Date();
        System.out.println(d1);
        Date d2 = new Date(2020,10,18);
        System.out.println(d2);
        Date dWrong = new Date(10,10,2020);
    }

    public static void testAddress() {
        Address a1 = new Address("Poststrasse", 6, 72458, "Albstadt", "DE");
        System.out.println(a1);
        Address aWrong = new Address("Poststrasse", 6, 72458, "Albstadt", "Deutschland");
    }

    public static void testPerson() {
        Person p1 = new Person("Schick", "Dominik");
        System.out.println(p1);
        Address peterAddress = new Address("Treestreet", 61, 984312, "Nowhere", "Neverland");
        Date peterBirth = new Date(1904, 12, 27);
        Person p2 = new Person("Pan", "Peter", "017076543210", peterAddress, "Peter@Pan.email.com", peterBirth);
        System.out.println(p2);
    }

    public static void testAccount() {
        Person p1 = new Person("Lothbrok", "Ragnar");
        Account myAccount = new Account(p1);
        System.out.println(myAccount.getAccountNumber());
        System.out.println(myAccount.getBalance());
        Person p2 = new Person("Paulson", "Paul");
        Date dPaul = Date.today();
        Account paulAccount = new Account(p2, dPaul, 1500, 800);
        System.out.println(paulAccount.getAccountNumber());
        paulAccount.cashIn(200);
        System.out.println(paulAccount.getBalance());
        paulAccount.cashOut(1200);
        System.out.println(paulAccount.getBalance());
        paulAccount.cashOut(1500);
    }

    public static void main(String[] args) {
        AccountApp.testPerson();
    }
}
