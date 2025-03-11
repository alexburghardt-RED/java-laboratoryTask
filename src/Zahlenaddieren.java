import java.util.Scanner;
public class Zahlenaddieren {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zahl 1: ");
        int a = scanner.nextInt();
        System.out.println("Zahl 2: ");
        int b = scanner.nextInt();
        int ergebnis =(a+b);
        System.out.println(ergebnis);
    }
}