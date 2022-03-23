package Cards;

import Cards.Card;

public class Program {

    public static void main(String[] args) {
        Deck d = Deck.createDeck(true);
        System.out.println("Взял карты");
        Card c1 = d.dealCard();
        Card c2 = d.dealCard();
        System.out.println(c1);
        System.out.println(c2);
        System.out.println();

        System.out.println("Итог 1 части");
        d.returnCard(c1);
        d.returnCard(c1);
        System.out.println(d);
        System.out.println();

        System.out.println("Перемешал");
        d.shuffle();
        System.out.println(d);
        System.out.println();

        System.out.println("Отсортировал");
        d.sort();
        System.out.println(d);
        System.out.println();



        System.out.println("Итог 2 части");
        while (!d.isEmpty()){
            d.dealCard();
        }
        System.out.println(d);
    }
}
