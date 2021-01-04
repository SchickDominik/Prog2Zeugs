package A1;

import java.util.Scanner;


public class InOutApp{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte eingeben: Name, Wohnort, Alter\n");
        String name = scanner.nextLine();
        String home = scanner.nextLine();
        int age = scanner.nextInt();
        System.out.println("Name: " + name);
        System.out.println("Wohnort: " + home);
        System.out.println("Alter: " + age);
        scanner.close();

    }
}