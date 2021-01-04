package A3;

import java.util.Locale;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        int auswahl = 1;
        do {
            System.out.println("Sie haben die Auswahl zwischen folgenden Berechnungen: \n");
            System.out.println("[1] |x|\n");
            System.out.println("[2] sin(x)\n");
            System.out.println("[3] cos(x)\n");
            System.out.println("[4] Ende der Berechnung\n");
            System.out.println("Treffen Sie eine Auswahl 1 bis 4: \n");
            auswahl = input.nextInt();
            switch (auswahl) {
                case 1:
                    System.out.println("Bitte geben Sie x ein:\n");
                    double x1 = input.nextFloat();
                    System.out.println("|"+x1+"| = "+(Math.abs(x1)));
                    break;
                case 2:
                    System.out.println("Bitte geben Sie x ein:\n");
                    double x2 = input.nextFloat();
                    System.out.println("sin("+x2+")= "+(Math.sin(x2)));
                    break;
                case 3:
                    System.out.println("Bitte geben Sie x ein:\n");
                    double x3 = input.nextFloat();
                    System.out.println("cos("+x3+")= "+(Math.cos(x3)));
                    break;
                case 4:
                    System.out.println("Auswahl beendet!");
                    break;
                default:
                    System.out.println("Ungültige Eingabe");
                    break;
            }
        } while (auswahl != 4);
        input.close();
    }
}
