package effectivejava.item.fourtyfifth;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CartesianProduct {
    enum Suit {
        DIAMONDS, CLUBS, HEARTS, SPADES
    }

    enum Rank {
        TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, J, Q, K, A
    }

    public static class Card {
        private Suit suit;
        private Rank rank;

        public Card(Suit suit, Rank rank) {
            this.suit = suit;
            this.rank = rank;
        }
        
        public String toString() {
            return rank.name() + " " + suit.name();
        }
    }

    public static void cardDeck() {
        Stream.of(Suit.values())
                .flatMap(suit -> Stream.of(Rank.values())
                        .map(rank -> new Card(suit, rank)))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
