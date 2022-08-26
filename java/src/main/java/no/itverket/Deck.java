package no.itverket;

class Deck {
    Card[] cards = new Card[52];
    int cardIndex = 0;

    Deck() {
        for (Suit suit : Suit.values()) {
            for (int i = 1; i < 14; i++) {
                cards[cardIndex] = new Card(suit, i);
                cardIndex++;
            }
        }
        cards = shuffle(cards);
    }

    public Card draw() {
        cardIndex --;
        return cards[cardIndex];
    }

    private Card[] shuffle(Card[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int j = (int)(Math.random() * deck.length);
            Card cardSwap = deck[i];
            deck[i] = deck[j];
            deck[j] = cardSwap;
        }
        return deck;
    }
}
