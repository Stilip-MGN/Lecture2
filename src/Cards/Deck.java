package Cards;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {

    public ArrayList<Card> cards;

    private Deck(boolean hasJoker) {
        cards = new ArrayList<Card>();
        for (int i = 1; i < 14; i++) {
            cards.add(new Card(Suit.clubs, i));
            cards.add(new Card(Suit.spades, i));
            cards.add(new Card(Suit.hearts, i));
            cards.add(new Card(Suit.diamonds, i));
        }
        if (hasJoker) {
            cards.add(new Card(Suit.spades, 14));
            cards.add(new Card(Suit.hearts, 14));
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public static Deck createDeck(boolean hasJoker) {
        return new Deck(hasJoker);
    }

    public static Card getRandomCard(ArrayList<Card> deck) {
        Random random = new Random();
        int index = random.nextInt(deck.size());
        return deck.get(index);

    }

    public void sort() {
        Collections.sort(cards);
    }

    public Card dealCard() {
        Card card = getRandomCard(cards);
        cards.remove(card);
        return card;
    }

    public void returnCard(Card card) {
        if (!cards.contains(card))
            cards.add(card);
    }

    public boolean isEmpty() {
        return cards.isEmpty();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card + "\n");
        }
        return "Cards.Deck{" + "\n" + sb + '}';
    }
}
