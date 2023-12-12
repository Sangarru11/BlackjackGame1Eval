package Model;

import java.util.ArrayList;

public class Game {
    private ArrayList<Player> players;
    private Player dealer;
    private Deck deck;

    public Game(ArrayList<String> playerNames) {
        this.players = new ArrayList<>();
        for (String name : playerNames) {
            this.players.add(new Player(name));
        }
        this.dealer = new Player("Crupier");
        this.deck = new Deck();
        this.deck.shuffle();
    }

    public ArrayList<Player> getPlayers() {
        return this.players;
    }

    public Player getDealer() {
        return this.dealer;
    }

    public Deck getDeck() {
        return this.deck;
    }

    public void dealInitialCards() {
        for (Player player : this.players) {
            player.addCardToHand(this.deck.drawCard());
            player.addCardToHand(this.deck.drawCard());
        }
        this.dealer.addCardToHand(this.deck.drawCard());
        this.dealer.addCardToHand(this.deck.drawCard());
    }
}
