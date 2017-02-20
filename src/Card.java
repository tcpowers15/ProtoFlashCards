/**
 * Created by Trevor Powers on 2/19/2017.
 * This is object file for the card object and its methods.
 *
 */
public class Card {
    private String front;   //this is the text on the 'front' of the card
    private String back;    //text on the 'back' of the card
    private int id;         //the cards id number in the deck

    /**
     * Constructor for card
     * @param i this is the numerical id for the card
     */
    Card(int i){
        this.id = i;
        this.front = "";
        this.back = "";
    }


    /**
     * getter method for the card
     * @return  the text on the front of the card
     */
    public String getFront(){
        return this.front;
    }


    /**
     * getter method for the back of the card
     * @return the text on the back of the card
     */
    public String getBack(){
        return this.back;
    }



    /**
     * Sets the message on the front of the card
     * @param text  String  this is the text going on the card
     */
    public void setFront(String text){
        this.front = text;
    }


    /**
     * Stes the message on the back of the card
     * @param text  String  message going on the card
     */
    public void setBack(String text){
        this.back = text;
    }




    public void printit(){
        System.out.println();
        System.out.println("Front: " + front);
        System.out.println("Back: "+ back);
        System.out.println("id" + id);
    }
}
