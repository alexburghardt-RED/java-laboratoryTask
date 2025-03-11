import java.util.Scanner;

public class Bushaltestelle {
    public static void main(String[] args) {

        int hour;
        int minute;
        Scanner scan = new Scanner(System.in);
        System.out.print("Geben Sie die aktuelle Zeit ein (hhmm oder mm): ");
        String timeInput = scan.nextLine().trim();  //Die Methode .trim() in Java wird verwendet
                                                    //um führende und nachfolgende Leerzeichen aus
                                                    //einem String zu entfernen.

        //Zeitangabe
        if (timeInput.length() <= 2) {  //Nur Minuten angegeben
            hour = 0;  //Stunden sind 0, weil nur Minuten eingegeben wurden
            minute = Integer.parseInt(timeInput);  //Konvertiere Minuten in eine Ganzzahl
        } else {  //Stunden und Minuten angegeben
            hour = Integer.parseInt(timeInput.substring(0, timeInput.length() - 2));  //Extrahiere die Stunden
            minute = Integer.parseInt(timeInput.substring(timeInput.length() - 2));   //Extrahiere die Minuten
        }

        //Zeitausgabe
        int minutesUntilNextBus;
        if (minute < 30) {
            minutesUntilNextBus = 30 - minute;
        } else {
            minutesUntilNextBus = 60 - minute;
            hour = (hour + 1) % 24;  //Erhöht die Stunde bei Bedarf, im Bereich [0, 23]
        }

        System.out.println("Der nächste Bus fährt in " + minutesUntilNextBus + " Minuten ab.");
    }
}