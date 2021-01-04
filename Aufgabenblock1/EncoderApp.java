package A3;

public class EncoderApp {  
    public static void main ( String [] args ) throws Exception {
        // Arbeitsobjekt anlegen
        Encoder worker = new Encoder();

        // Ein Array mit 15 Werten anlegen und weitere Referenzen
        int[] values= new int[15];
        int[] reversedArray, encodedArray, decodedArray;

        // Werte in Eingabe-Array einlesen und ausgeben
        worker.input(values);System.out.println(" -----------Eingabewerte:  ----");
        worker.print(values);

        // Eingabe-Array drehen und ausgeben
        reversedArray = worker.reverse(values);
        System.out.println(" -----------Nach Drehung:  ----");
        worker.print(reversedArray);

        // Eingabe-Array komprimierenund ausgeben
        encodedArray = worker.encode(values);
        System.out.println (" ----------Komprimiert:  ----");
        worker.print(encodedArray);

        // Komprimiertes Array dekomprieren und ausgeben
        System.out.println (" ----------Dekomprimiert:  ----");
        decodedArray = worker.decode(encodedArray);
        worker.print(decodedArray);
        
        // Ergebnis vergleichen
        if (worker.compare(values, decodedArray))
            System.out.println("OK -Dekodierung erfolgreicht!");
        else
            System.out.println("Nicht OK -Fehler bei der Dekodierung!");
        
    }
}