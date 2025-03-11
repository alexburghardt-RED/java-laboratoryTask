import java.util.Scanner;

public class MaylaLerntLesen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.print("Anzahl der Wörter: ");
            int tage = scanner.nextInt();
            int woerter = ((tage-1) * tage/2)+1;
            System.out.println(woerter);
    }
}