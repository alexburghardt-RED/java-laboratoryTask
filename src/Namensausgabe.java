import java.util.Scanner;
public class Namensausgabe {
    public static void main(String[] args){
        System.out.println("Geben Sie den Namen ein: ");
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        System.out.println("Hallo, " + name + '!');
    }
}