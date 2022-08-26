package no.itverket;

import java.util.ArrayList;

public class Hand {
    ArrayList<Card> cards = new ArrayList<>();
    int aces = 0;

    public void add(Card card) {
        if (card.rank == 1) aces++;
        cards.add(card);
    }

    public int sum() {
        //Adding all cards
        int total = cards.stream().map(c -> Math.min(c.rank, 10)).reduce(0, Integer::sum);

        //Adding as many aces as 11 while remaining below 21 total
        for (int i = 0; i < aces; i++) {
            if (total+10 > 21) break;
            total += 10;
        }
        return total;
    }
}
