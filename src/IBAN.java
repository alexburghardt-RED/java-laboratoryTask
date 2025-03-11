import java.util.Scanner;
import java.math.BigInteger;

public class IBAN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String landeskennzeichen = "DE";
        String pruefziffer = "00";

        System.out.print("Kontonummer: ");
        String kontonummer = scanner.nextLine();

        System.out.print("BLZ: ");
        String bankleitzahl = scanner.nextLine();

        kontonummer = String.format("%010d", Long.parseLong(kontonummer));
        bankleitzahl = String.format("%08d", Long.parseLong(bankleitzahl));

        String ibanRoh = bankleitzahl + kontonummer + landeskennzeichen + pruefziffer;

        String umgewandelteBuchstaben = "131400";

        String ibanNumerisch = bankleitzahl + kontonummer + umgewandelteBuchstaben;

        BigInteger ibanZahl = new BigInteger(ibanNumerisch);
        int pruefzifferBerechnet = 98 - ibanZahl.mod(BigInteger.valueOf(97)).intValue();

        pruefziffer = String.format("%02d", pruefzifferBerechnet);

        String iban = landeskennzeichen + pruefziffer + bankleitzahl + kontonummer;

        String ibanPapierform = iban.replaceAll("(.{4})", "$1 ").trim();

        System.out.println("IBAN: " + ibanPapierform);
    }
}