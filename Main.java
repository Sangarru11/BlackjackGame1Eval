import Controller.MainController;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("   ____      _      ____    ___   _   _    ___          _   _   _      _      _   _     ____    _____       _      _      _   _    ___  \n" +
                "  / ___|    / \\    / ___|  |_ _| | \\ | |  / _ \\        | | | | | |    / \\    | \\ | |   |  _ \\  | ____|     | |    / \\    | \\ | |  / _ \\ \n" +
                " | |       / _ \\   \\___ \\   | |  |  \\| | | | | |    _  | | | | | |   / _ \\   |  \\| |   | |_) | |  _|    _  | |   / _ \\   |  \\| | | | | |\n" +
                " | |___   / ___ \\   ___) |  | |  | |\\  | | |_| |   | |_| | | |_| |  / ___ \\  | |\\  |   |  _ <  | |___  | |_| |  / ___ \\  | |\\  | | |_| |\n" +
                "  \\____| /_/   \\_\\ |____/  |___| |_| \\_|  \\___/     \\___/   \\___/  /_/   \\_\\ |_| \\_|   |_| \\_\\ |_____|  \\___/  /_/   \\_\\ |_| \\_|  \\___/ \n" +
                "                                                                                                                                        ");
        ArrayList<String> playerNames = new ArrayList<>();
        int numPlayers = 0;
        while (numPlayers < 1 || numPlayers > 4) {
            System.out.println("Introduce el número de jugadores (1-4):");
            if (scanner.hasNextInt()) {
                numPlayers = scanner.nextInt();
                if (numPlayers < 1 || numPlayers > 4) {
                    System.out.println("Número inválido. Por favor, introduce un número entre 1 y 4.");
                }
            } else {
                System.out.println("Entrada no válida. Por favor, introduce un número.");
                scanner.next();
            }
        }
        scanner.nextLine();
        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("Introduce el nombre del jugador " + i + ":");
            String name = scanner.nextLine();
            playerNames.add(name);
        }
        MainController mainController = new MainController(playerNames);
        mainController.startGame();
    }
}