import java.util.Scanner;

public class E5_19 {
    public static void main(String[] args) {
        Scanner sUserInput = new Scanner(System.in);
        String strUsersCard = "";
        System.out.println("Welcome to my program that asks for you to input 2 character describing a playing card. \n");
        System.out.println("Please refer to the following shorthand notation: \n" +
                           "A      Ace\n" +
                           "2...10 Card values\n" +
                           "J      Jack\n" +
                           "Q      Queen\n" +
                           "K      King\n" +
                           "D      Diamonds\n" +
                           "H      Hearts\n" +
                           "S      Spades\n" +
                           "C      Clubs\n");

        System.out.println("Please enter a playing card(ex. QS = Queen of Hearts): ");
        strUsersCard = sUserInput.nextLine();

        System.out.println("The card you entered is: ");
        if(strUsersCard.charAt(0) == 'A') {
            System.out.println("Ace of ");
        }
        else if (strUsersCard.charAt(0) >= 50 && strUsersCard.charAt(0) <=57) {
            System.out.println();
        }

    }
}
