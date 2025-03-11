import java.util.Scanner;

public class Kontosperre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String korrektePIN = "1234";
        int versuche = 0;
        final int maxVersuche = 3;


        while (versuche < maxVersuche) {
            System.out.print("PIN: ");
            String eingegebenePIN = scanner.nextLine();

            if (eingegebenePIN.equals(korrektePIN)) {
                System.out.println("Erfolgreich");
                return;
            } else {
                versuche++;
                if (versuche == maxVersuche) {
                    System.out.println("Konto gesperrt. Bitte am Bankschalter melden.");
                    break;
                } else {
                    System.out.println(versuche + " Versuch fehlgeschlagen");
                }
            }
        }
    }
}
