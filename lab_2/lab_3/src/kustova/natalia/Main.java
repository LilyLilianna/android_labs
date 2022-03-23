package kustova.natalia;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Card_b card1 = new Card_b(20, 2);
        Card_b card2 = new Card_b(0, 2);
        Card_b card3 = new Card_b(5, 1);
        Card_b card4 = new Card_b(5, 1);
        System.out.println("First card's info: " + card1);
        System.out.println("Second card's info: " + card2);
        System.out.println("Third card's info: " + card3);
        System.out.println("Fourth card's info: " + card4);
        System.out.println("Is Second card from standard deck? - " + card2.checkStandardDeck());
        System.out.println(card2.checkCardRank(card1));
        System.out.println(card2.checkCardSuit(card3));
        System.out.print("Are Third and Fourth card equals? -");
        if (Card_b.equalOfCards(card3, card4) != 0)
            System.out.println("No");
        else System.out.println("Yes");
    }
}
