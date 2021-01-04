package A3;

import java.util.Scanner;

public class InterestApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Eingabe Zinssatz: ");
        float p = scanner.nextFloat();
        System.out.print("Eingabe Anfangskapital: ");
        float kAnfang = scanner.nextFloat();
        System.out.print("Eingabe Anlagedauer: ");
        int n = scanner.nextInt();
        if (n < 1) {
            System.out.println("Bitte korrekte Anlagedauer eingeben.");
        }
        else {
            double kVerzinst = kAnfang * (Math.pow(1+p, n));
            System.out.println("Endkapital: " + kVerzinst);
            System.out.println("Zinsertrag: " + (kVerzinst-kAnfang));
            System.out.println(Math.pow(1+p, n));
        }
        scanner.close();
    }
    
}
