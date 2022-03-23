package Cards;

import Cards.Suit;

import java.util.HashMap;

public class CardC {
    private final Suit suit;
    private final int rank;
    private static final HashMap<Suit, Integer> maxRank;

    static {
        maxRank = new HashMap<>();
        maxRank.put(Suit.spades, 0);
        maxRank.put(Suit.clubs, 0);
        maxRank.put(Suit.hearts, 0);
        maxRank.put(Suit.diamonds, 0);
    }

    public CardC(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
        if (maxRank.get(suit) < rank)
            maxRank.put(suit, rank);
    }

    public CardC(Suit suit) {
        this(suit, maxRank.get(suit) + 1);
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }
}
