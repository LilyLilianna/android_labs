package kustova.natalia;

public class Main {

    public static void main(String[] args) {
        CardB card1 = new CardB(20, 2);
        CardB card2 = new CardB(0, 2);
        CardB card3 = new CardB(5, 1);
        CardB card4 = new CardB(5, 1);
        System.out.println("First card's info: " + card1);
        System.out.println("Second card's info: " + card2);
        System.out.println("Third card's info: " + card3);
        System.out.println("Fourth card's info: " + card4);
        System.out.println("Is Second card from standard deck? - " + card2.checkStandardDeck());
        System.out.println(card2.checkCardRank(card1));
        System.out.println(card2.checkCardSuit(card3));
        System.out.print("Are Third and Fourth card equals? -");
        if (CardB.equalOfCards(card3, card2) != 0)
            System.out.println("No");
        else System.out.println("Yes");
    }
}
