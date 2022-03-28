package kustova.natalia

class CardBK(var rankNum: Int, var suitNum: Int) : Comparable<Any?> {

    internal enum class Rank {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE,
        JOKER;

        companion object {
            fun getNameByIndex(indx: Int): String {
                for (curRank in values()) {
                    if (curRank.ordinal == indx) return curRank.name
                }
                return (indx + 2).toString()
            }
        }
    }

    internal enum class Suit {
        CLUBS,
        DIAMONDS,
        SPADES,
        HEARTS,
        RED,
        BLACK;

        companion object {
            fun getNameByIndex(indx: Int): String {
                for (curRank in values()) {
                    if (curRank.ordinal == indx) return curRank.name
                }
                return indx.toString()
            }
        }
    }

    private val rank: Int
    private val suit: Int

    init {
        if (rankNum > 14) {
            rankNum = 15
            suitNum = if (suitNum % 2 == 0) 4 else 5
        }
        rank = rankNum
        suit = suitNum
    }

    fun getRank(): String {
        return if (rank < 2) rank.toString() else Rank.getNameByIndex(rank - 2)
    }

    fun getSuit(): String {
        return if (suit < 0 || suit > 3 && rank != 15) suit.toString() else Suit.getNameByIndex(
                suit
        )
    }

    fun checkStandardDeck(): Boolean {
        return rank >= 2 && suit >= 0 && suit <= 3
    }

    fun checkCardRank(other: CardBK): String {
        val subRank = rank - other.rank
        if (subRank > 0) return "This card ${getRank()} is stronger then ${other.getRank()}" else if (subRank < 0) return "Other card ${other.getRank()} is stronger ${getRank()}"
        return "Rank are equal"
    }

    fun checkCardSuit(other: CardBK): String {
        val subSuit = suit - other.suit
        if (subSuit > 0) return "This card ${getSuit()} is stronger then ${other.getSuit()}" else if (subSuit < 0) return "Other card ${other.getSuit()} is stronger ${getSuit()}"
        return "Suit are equal"
    }

    override fun toString(): String {
        return "rank ${getRank()}, suit ${getSuit()}"
    }

    override fun hashCode(): Int {
        return rank + 31 * suit
    }

    override fun equals(o: Any?): Boolean {
        if (o !is CardBK) {
            return false
        }
        val other = o
        return rank == other.rank && suit == other.suit
    }

    override fun compareTo(o: Any?): Int {
        val otherSuit = (o as CardBK).suit
        val otherRank = o.rank
        if (this == o) return 0
        return if (suit < otherSuit || suit == otherSuit && rank < otherRank) -1 else 1
    }

    companion object {
        fun equalOfCards(obj1: CardBK, obj2: CardBK): Int {
            return obj1.compareTo(obj2)
        }
    }
}