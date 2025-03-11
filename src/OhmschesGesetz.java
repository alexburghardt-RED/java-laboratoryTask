import java.util.Scanner;

public class OhmschesGesetz {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("R1 (in Ohm): ");
        double r1 = scan.nextDouble();
        System.out.print("R2 (in Ohm): ");
        double r2 = scan.nextDouble();

        double reihenschaltung = r1 + r2;
        double parallelschaltung = (r1 * r2) / (r1 + r2);

        int reihenschaltungInt = (int) Math.round(reihenschaltung);
        int parallelschaltungInt = (int) Math.floor(parallelschaltung);

        System.out.println("Reihenschaltung: " + reihenschaltungInt + " Ohm");
        System.out.println("Parallelschaltung: " + parallelschaltungInt + " Ohm");
    }
}