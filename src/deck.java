import java.util.ArrayList;

/**
 * Created by Trevor Powers on 2/19/2017.
 * This file is the object file for a deck of cards and it's methods
 *
 */
public class deck {
    private int idCounter = 0;
    private String name;
    private String description;
    private ArrayList <Card> deck;



    /**
     * Constructor for the decks
     *
     * @param name  the name of the deck
     * @param description   description for the deck
     */
    deck(String name, String description){

        this.name = name;
        this.description = description;
        this.deck = new <Card> ArrayList();

    }



    public void addCard(String front, String back){
        Card c1 = new Card(idCounter);
        c1.setFront(front);
        c1.setBack(back);

        this.deck.add(idCounter, c1);
        this.idCounter ++;
    }


}
