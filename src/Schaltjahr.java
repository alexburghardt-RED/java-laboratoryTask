import java.util.Scanner;

public class Schaltjahr {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Geben Sie ein Jahr ein: ");
        int jahr = input.nextInt();

        if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
