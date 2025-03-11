import java.util.Scanner;

public class Buchstabenpyramide {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Buchstabe: ");
        char buchstabe = scanner.next().toUpperCase().charAt(0);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int pyramidenHoehe = alphabet.indexOf(buchstabe) + 1;

        for (int i = 0; i < pyramidenHoehe; i++) {

            for(int k = pyramidenHoehe - i; k > 1; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet.charAt(j));
            }

            for (int j = i -1 ; j >= 0; j--) {
                System.out.print(alphabet.charAt(j));
            }
            System.out.println();

        }
    }
}