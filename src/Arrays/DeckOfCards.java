package Arrays;

public class DeckOfCards {
    private static final int NUMBER_OF_CARDS = 52;
    private Card[] deck = new Card[NUMBER_OF_CARDS];

    public DeckOfCards() {
        String[] Masti = {"Diamonds", "Hearts", "Clubs", "Spades"};
        String[] Ranks = {"King", "Queen", "Ace", "10", "9"};

        for (int i = 0; i < NUMBER_OF_CARDS; i++) {
            this.deck[i] = new Card(Masti[i / 13], Ranks[i % 13]);
        }
    }
}
