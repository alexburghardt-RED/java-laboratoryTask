import java.util.Scanner;

public class Arzneimittel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Konzentration (mg): ");
        double urspruenglicheKonzentration = scanner.nextDouble();

        System.out.print("Untergrenze (mg): ");
        double untergrenzeKonzentration = scanner.nextDouble();

        System.out.print("Abnahme (%/Monat): ");
        double prozentualerVerlust = scanner.nextDouble();

        int monate = 0;
        double aktuelleKonzentration = urspruenglicheKonzentration;

        while (aktuelleKonzentration > untergrenzeKonzentration) {
            aktuelleKonzentration -= aktuelleKonzentration * (prozentualerVerlust / 100);
            monate++;
        }

        System.out.println("Haltbarkeit: " + monate + " Monate");
    }
}
