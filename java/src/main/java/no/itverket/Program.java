package no.itverket;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        final Deck deck = new Deck();
        final Hand playersHand = new Hand();
        final Hand dealersHand = new Hand();

        final Scanner scanner = new Scanner(System.in);
        final Card firstCard = deck.draw();
        dealersHand.add(firstCard);
        System.out.printf("Dealer draws %s%n", firstCard);

        // Playing the game
        while (playersHand.sum() <= 21) {
            System.out.println("Stand, Hit");
            final String read = scanner.nextLine();

            if (read.equals("Hit")) {
                final Card card = deck.draw();
                playersHand.add(card);
                System.out.printf("Hit with %s. Total is %s%n", card, playersHand.sum());
            } else if (read.equals("Stand")) {
                break;
            }
        }

        // Dealer's turn
        while (dealersHand.sum() < 17) {
            final Card card = deck.draw();
            dealersHand.add(card);
            System.out.printf("Dealer draws %s for a total of %s%n", card, dealersHand.sum());
        }

        // Results
        if (playersHand.sum() <= 21) {
            String result;
            if (playersHand.sum() == dealersHand.sum()) {
                result = ". A tie!";
            }
            else {
                result = playersHand.sum() > dealersHand.sum() ? "you win!": "the house wins.";
            }
            System.out.printf("You got a total of %s, the dealer a total of %s, %s%n",
                    playersHand.sum(), dealersHand.sum(), result);
        }
        else {
            System.out.println("Your total is above 21, you lose...");
        }
    }
}
