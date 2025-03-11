import java.util.Scanner;
import java.net.URL;

public class URLSplitting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            try{

                System.out.printf("URL: ");
                String urlString = scanner.nextLine();
                URL url = new URL(urlString);

                System.out.println("Protokoll: " + url.getProtocol());
                System.out.println("Domäne: " + url.getHost());
                System.out.println("Pfad: " + url.getPath());

            } catch (Exception e) {
            }
    }
}



/*

throws Exception
Nach der main-Methode wurde throws Exception hinzugefügt.
Das bedeutet: Wenn eine Exception auftritt (z. B. ungültige URL),
 wird sie nicht abgefangen, sondern an die JVM (Java Virtual Machine) weitergereicht.

import java.util.Scanner;
import java.net.URL;

public class URLSplitting {
    public static void main(String[] args) throws Exception { // Exception wird weitergegeben
        Scanner scanner = new Scanner(System.in);

        System.out.printf("URL: ");
        String urlString = scanner.nextLine();
        URL url = new URL(urlString);

        System.out.println("Protokoll: " + url.getProtocol());
        System.out.println("Domäne: " + url.getHost());
        System.out.println("Pfad: " + url.getPath());
    }
}
 */