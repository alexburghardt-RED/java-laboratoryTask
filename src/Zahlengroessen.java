import java.util.Scanner;

public class Zahlengroessen {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scan = new Scanner(System.in);

        System.out.print("Zahl 1: ");
        a = scan.nextInt();

        System.out.print("Zahl 2: ");
        b = scan.nextInt();

        if (a > b) {
            System.out.println("Die Zweite ist kleiner als die Erste.");
        }if (a < b) {
            System.out.println("Die Erste ist kleiner als die Zweite.");
        }if (a == b) {
            System.out.println("Beide sind gleich.");
        }
    }
}