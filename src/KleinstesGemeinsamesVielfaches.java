import java.util.Scanner;

public class KleinstesGemeinsamesVielfaches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Zahl 1: ");
        int m = scanner.nextInt();

        System.out.printf("Zahl 2: ");
        int n = scanner.nextInt();

        int kleinstesGemeinsamesVielfaches = berechneKgV(m, n);
        System.out.println(kleinstesGemeinsamesVielfaches);
    }

    public static int berechneKgV(int m, int n) {
        int faktor = 2;
        int kleinstesGemeinsamesVielfaches = 1;

        while (m > 1 || n > 1) {
            int potenzM = 0;
            int potenzN = 0;

            while (m % faktor == 0) {
                potenzM++;
                m /= faktor;
            }

            while (n % faktor == 0) {
                potenzN++;
                n /= faktor;
            }

            if (potenzM > 0 || potenzN > 0) {
                int maximalePotenz = Math.max(potenzM, potenzN);
                kleinstesGemeinsamesVielfaches *= Math.pow(faktor, maximalePotenz);
            }

            faktor++;
        }

        return kleinstesGemeinsamesVielfaches;
    }
}
