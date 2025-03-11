public class PrimfaktorZerlegung {
    public static void main(String[] args) {

        if (args.length != 1) {
            return;
        }

        int zahl = Integer.parseInt(args[0]);
        int faktor = 2;

        StringBuilder ausgabe = new StringBuilder();

        while (zahl > 1) {
            while (zahl % faktor == 0) {
                ausgabe.append(faktor).append(",");
                zahl /= faktor;
            }
            faktor++;
        }
        if (ausgabe.length() > 0) {
            ausgabe.deleteCharAt(ausgabe.length() - 1);
        }
        System.out.println(ausgabe);
    }
}