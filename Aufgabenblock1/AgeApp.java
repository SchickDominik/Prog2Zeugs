package A3;

import java.util.Scanner;

public class AgeApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] arr = {18, 19};
        boolean arrContainsA = false;
        input.close();

        for (int zahl : arr){
            if(zahl == a){
                arrContainsA = true;
                break;
            }
        }

        if (a < 0){
            System.out.println("Ungültiges Alter");
        }
        else if (a <= 13){
            System.out.println("Kind");
        }
        else if (a <= 18){
            System.out.println("Teenager");
        }
        else if (arrContainsA){
            System.out.println("Teenager und Erwachsener");
        }
        else {
            System.out.println("Erwachsener");
        }
    }
}