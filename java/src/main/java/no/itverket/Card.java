package no.itverket;

class Card {
    Suit suit;
    int rank;

    Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        String rankString;
        switch (rank) {
            case 1:
                rankString = "A";
                break;
            case 11:
                rankString = "J";
                break;
            case 12:
                rankString = "Q";
                break;
            case 13:
                rankString = "K";
                break;
            default:
                rankString = "" + rank;
        }
        return suit.toString() + " " + rankString;
    }
}
