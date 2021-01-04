package A3;

public class BetonEinfachApp {
    public static void main ( String [] args ) {
        double rAussen = 100; // Aussenradius der Betonroehre (in cm)
        double rInnen = 90;// Innenradius der Betonroehre (in cm)
        int laenge = 2500;// Laenge der Betonroehre (in cm) => 25m Röhre, als Beispiel

        double flaecheInnen;// Kreisflaechen der Roehre (in cm2)
        double flaecheAussen;
        double volInnen;// Volumen der Roehren (in cm3)
        double volAussen;
        double volSchacht;// Gesamtvolumen Beton(in cm3)
        int anzahlLKW;// Anzahl der benoetigten LKWs
        // Schritt 1: Innen-und Aussenflaeche berechnen und ausgeben
        flaecheInnen = Math.PI * rInnen * rInnen ;
        flaecheAussen = Math.PI * rAussen * rAussen ;
        System.out.println ("flaecheInnen ist: " + flaecheInnen );
        System.out.println ("flaecheAussen ist : " + flaecheAussen );
        
        // Schritt 2: Innen-und Aussenvolumen berechnen und ausgeben
        volInnen = flaecheInnen * laenge;
        volAussen = flaecheAussen * laenge;
        System.out.println("volInnen: " + volInnen);
        System.out.println("volAussen: " + volAussen);

        // Schritt 3: Gesamtvolumen der Roehre berechnen und ausgeben
        volSchacht = volAussen - volInnen;
        System.out.println("volSchacht: " + volSchacht);

        // Schritt 4: Anzahl LKW für Lieferung berechnen und ausgeben} 1LKW=8m³
        anzahlLKW = (int) Math.ceil(volSchacht / 8000000);
        System.out.println("Benötigte LKW: " + anzahlLKW);
    }
}
