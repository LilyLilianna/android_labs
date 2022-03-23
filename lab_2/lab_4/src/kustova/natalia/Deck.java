package kustova.natalia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    ArrayList<Card_b> cards;
    private Deck(boolean flag) {
        cards = new ArrayList<>(52);
        int rank = 2, suit = 0;
        for (int i = 0; i < 52; i++) {
            if(suit > 3) {
                rank++;
                suit = 0;
            }
            cards.add(new Card_b(rank, suit));
            suit++;
        }
        if (flag) {
            cards.add(52, new Card_b(16, 0));
            cards.add(53, new Card_b(16, 1));
        }
    }

    public static Deck createJokerDeck() {
        return new Deck(true);
    }

    public static Deck createDeck() {
        return new Deck(false);
    }

    public static Card_b returnRandomCard(Deck deck) {
        if(deck.cards.size() < 54) return null;
        else return deck.cards.get(new Random().nextInt(54));
    }

    public void mixCard() {
        Collections.shuffle(cards);
    }

    public void sortCard() {
        Collections.sort(cards);
    }

    public Card_b removeCard() {
        if(cards.isEmpty()) {
            return null;
        }
        Card_b result = cards.get(cards.size()-1);
        cards.remove(result);
        return result;
    }

    public void addCard(Card_b addCard) {
        if(!cards.contains(addCard)) {
            cards.add(addCard);
            System.out.println("Card [" + addCard + "] has been added");
        }
        else System.out.println("The card is already here");
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    @Override
    public String toString() {
        if(cards.isEmpty()) return "Deck is empty";
        StringBuilder result = new StringBuilder();
        result.append("Deck: ");
        for (Card_b card : this.cards) {
            result.append("\n[" + card + "]");
        }
        return result.toString();
    }
}
