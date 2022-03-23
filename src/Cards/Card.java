package Cards;

import java.util.Objects;

//b
public class Card implements Comparable<Card> {

    private final Suit suit;
    private final int rank;

    public Card(Suit suit, int rank) {
        this.suit = suit;
        this.rank = rank;
    }


    //сравнение по масти
    public static int compare(Card c1, Card c2) {
        return c1.compareTo(c2);
    }

    private static int suitOrder(Suit suit) {
        switch (suit) {
            case clubs:
                return 0;
            case diamonds:
                return 1;
            case spades:
                return 2;
            default:
                return 3;
        }
    }

    public boolean isBelongsStandardCard() {
        if (rank > 0 && rank < 13)
            return true;
        return rank == 14 && (suit == Suit.spades || suit == Suit.hearts);
    }

    public boolean isStrongerThen(Card c2) {
        if (rankToString().equals("Joker"))
            return true;
        if ((c2.rankToString().equals("Joker")))
            return false;
        if (suit != c2.suit)
            return false;
        if (rank == c2.rank)
            return false;
        if (rank == 1 && c2.rank < 14)
            return true;
        if (c2.rank == 1 && rank < 14)
            return false;
        return rank > c2.rank;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public String toString() {
        return "Cards.Card{" +
                "suit=" + suit +
                ", rank=" + rankToString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return rank == card.rank && suit == card.suit;
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, rank);
    }

    private String rankToString() {
        switch (rank) {
            case 1:
                return "Ace";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            case 14:
                if (suit == Suit.spades || suit == Suit.hearts)
                    return "Joker";
        }
        return Integer.toString(rank);
    }

    @Override
    public int compareTo(Card c2) {
        int _c1 = suitOrder(suit);
        int _c2 = suitOrder(c2.suit);
        if (_c1 > _c2)
            return 1 ;
        else if (_c1 < _c2)
            return -1;
        if (isStrongerThen(c2))
            return 1;
        else if (c2.isStrongerThen(this))
            return -1;
        else
            return 0;
    }
}
