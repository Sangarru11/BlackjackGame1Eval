package Model;

import java.awt.*;
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
    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public boolean isAce() {
        return isAce;
    }
    @Override
    public String toString() {
        String displayValue;
        switch (value) {
            case 11:
                displayValue = "J";
                break;
            case 12:
                displayValue = "Q";
                break;
            case 13:
                displayValue = "K";
                break;
            case 14:
                displayValue = "A";
                break;
            default:
                displayValue = Integer.toString(value);
        }
        return "╔═══════════╗\n" +
                "║ " + displayValue + "         ║\n" +
                "║           ║\n" +
                "║     " + suit + "     ║\n" +
                "║           ║\n" +
                "║         " + displayValue + " ║\n" +
                "╚═══════════╝";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return value == card.value && Objects.equals(suit, card.suit);
    }

}