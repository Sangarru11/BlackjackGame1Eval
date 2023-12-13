package Model;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        for (int i = 2; i <= 10; i++) {
            for (String suit : new String[]{"♥", "♦", "♣", "♠"}) {
                this.cards.add(new Card(i, suit));
            }
        }
        for (String suit : new String[]{"♥", "♦", "♣", "♠"}) {
            this.cards.add(new Card(11, suit)); // J
            this.cards.add(new Card(12, suit)); // Q
            this.cards.add(new Card(13, suit)); // K
            this.cards.add(new Card(14, suit)); // As
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card drawCard() {
        return this.cards.remove(this.cards.size() - 1);
    }
}