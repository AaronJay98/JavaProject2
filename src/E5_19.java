import java.util.Scanner;                   //imports scanner class
import edu.sjsu.macaldo.aaronjay.Card;      //imports the Card class I created

public class E5_19 {
    public static void main(String[] args) {
        Scanner sUserInput = new Scanner(System.in);    //A means to get the user input

        System.out.println("Welcome to my program that asks for you to input 2 character describing a playing card. \n"); //Welcome statement to tell user what program is about
        System.out.println("Please refer to the following shorthand notation: \n" +     //Shows the notation that user would input
                           "A      Ace\n" +                                             //
                           "2...10 Card values\n" +                                     //
                           "J      Jack\n" +                                            //
                           "Q      Queen\n" +                                           //
                           "K      King\n" +                                            //
                           "D      Diamonds\n" +                                        //
                           "H      Hearts\n" +                                          //
                           "S      Spades\n" +                                          //
                           "C      Clubs\n");                                           //

        System.out.println("Please enter a playing card(ex. QS = Queen of Hearts): ");  //Asks user to input a card
        Card cUsersCard = new Card(sUserInput.nextLine());                              //Gets users input and creates a Card Object using the users input as a parameter

        System.out.println("The card you entered is: ");                 //Outputs to screen the description of the card the user inputted
        System.out.println(cUsersCard.getDescription());                 //
    }
}
