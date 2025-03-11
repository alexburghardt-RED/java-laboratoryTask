import java.util.Scanner;

public class Sekunden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         int sekundenInput;
         int minuten;
         int sekundenOutput;

         System.out.printf("Sekunden: ");
         sekundenInput = scanner.nextInt();

         minuten = sekundenInput / 60;
         sekundenOutput = sekundenInput % 60;

         System.out.println(minuten + " Minuten und " + sekundenOutput + " Sekunden");

    }
}