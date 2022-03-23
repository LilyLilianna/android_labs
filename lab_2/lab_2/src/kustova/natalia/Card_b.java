package kustova.natalia;

import java.util.Random;

public class Card_b extends Card {

    private String rank;
    private String suit;

    public Card_b() {
        Random random = new Random();
        rank = CARD_RANK[random.nextInt(9)];
        suit = CARD_SUIT[random.nextInt(4)];
    }

    public Card_b(int rankNum, int suitNum) {
        rank = CARD_RANK[rankNum-6];
        suit = CARD_SUIT[suitNum];
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
