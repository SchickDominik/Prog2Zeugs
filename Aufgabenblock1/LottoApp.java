package A3;

import java.security.SecureRandom;
import java.util.Arrays;


public class LottoApp {
    public static void main(String[] args) {
        int[] lottoRange = {1, 50};
        int[] superRange = {0, 10};
        int[] lottoNumbers = generateNumbers(lottoRange);
        int superNumber = generateSuper(superRange);
        printLotto(lottoNumbers, superNumber);
    }

    static void printLotto(int[] arr, int zahl) {
        System.out.print("Die Lottozahlen lauten: ");
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.print(", Superzahl " + zahl);
    }

    static int[] generateNumbers(int[] lottoRange) {
        int[] lottoNumbers = new int[6];
        SecureRandom randomInt = new SecureRandom();

        for (int i = 0; i < lottoNumbers.length;) {
            // int randomNumber = ThreadLocalRandom.current().nextInt(lottoRange[0], lottoRange[1]);
            int r = randomInt.nextInt(lottoRange[1]-lottoRange[0])+1;
            boolean containsNumber = false;
            for (int j : lottoNumbers) {
                if (j != 0) {
                    if (j == r) {
                        containsNumber = true;
                        break;
                    }
                }
                else {
                    break;
                }
            }
            if (containsNumber) {
                continue;
            }
            else {
                lottoNumbers[i] = r;
                i++;
            }
        }
        Arrays.sort(lottoNumbers);
        return lottoNumbers;
    }

    static int generateSuper(int[] superRange) {
        SecureRandom randomInt = new SecureRandom();
        int superNumber = randomInt.nextInt(superRange[1]-superRange[0]) + superRange[0];
        return superNumber;
    }
}

