package Model;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            this.cards.add(new Card(i, "Corazones"));
            this.cards.add(new Card(i, "Diamantes"));
            this.cards.add(new Card(i, "Tréboles"));
            this.cards.add(new Card(i, "Picas"));
        }
    }

    public void shuffle() {
        Collections.shuffle(this.cards);
    }

    public Card drawCard() {
        return this.cards.remove(this.cards.size() - 1);
    }
}
