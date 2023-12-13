package View;

import Model.Card;
import Model.Player;
import java.util.Scanner;

public class UI {
    private Menu menu;

    public UI() {
        this.menu = new Menu();
    }

    public void showGameMenu() {
        this.menu.showGameMenu();
    }

    public void showPlayerHand(Player player) {
        System.out.println("Esta es tu mano " + player.getName() );
        for (Card card : player.getHand()) {
            System.out.println(card);
        }
    }

    public int getPlayerChoice() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public void showWinner(Player player) {
        System.out.println(player.getName() + " ha ganado!");
    }
}