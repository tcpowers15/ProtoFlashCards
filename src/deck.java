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


    /**
     * This function adds a new card to the deck. Taking the info provided by
     * the user, the function constructs the card object. It assigns the cards
     * id to be the current number of the idCounter, then by default places the
     * card at the index of the id into the sorted deck. Lastly this function
     * increments idCounter by 1.
     * @param front     String that user wants on the front
     * @param back      String that user wants on the back
     */
    public void addCard(String front, String back){
        Card c1 = new Card(idCounter);
        c1.setFront(front);
        c1.setBack(back);

        this.deck.add(idCounter, c1);
        this.idCounter ++;
    }



    /**
     * This function is used to edit cards inside of a deck. If the function is
     * given "" for the front, it will only edit the back and leave the front
     * string alone. Likewise if back == "". The situation of "" and "" being
     * passed is not possible, as this function will not be used directly by the
     * user. It will be managed by another function in the flashCards.java that
     * will managage and error check the input
     *
     * @param front     String that is what the user wants the front to be
     * @param back      String that is what the user wants the back to be
     * @param id        This is the index of the card being changed
     */
    public void editCard(String front, String back, int id){

        if(front.equals("")){
            this.deck.get(id).setBack(back);
        }
        else if (back.equals("")){
            this.deck.get(id).setFront(front);
        }
    }


}
