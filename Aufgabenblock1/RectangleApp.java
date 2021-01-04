package A3;

import java.util.Scanner;

public class RectangleApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Rechteckseiten einzeln eingeben: \n");
        float a = input.nextFloat();
        float b = input.nextFloat();
        System.out.println("Umfang: ");
        System.out.printf("%.2f",(2*a+2*b));
        System.out.println("\nFläche: ");
        System.out.printf("%.2f",(a*b));
        System.out.println("\nIst Quadrat: ");
        if (a==b) {
            System.out.println("wahr");
        }
        else {
            System.out.println("falsch");
        }
        input.close();
    }
}
