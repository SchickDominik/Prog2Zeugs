package Aufgabenblock2;
import Aufgabenblock2.Aufgabe4.Address;

public class Player {
    private String playerNumber;
    private String playerName;
    private Address playerAddress;
    private String playerPhone;
    private String playerFax;
    private String playerEmail;

    public Player(String playerNumber, String playerName, Address playerAddress, String playerPhone, String playerFax,
    String playerEmail) {
        this.playerNumber = playerNumber;
        this.playerName = playerName;
        this.playerAddress = playerAddress;
        this.playerPhone = playerPhone;
        this.playerFax = playerFax;
        this.playerEmail = playerEmail;
    }

    public Player(String playerNumber, String playerName) {
        this.playerNumber = playerNumber;
        this.playerName = playerName;
    }


    @Override
    public String toString() {
        String mandatory = "Ich bin " + this.getPlayerName() + " mit Nummer " + this.getPlayerNumber();
        if (this.getPlayerPhone() != null) {
            mandatory += "\nTelefonnummer: " + this.getPlayerPhone();
        }
        if (this.getPlayerAddress() != null) {
            mandatory += "\nAdresse: " + this.getPlayerAddress().toString();
        }
        if (this.getPlayerFax() != null) {
            mandatory += "\nAdresse: " + this.getPlayerFax();
        }
        if (this.getPlayerEmail() != null) {
            mandatory += "\nEmail: " + this.getPlayerEmail();
        }
        return mandatory;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(String playerNumber) {
        this.playerNumber = playerNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerNamer) {
        this.playerName = playerNamer;
    }

    public Address getPlayerAddress() {
        return playerAddress;
    }

    public void setPlayerAddress(Address playerAddress) {
        this.playerAddress = playerAddress;
    }

    public String getPlayerPhone() {
        return playerPhone;
    }

    public void setPlayerPhone(String playerPhone) {
        this.playerPhone = playerPhone;
    }

    public String getPlayerFax() {
        return playerFax;
    }

    public void setPlayerFax(String playerFax) {
        this.playerFax = playerFax;
    }

    public String getPlayerEmail() {
        return playerEmail;
    }

    public void setPlayerEmail(String playerEmail) {
        this.playerEmail = playerEmail;
    }
    
}
