import java.util.ArrayList;
import java.util.Random;

public class Player {
    private ArrayList<String> deck = new ArrayList<>();
    private ArrayList<String> hand = new ArrayList<>();
    private String playerToken;

    public Player(String playerToken) {
        this.playerToken = playerToken;
    }

    public void atStart(){
        populateDeck();
        startingHand();
        showHand();
    }

    public void populateDeck(){
        // adding the 1 cards
        for (int i = 0; i < 8; i++)
        {
            deck.add("1");
        }
        // adding the 2 cards
        for (int i = 0; i <6; i++ )
        {
            deck.add("2");
        }
        // adding the 3 cards
        for (int i = 0; i <5; i++ )
        {
            deck.add("3");
        }
        // adding the 4 cards
        for (int i = 0; i <3; i++ )
        {
            deck.add("4");
        }
        // adding the 5 cards
        for (int i = 0; i <2; i++ )
        {
            deck.add("5");
        }
    }

    private void startingHand(){
        Random random = new Random();
        for (int i = 0; i < 7; i++) {
            int num = random.nextInt(deck.size());
            hand.add(deck.get(num));
            deck.remove(num);
        }
    }

    private void showHand(){
        System.out.println(hand);
        System.out.println("Deck Size = " + deck.size());
    }


}
