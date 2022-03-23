package kustova.natalia;

public class Main {
    public static final String SEPARATOR = "__________";
    public static void main(String[] args) {
	// write your code here
        Deck theDeack = Deck.createDeck();
        System.out.println(theDeack);
        Card_b randomCard = Deck.returnRandomCard(theDeack);
        if(randomCard == null) System.out.println("Its not a standard deck");
        else System.out.println("Random card: " + randomCard);
        theDeack.mixCard();
        System.out.println("Mixed deck." + theDeack);
        System.out.println(SEPARATOR);
        theDeack.sortCard();
        System.out.println("Sorted deck." + theDeack);
        System.out.println(SEPARATOR);
        Card_b card1 = theDeack.removeCard();
        Card_b card2 = theDeack.removeCard();
        Card_b card3 = theDeack.removeCard();
        Card_b card4 = theDeack.removeCard();
        System.out.println(card1 + " " + card2 + " . " + card3 + " . " + card4 + " . ");
        theDeack.addCard(card2);
        theDeack.addCard(card1);
        theDeack.addCard(card2);
        System.out.println(theDeack);
        System.out.println(SEPARATOR);
        System.out.println("Is empty? -" + theDeack.isEmpty());
        while(!theDeack.isEmpty()) {
            theDeack.removeCard();
        }
        System.out.println("After clearing: ");
        System.out.println(theDeack);
    }
}
