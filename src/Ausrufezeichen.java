import java.util.Scanner;

public class Ausrufezeichen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (!scanner.hasNextInt()) {
                break;
            } else {
                int n = scanner.nextInt();
                System.out.println(n + "!");
            }
        }
    }
}