import java.util.Random;
import java.util.Scanner;

public class SchereSteinPapier {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] optionen = {"Schere", "Stein", "Papier"};

        while (true) {
            System.out.println("Wähle: Schere (0), Stein (1), oder Papier (2). Beenden mit 'exit': ");
            String benutzerEingabe = scanner.nextLine();

            if (benutzerEingabe.equalsIgnoreCase("exit")) {
                System.out.println("Spiel beendet.");
                break;
            }

            int benutzerWahl;
            try {
                benutzerWahl = Integer.parseInt(benutzerEingabe);
                if (benutzerWahl < 0 || benutzerWahl > 2) {
                    System.out.println("Ungültige Wahl. Bitte 0, 1 oder 2 eingeben.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Ungültige Eingabe. Bitte eine Zahl eingeben.");
                continue;
            }

            int computerWahl = random.nextInt(3);

            System.out.println("Du hast gewählt: " + optionen[benutzerWahl]);
            System.out.println("Computer hat gewählt: " + optionen[computerWahl]);

            if (benutzerWahl == computerWahl) {
                System.out.println("Unentschieden!");
            } else if ((benutzerWahl == 0 && computerWahl == 2) ||
                    (benutzerWahl == 1 && computerWahl == 0) ||
                    (benutzerWahl == 2 && computerWahl == 1)) {
                System.out.println("Du gewinnst!");
            } else {
                System.out.println("Computer gewinnt!");
            }
            System.out.println();
        }

        scanner.close();
    }
}
