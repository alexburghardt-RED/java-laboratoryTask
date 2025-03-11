import java.util.Scanner;

public class Wortlaenge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Wort: ");

        String wort = scanner.nextLine();
        int laenge = wort.length();

        System.out.println("---");

        for (int i = 0; i < laenge; i++) {
            System.out.println(wort);
        }

        System.out.println("---");
    }
}