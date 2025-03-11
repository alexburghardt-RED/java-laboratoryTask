import java.util.Scanner;
public class Zahlenrest {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("Zahl 1: ");
        int a = scan.nextInt();
        System.out.println("Zahl 2: ");
        int b = scan.nextInt();
        int ergebnis = ((a%b));
        System.out.println(ergebnis);
    }
}
