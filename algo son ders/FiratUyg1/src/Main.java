import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] skorlar1 = {3, 1, 0, 2, 4};
        int[] skorlar2 = {2, 1, 3, 1, 5};
        int takim1 = 0, takim2 = 0, berabere = 0;

        for (int i = 0; i < skorlar1.length; i++) {

            if (skorlar1[i] > skorlar2[i]) {
                System.out.println("Takim 1");
                takim1++;
            } else if (skorlar1[i] == skorlar2[i]) {
                System.out.println("Berabere");
                berabere++;
            } else {
                System.out.println("Takim 2");
                takim2++;
            }

        }

        System.out.println("Takim1: " + takim1 + " " + "Takim2: " + takim2 + " " + "Berabere: " + berabere);

    }
}