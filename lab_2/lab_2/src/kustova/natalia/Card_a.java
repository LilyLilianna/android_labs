package kustova.natalia;

import java.util.Random;

public class Card_a extends Card {
    public String rank;
    public String suit;

    public Card_a() {
        Random random = new Random();
        rank = CARD_RANK[random.nextInt(9)];
        suit = CARD_SUIT[random.nextInt(4)];
    }
}
