package Model;

import java.util.Objects;

public class Card {
    private int value;
    private String suit;
    private boolean isAce;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
        this.isAce = (value == 1);
    }
    public Card(){
        this(0,"");
    }
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public String getSuit() {
        return suit;
    }
    public void setSuit(String suit) {
        this.suit = suit;
    }
    public boolean isAce() {
        return isAce;
    }
    @Override
    public String toString() {
        return "╔════════╗\n" +
                "║ " + value + "      ║\n" +
                "║        ║\n" +
                "║   " + suit + "    ║\n" +
                "║        ║\n" +
                "║      " + value + " ║\n" +
                "╚════════╝";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && Objects.equals(suit, card.suit);
    }

}
