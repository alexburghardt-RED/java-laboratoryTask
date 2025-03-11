import java.util.Scanner;

public class Schrittweite {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Startwert: ");
        int startwert = input.nextInt();
        System.out.printf("Endwert: ");
        int endwert = input.nextInt();
        System.out.printf("Schrittweite: ");
        int schrittweite = input.nextInt();

        while (startwert <= endwert) {
            System.out.println(startwert);
            startwert += schrittweite;
        }
    }
}