public class LCD {
    public static void main(String[] args) {
        String zahlen = "";
        int groesse = 1;

        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-s") && i + 1 < args.length) {
                groesse = Integer.parseInt(args[i + 1]);
                i++;
            } else {
                zahlen = args[i];
            }
        }

        String[] zahlenArray = zahlen.split("");

        obererTeil(zahlenArray, groesse);
        for (int i = 1; i < groesse; i++) {
            mittlereGroesse01(zahlenArray);
        }
        mittlererTeil(zahlenArray);
        for (int i = 1; i < groesse; i++) {
            mittlereGroesse02(zahlenArray);
        }
        untererTeil(zahlenArray);
    }

    private static void obererTeil(String[] eingabe, int groesse) {
        for (String ziffer : eingabe) {
            switch (ziffer) {
                case "0": System.out.print(" _  "); break;
                case "1": System.out.print("    "); break;
                case "2": System.out.print(" _  "); break;
                case "3": System.out.print(" _  "); break;
                case "4": System.out.print("    "); break;
                case "5": System.out.print(" _  "); break;
                case "6": System.out.print(" _  "); break;
                case "7": System.out.print(" _  "); break;
                case "8": System.out.print(" _  "); break;
                case "9": System.out.print(" _  "); break;
            }
        }
        System.out.println();
    }

    private static void mittlereGroesse01(String[] eingabe) {
        for (String ziffer : eingabe) {
            switch (ziffer) {
                case "0": System.out.print("| | "); break;
                case "1": System.out.print("  | "); break;
                case "2": System.out.print("  | "); break;
                case "3": System.out.print("  | "); break;
                case "4": System.out.print("| | "); break;
                case "5": System.out.print("|   "); break;
                case "6": System.out.print("  | "); break;
                case "7": System.out.print("  | "); break;
                case "8": System.out.print("| | "); break;
                case "9": System.out.print("| | "); break;
            }
        }
        System.out.println();
    }

    private static void mittlererTeil(String[] eingabe) {
        for (String ziffer : eingabe) {
            switch (ziffer) {
                case "0": System.out.print("| | "); break;
                case "1": System.out.print("  | "); break;
                case "2": System.out.print(" _|  "); break;
                case "3": System.out.print(" _| "); break;
                case "4": System.out.print("|_| "); break;
                case "5": System.out.print("|_  "); break;
                case "6": System.out.print("|_  "); break;
                case "7": System.out.print("  | "); break;
                case "8": System.out.print("|_| "); break;
                case "9": System.out.print("|_| "); break;
            }
        }
        System.out.println();
    }

    private static void mittlereGroesse02(String[] eingabe) {
        for (String ziffer : eingabe) {
            switch (ziffer) {
                case "0": System.out.print("| | "); break;
                case "1": System.out.print("  | "); break;
                case "2": System.out.print("|   "); break;
                case "3": System.out.print("  | "); break;
                case "4": System.out.print("  | "); break;
                case "5": System.out.print("  | "); break;
                case "6": System.out.print("| | "); break;
                case "7": System.out.print("  | "); break;
                case "8": System.out.print("| | "); break;
                case "9": System.out.print("  | "); break;
            }
        }
        System.out.println();
    }

    private static void untererTeil(String[] eingabe) {
        for (String ziffer : eingabe) {
            switch (ziffer) {
                case "0": System.out.print("|_| "); break;
                case "1": System.out.print("  | "); break;
                case "2": System.out.print("|_  "); break;
                case "3": System.out.print(" _| "); break;
                case "4": System.out.print("  | "); break;
                case "5": System.out.print(" _| "); break;
                case "6": System.out.print("|_| "); break;
                case "7": System.out.print("  | "); break;
                case "8": System.out.print("|_| "); break;
                case "9": System.out.print("  | "); break;
            }
        }
        System.out.println();
    }
}