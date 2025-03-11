public class Levenshtein {
    public static void main(String[] args) {
        if (args.length == 1) {
            System.out.println(berechneLevenshteinDistanz(args[0], ""));
        } else if (args.length == 2) {
            System.out.println(berechneLevenshteinDistanz(args[0], args[1]));
        } else {
            System.out.println("Ungültige Eingabe.");
        }
    }

    public static int berechneLevenshteinDistanz(String string1, String string2) {
        int laenge1 = string1.length();
        int laenge2 = string2.length();

        // Matrix initialisieren
        int[][] distanz = new int[laenge1 + 1][laenge2 + 1];

        // Basisfälle: Levenshtein-Distanz zu leeren Strings
        for (int i = 0; i <= laenge1; i++) {
            distanz[i][0] = i;
        }
        for (int j = 0; j <= laenge2; j++) {
            distanz[0][j] = j;
        }

        // Berechnung der Levenshtein-Distanz
        for (int i = 1; i <= laenge1; i++) {
            for (int j = 1; j <= laenge2; j++) {
                int kosten = (string1.charAt(i - 1) == string2.charAt(j - 1)) ? 0 : 1;
                distanz[i][j] = Math.min(Math.min(
                                distanz[i - 1][j] + 1,      // Löschen
                                distanz[i][j - 1] + 1),     // Einfügen
                        distanz[i - 1][j - 1] + kosten // Ersetzen
                );
            }
        }

        return distanz[laenge1][laenge2];
    }
}