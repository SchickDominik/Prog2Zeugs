package A3;

import java.util.Scanner;

public class TriangleApp {
    public static void main(String[] args) {
        Rechtwinklig();
    }

    public static Boolean Rechtwinklig() {
        Scanner input = new Scanner(System.in);
        System.out.print("Seiten einzeln eingeben: \n");
        float a = input.nextFloat(); //Eigentlich unnötig
        float b = input.nextFloat();
        float c = input.nextFloat();
        input.close();
        double gamma = Math.acos((a*a+b*b-c*c)/(2*a*b));
        System.out.print(Math.toDegrees(gamma)+"\n"); //zum Debuggen
        if (Math.toDegrees(gamma) == 90) {
            System.out.println("Ist rechtwinklig.");
            return true;
        }
        else{
            System.out.println("Ist nicht rechtwinklig.");
            return false;
        }
    }
}
