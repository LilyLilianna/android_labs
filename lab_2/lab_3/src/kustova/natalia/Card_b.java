package kustova.natalia;

import java.util.Random;

public class Card_b {
    static final String[] CARD_RANK = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Jack", "Queen", "King", "Ace", "Joker"};
    static final String[] CARD_SUIT = {"Clubs", "Diamonds", "Spades", "Hearts", "Red", "Black"};

    private int rank;
    private int suit;

    public Card_b() {
        Random random = new Random();
        rank = random.nextInt(14);
        suit = random.nextInt(4);
    }

    public Card_b(int rankNum, int suitNum) {
        if(rankNum > 14) {
            rankNum = 15;
            if(suitNum % 2 == 0)
                suitNum = 4;
            else suitNum = 5;
        }
        rank = rankNum;
        suit = suitNum;
    }

    public String getRank() {
        if (rank < 2) return Integer.toString(rank);
        return CARD_RANK[rank-2];
    }

    public String getSuit() {
        if (suit < 0 || suit > 3) Integer.toString(suit);
        return CARD_SUIT[suit];
    }

    public boolean checkStandardDeck() {
        if ((rank < 2) || (suit < 0 || suit > 3)) return false;
        return true;
    }

    public String checkCardRank(Card_b other) {
        int subRank = this.rank - other.rank;
        if (subRank > 0) return "This card " + this.getRank() + " is stronger then " + other.getRank();
        else if (subRank < 0) return "Other card " + other.getRank() + " is stronger " + this.getRank();
        return "Rank are equal";
    }

    public String checkCardSuit(Card_b other) {
        int subSuit = this.suit - other.suit;
        if (subSuit > 0) return "This card " + this.getSuit() + " is stronger then " + other.getSuit();
        else if (subSuit < 0) return "Other card " + other.getSuit() + " is stronger " + this.getSuit();
        return "Suit are equal";
    }

    public static int equalOfCards(Card_b obj1, Card_b obj2) {
        if (obj1.equals(obj2)) return 0;
        else return obj1.hashCode() - obj2.hashCode();
    }

    @Override
    public String toString() {
        return "rank " + getRank() + ", suit " + getSuit();
    }

    @Override
    public int hashCode() {
        return rank + 31 * suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Card_b)) {
            return false;
        }
        Card_b other = (Card_b) obj;
        return rank == other.rank && suit == other.suit;
    }
}
