import java.util.Scanner;

public class Wiederholungsausgabe {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Zahl: ");
        int value = scan.nextInt();
        for (int i = value; i > 0; i--) {
            System.out.println("Wiederholung");
        }
    }
}