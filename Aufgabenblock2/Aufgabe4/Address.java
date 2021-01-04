package Aufgabenblock2.Aufgabe4;

public class Address {
    private String street;
    private int streetNumber;
    private int postalCode;
    private String city;
    private String country;

    public Address(String street, int streetNumber, int postalCode, String city, String country) {
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.country = country;
    }

    @Override
    public String toString() {
        return this.street + " " + Integer.toString(streetNumber) + ", " + Integer.toString(postalCode) + " " + city + ", " + country;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country.length() > 3 || country.length() < 0) {
            System.out.println("Ungültiges Länderkennzeichen");
        }
        else {
            this.country = country;
        }
    }

    public int getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(int postalCode) {
        if (postalCode > 0) {
            this.postalCode = postalCode;
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }
}
