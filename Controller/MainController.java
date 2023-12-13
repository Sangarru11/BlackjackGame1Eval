package Controller;

import Model.*;
import View.UI;
import java.util.ArrayList;

public class MainController {
    private Game game;
    private UI ui;

    public MainController(ArrayList<String> playerNames) {
        this.game = new Game(playerNames);
        this.ui = new UI();
    }

    public void startGame() {
        this.game.dealInitialCards();
        for (Player player : this.game.getPlayers()) {
            this.ui.showPlayerHand(player);
        }
        System.out.println("Cartas del " + this.game.getDealer().getName());
        System.out.println(this.game.getDealer().getHand().get(0));
        for (Player player : this.game.getPlayers()) {
            this.playerTurn(player);
        }
        this.dealerTurn();
        this.determineWinner();
    }


    public void playerTurn(Player player) {
        boolean endTurn = false;
        while (!endTurn) {
            this.ui.showGameMenu();
            int choice = this.ui.getPlayerChoice();
            switch (choice) {
                case 1: // Hit
                    Card drawnCard = this.game.getDeck().drawCard();
                    if (drawnCard.isAce()) {
                        System.out.println("Has sacado un As. ¿Quieres que valga 1 o 11?");
                        int aceValue = this.ui.getPlayerChoice();
                        drawnCard.setValue(aceValue);
                    }
                    player.addCardToHand(drawnCard);
                    this.ui.showPlayerHand(player);
                    if (player.isBust()) {
                        endTurn = true;
                    }
                    break;
                case 2: // Stand
                    endTurn = true;
                    break;
            }
        }
    }

    public void dealerTurn() {
        while (this.game.getDealer().calculateHandTotal() < 17) {
            this.game.getDealer().addCardToHand(this.game.getDeck().drawCard());
        }
        this.ui.showPlayerHand(this.game.getDealer());
    }

    public void determineWinner() {
        Player winner = this.game.getDealer();
        int highestScore = this.game.getDealer().calculateHandTotal();
        for (Player player : this.game.getPlayers()) {
            if (!player.isBust() && player.calculateHandTotal() > highestScore) {
                winner = player;
                highestScore = player.calculateHandTotal();
            }
        }
        this.ui.showWinner(winner);
    }
}