import java.util.Scanner;


/**
 * Author: Trevor Powers
 *
 * This is the main file for the prototype flashcard program. This program will
 * will have the functionality of the app, but will be limited to the command
 * line, and a basic text based interface.
 * The purpose of this is to flesh out the objects, and methods that will be
 * needed.
 */
public class flashCards {

    public static void main(String[] args) {
        Card c1 = new Card(1);
        Card c2 = new Card(2);
        Card c3 = new Card(3);

        c1.printit();
        c2.printit();
        c3.printit();

        c1.setFront("Hello");
        c1.setBack("World");

        c1.printit();
    }

}
