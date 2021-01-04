package Aufgabenblock2.Aufgabe4;

import java.util.concurrent.ThreadLocalRandom;

public class Account {
    
    private int accountNumber;
    private boolean accountSet = false;
    private Person accountHolder;
    private Date openingDate;
    private float balance = 0;
    private float maxOverdraft;
    final static int MINACCOUNTNUMBER = 1000;
    final static int MAXACCOUNTNUMBER = 999999999;

    public Account(Person accountHolder) {
        this.accountHolder = accountHolder;
        this.setAccountNumber();
    }

    public Account(Person accountHolder, Date openingDate, float balance, float maxOverdraft) {
        this.setAccountNumber();
        this.accountHolder = accountHolder;
        this.openingDate = openingDate;
        this.balance = balance;
        this.maxOverdraft = maxOverdraft;
    }

    public void cashIn(float money) {
        this.setBalance(this.getBalance() + money);
    }
    public void cashOut(float money) {
        if (this.getBalance() - money < 0 && Math.abs(this.getBalance() - money) > this.getMaxOverdraft()){
            System.out.println("Abbuchung leider nicht möglich, Konto kann nicht überzogen werden.");
        }
        else {
            this.setBalance(this.getBalance() - money);
        }
    }
    //Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber() {
        if (!this.isAccountSet()){
            this.accountNumber = ThreadLocalRandom.current().nextInt(Account.MINACCOUNTNUMBER, Account.MAXACCOUNTNUMBER);
            this.setAccountSet(true); 
        }
        //Ermöglicht nur einmalige Setzung der Kontonummer und kein versehentliches Überschreiben
    }

    
    public Person getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(Person accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Date getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(Date openingDate) {
        this.openingDate = openingDate;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public float getMaxOverdraft() {
        return maxOverdraft;
    }

    public void setMaxOverdraft(float maxOverdraft) {
        this.maxOverdraft = maxOverdraft;
    }

    public boolean isAccountSet() {
        return accountSet;
    }

    public void setAccountSet(boolean accountSet) {
        this.accountSet = accountSet;
    }

}
