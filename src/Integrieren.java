import java.util.Scanner;

public class Integrieren {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Eingabe: ");
        String eingabe = scanner.nextLine();
        String[] koeffizienten = eingabe.split(",");

        int[] polykoeffizienten = new int[koeffizienten.length];
        for (int i = 0; i < koeffizienten.length; i++) {
            polykoeffizienten[i] = Integer.parseInt(koeffizienten[i]);
        }

        System.out.print("Integral: ");
        for (int i = 0; i < polykoeffizienten.length; i++) {
            int koeffizient = polykoeffizienten[i];
            int neuerExponent = polykoeffizienten.length - i;
            System.out.print((koeffizient / neuerExponent) + ",");
        }
        System.out.println("C");
    }
}