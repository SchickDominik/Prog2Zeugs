package A3;

import java.util.Scanner;

public class Encoder {

    public void print(int[] arr) {
        if (arr == null)
        return;
        else {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println(" ");
        }
    }

    public void input (int[] arr){
        Scanner input = new Scanner(System.in);
        System.out.println("Bitte Zahlen eingeben: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        input.close();
    }

    public int[] reverse (int[] arr){
        int[] revarr = new int[arr.length];
        int j = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            revarr[i] = arr[j];
            j++;
        }
        return revarr;
    }

    public int[] encode (int[] arr){ //Variante 1 mit maximalem Array
        int[] encodedArray = new int[arr.length*2];
        int object;
        int count = 1;
        int index = 0;
        for (int i = 0; i < arr.length;) {
            object = arr[i];
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
                else {
                    break;
                }
            }
            encodedArray[index] = count;
            encodedArray[index+1] = object;
            if (index+2 > arr.length) {
                break;
            }
            else {
                index += 2;
                i += count;
                count = 1;
            }
        }
        int[] shortened = new int[index];
        for (int i = 0; i < shortened.length; i++) {
            shortened[i] = encodedArray[i];
        }
        return shortened;
    }
    
    public int[] decode (int[] arr){
        int laenge = 0;
        for (int i = 0; i < arr.length; i+=2) {
            laenge += arr[i];
        }
        int[] decoded = new int[laenge];

        int index = 0;
        for (int i = 1; i < arr.length; i+=2) {
            for (int j = 0; j < arr[i-1]; j++) {
                decoded[index] = arr[i];
                index++;
            }
        }
        return decoded;
    }

    public boolean compare(int[] a1, int[] a2){
        if (a1.length == a2.length) {
            int mistakes = 0;
            for (int i = 0; i < a2.length; i++) {
                if (a1[i] != a2[i]) {
                    mistakes++;
                }
            }
            if (mistakes > 0) {
                return false;
            }
            else {
                return true;
            }
        }
        else {
            System.out.println("Kein Vergleich möglich.");
            return false;
        }
    }
}
