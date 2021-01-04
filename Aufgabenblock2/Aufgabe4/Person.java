package Aufgabenblock2.Aufgabe4;

public class Person {
    private String lastname;
    private String surname;
    private String phoneNumber;
    private Address address;
    private String email;
    private Date dateOfBirth;

    public Person(String lastname, String surname) {
        this.lastname = lastname;
        this.surname = surname;
    }

    public Person(String lastname, String surname, String phoneNumber, Address address, String email, Date dateOfBirth) {
        this.lastname = lastname;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        String mandatory = "Ich bin " + this.getSurname() + " " + this.getLastname();
        if (this.getPhoneNumber() != null) {
            mandatory += "\nTelefonnummer: " + this.getPhoneNumber();
        }
        if (this.getAddress() != null) {
            mandatory += "\nAdresse: " + this.getAddress().toString();
        }
        if (this.getEmail() != null) {
            mandatory += "\nEmail: " + this.getEmail();
        }
        if (this.getDateOfBirth() != null) {
            mandatory += "\nGeburtsdatum: " + Integer.toString(this.getDateOfBirth().getDay()) + "." + Integer.toString(this.getDateOfBirth().getMonth()) + "." + Integer.toString(this.getDateOfBirth().getYear());
        }
        return mandatory;
    }

    //Getter und Setter, standard
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
}
