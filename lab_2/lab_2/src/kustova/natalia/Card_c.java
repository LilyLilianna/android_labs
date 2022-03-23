package kustova.natalia;

import java.util.Random;

public class Card_c extends Card {
    private static int[] maxRank = {0,0,0,0};

    private String rank;
    private String suit;

    public Card_c(int rankNum, int suitNum) {
        maxRank[suitNum] = rankNum;
        rank = CARD_RANK[rankNum-6];
        suit = CARD_SUIT[suitNum];
    }

    public Card_c(int suitNum) {
        if (maxRank[suitNum] < 14)
            rank = CARD_RANK[maxRank[suitNum]-6+1];
        else
            rank = CARD_RANK[maxRank[suitNum]-6];
        suit = CARD_SUIT[suitNum];
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
}
