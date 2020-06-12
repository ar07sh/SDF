package pickacard;

import java.util.*;

/*
* @author srinivsi
* modification from github
* @author arsh
 */
public class CardTrick {

    public static void main(String[] args) {

        Scanner arsh = new Scanner(System.in);
        System.out.println("Enter a card suit: ");
        String cardSuit = arsh.nextLine();
        System.out.println("Enter a card value: ");
        int cardValue = arsh.nextInt();

        Card[] trick = new Card[7];
        int i;
        boolean match = false;

        for (i = 0; i < trick.length; i++) {

            Card mearsh = new Card();
            mearsh.setValue(mearsh.randomValue());
            mearsh.setSuit(Card.Suit[mearsh.randomSuit()]);
            trick[i] = mearsh;

            if (cardValue == trick[i].getValue()) {
                System.out.println("Your Card Found");
                match = true;
            }

            if (match == false) {
                System.out.println("Not Found");
                System.out.println("You Lost");
            } else {
                System.out.println("You Won !");//win
            }

        }

    }

}
