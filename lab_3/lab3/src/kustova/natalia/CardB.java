package kustova.natalia;

public class CardB implements Comparable {
    enum Rank {
        TWO("Two"),
        THREE("Three"),
        FOUR("Four"),
        FIVE("Five"),
        SIX("Six"),
        SEVEN("Seven"),
        EIGHT("Eight"),
        NINE("Nine"),
        TEN("Ten"),
        JACK("Jack"),
        QUEEN("Queen"),
        KING("King"),
        ACE("Ace"),
        JOKER("Joker");

        private final String name;

        Rank(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static String getNameByIndex(int indx) {
            for (Rank curRank : Rank.values()) {
                if(curRank.ordinal() == indx) return curRank.getName();
            }
            return Integer.toString(indx+2);
        }
    }

    enum Suit {
        CLUBS("Clubs"),
        DIAMONDS("Diamonds"),
        SPADES("Spades"),
        HEARTS("Hearts"),
        RED("Red"),
        BLACK("Black");

        private final String name;

        Suit(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public static String getNameByIndex(int indx) {
            for (Suit curRank : Suit.values()) {
                if(curRank.ordinal() == indx) return curRank.getName();
            }
            return Integer.toString(indx);
        }
    }

    private final int rank;
    private final int suit;

    public CardB(int rankNum, int suitNum) {
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
        return Rank.getNameByIndex(rank-2);
    }

    public String getSuit() {
        if (suit < 0 || suit > 3 && rank != 15) return Integer.toString(suit);
        return Suit.getNameByIndex(suit);
    }

    public boolean checkStandardDeck() {
        return rank >= 2 && suit >= 0 && suit <= 3;
    }

    public String checkCardRank(CardB other) {
        int subRank = this.rank - other.rank;
        if (subRank > 0) return "This card " + this.getRank() + " is stronger then " + other.getRank();
        else if (subRank < 0) return "Other card " + other.getRank() + " is stronger " + this.getRank();
        return "Rank are equal";
    }

    public String checkCardSuit(CardB other) {
        int subSuit = this.suit - other.suit;
        if (subSuit > 0) return "This card " + this.getSuit() + " is stronger then " + other.getSuit();
        else if (subSuit < 0) return "Other card " + other.getSuit() + " is stronger " + this.getSuit();
        return "Suit are equal";
    }

    public static int equalOfCards(CardB obj1, CardB obj2) {
        return obj1.compareTo(obj2);
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
        if (!(obj instanceof CardB)) {
            return false;
        }
        CardB other = (CardB) obj;
        return rank == other.rank && suit == other.suit;
    }

    @Override
    public int compareTo(Object o) {
        int otherSuit = ((CardB)o).suit;
        int otherRank = ((CardB)o).rank;
        if (this.equals(o)) return 0;
        if (suit < otherSuit || suit == otherSuit && rank < otherRank) return -1;
        return 1;
    }
}
