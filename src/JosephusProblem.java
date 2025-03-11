import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JosephusProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Anzahl der Personen: ");
        int n = scanner.nextInt();

        System.out.print("Schrittgröße: ");
        int p = scanner.nextInt();

        // Liste initialisieren
        List<Integer> personen = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            personen.add(i);
        }

        // Josephus-Algorithmus
        List<Integer> entferntePersonen = new ArrayList<>();
        int index = 0;

        while (!personen.isEmpty()) {
            // Index der zu entfernenden Person berechnen
            index = (index + p - 1) % personen.size();
            // Person entfernen und speichern
            entferntePersonen.add(personen.remove(index));
        }

        // Ergebnis ausgeben
        for (int person : entferntePersonen) {
            System.out.println(person);
        }
    }
}