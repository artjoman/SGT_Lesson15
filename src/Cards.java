import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Cards {

    enum Suits {
        Hearts,
        Spades,
        Diamonds,
        Clubs
    }

    enum CardValues {
        Two,
        Three,
        Four,
        Five,
        Six,
        Seven,
        Eight,
        Nine,
        Ten,
        Jack,
        Queen,
        King,
        Ace
    }

    public static void main(String[] args) {

        String[] cardDeck = new String[52];
        int counter = 0;

        for (int i = 0; i < Suits.values().length; i++) {
            for (int j = 0; j < CardValues.values().length; j++) {

                cardDeck[counter] = String.format("%s %s", Suits.values()[i], CardValues.values()[j]);
//                System.out.println(cardDeck[counter]);
                counter++;
            }
        }

        // SHUFFLE THE DECK SIMPLE
        // SHUFFLE
        // Select one random card
        // IT WILL RETURN A VALUE BETWEEN [0..1]
//        Math.random() * 51;

        // GET FIRST RANDOM CARD
        String randomCard = cardDeck[(int)(Math.random() * 51d)];
        System.out.println("We got a RANDOM FIRST CARD: " + randomCard);

        // GET FIRST SIX CARDS
        // BUT UNFORTUNATELY THOSE MIGHT BE REPEATED
        for (int i = 0; i < 6 ; i++) {
            String randomCard6 = cardDeck[(int)(Math.random() * 51d)];
            System.out.println("We got one out of 6 RANDOM CARDS: " + randomCard6);
        }


        // NOW LETS SHUFFLE THE CARDS PROPERLY
        // If running on Java 6 or older, use `new Random()` on RHS here
        Random rnd = ThreadLocalRandom.current();
        for (int i = cardDeck.length - 1; i > 0; i--)
        {
            int index = rnd.nextInt(i + 1);
            // Simple swap
            String a = cardDeck[index];
            cardDeck[index] = cardDeck[i];
            cardDeck[i] = a;
        }

        // PRINT FIRST 6 ELEMENTS
        for (int i = 0; i < 6; i++) {
            System.out.println("We got one out of 6 REALLY SHUFFLED CARDS: " + cardDeck[i]);
        }

    }
}
