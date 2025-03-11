import java.util.Scanner;

public class UmgedrehteZiffernfolge {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Zahl: ");
        String zahl = scan.nextLine();

        String umgekehrteZahl = new StringBuilder(zahl).reverse().toString();

        umgekehrteZahl = umgekehrteZahl.replaceAll("0", "");

        System.out.println(umgekehrteZahl);
    }
}