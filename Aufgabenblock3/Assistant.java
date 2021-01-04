package Aufgabenblock3;

public class Assistant extends Employee{
    int persNumber;
    public Assistant(String name, Date dateOfBirth, int salary, int persNumber) {
        super(name, dateOfBirth, salary); //Sorgt für Mindestalter 20 und Gehaltsgrenzen
        this.setPersNumber(persNumber);
    }

    public int getPersNumber() {
        return persNumber;
    }

    public void setPersNumber(int persNumber) {
        if (persNumber > 0) {
            this.persNumber = persNumber;
        }
    }
    
}
