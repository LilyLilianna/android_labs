package kustova.natalia;

import java.util.Scanner;

public class Main {
    public static final String SEPARATOR = "__________";
    public static void main(String[] args) {
        // write your code here
        checkSecondATask();
        checkSecondBTask();
        checkSecondCTask();
    }

    private static void checkSecondATask() {
        System.out.println("Task 2 - a");
        Card_a card = new Card_a();
        System.out.println("Card's info: rank " + card.rank + ", suit: " + card.suit);
        card.suit = Card_a.CARD_SUIT[3];
        card.rank = Card_a.CARD_RANK[5];
        System.out.println("New card's info: rank " + card.rank + ", suit: " + card.suit);
        System.out.println(SEPARATOR);
    }

    private static void checkSecondBTask() {
        System.out.println("Task 2 - b");
        Card_b card = new Card_b();
        int inputSuit = 0, inputRank = 0;
        System.out.println("Card's info: rank " + card.getRank() + ", suit " + card.getRank());
        do {
            Scanner in = new Scanner(System.in);
            System.out.println("Input the suit [6; 14]: ");
            inputRank = in.nextInt();
            System.out.println("Rank [0; 3]: ");
            inputSuit = in.nextInt();
        } while (checkInputInt(inputRank, inputSuit));
        card = new Card_b(inputRank, inputSuit);
        System.out.println("New card's info: rank " + card.getRank() + ", suit: " + card.getSuit());
        System.out.println(SEPARATOR);
    }

    private static void checkSecondCTask() {
        System.out.println("Task 2 - c");
        Card_c card = new Card_c(8, 2);
        System.out.println("Rank 8, suit: 2");
        System.out.println("1 Card's info: rank " + card.getRank() + ", suit: " + card.getSuit());
        card = new Card_c(2);
        System.out.println("1 card's new info: rank " + card.getRank() + ", suit: " + card.getSuit());
        card = new Card_c(6, 2);
        System.out.println("Rank 6, suit: 2");
        System.out.println("2 Card's info: rank " + card.getRank() + ", suit: " + card.getSuit());
        card = new Card_c(2);
        System.out.println("2 card's new info: rank " + card.getRank() + ", suit: " + card.getSuit());
        card = new Card_c(14, 3);
        System.out.println("Rank 14, suit: 3");
        System.out.println("3 Card's info: rank " + card.getRank() + ", suit: " + card.getSuit());
        card = new Card_c(3);
        System.out.println("3 card's new info: rank " + card.getRank() + ", suit: " + card.getSuit());
        System.out.println(SEPARATOR);
    }

    private static boolean checkInputInt(int inputRank, int inputSuit) {
        if((inputRank < 6 || inputRank > 14) || (inputSuit < 0 || inputSuit > 3)) {
            System.out.println("Not correct input data. Please try again");
            return true;
        }
        return false;
    }
}
