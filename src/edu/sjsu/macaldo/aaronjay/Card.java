package edu.sjsu.macaldo.aaronjay;      //Puts this Class into a package to be used by other classes

public class Card {

    public Card(String strClassInput) {         //Constructor that takes a string as a parameter(2 or 3 character string for a card)
        strUsersCard = strClassInput.toUpperCase();           //Sets the private string variable to hold the card the user inputted
    }

    private String strUsersCard;                //Stores the card the user inputted

    public String getDescription() {
        String strReturnString = "";            //Stores the string that may be returned to main
        String strErrorInput = "Unknown";       //This will be returned if user inputted an invalid string

        if(strUsersCard.length() < 2 || strUsersCard.length() > 3) {       //Checks to see if the string is the appropriate length
            return strErrorInput;                                          //If outside of bounds returns unknown
        }

        if(strUsersCard.length() == 3) {        //If the string size is 3
            if (!(strUsersCard.length() == 3 && strUsersCard.charAt(0) == '1' && strUsersCard.charAt(1) == '0')) {  //Checks to see make sure that the two first character is 1 and 0
                return strErrorInput;           //If it does not it returns unknown
            }
        }

        switch (strUsersCard.charAt(0)) {           //Uses the first character as the expression to be checked then adds to the return string the appropriate string(ex. "Ace of" if char is 'A')
            case ('A'): {                           //
                strReturnString = "Ace of ";        //
                break;                              //
            }                                       //
            case ('2'): {                           //
                strReturnString = "Two of ";        //
                break;                              //
            }                                       //
            case ('3'): {                           //
                strReturnString = "Three of ";      //
                break;                              //
            }                                       //
            case ('4'): {                           //
                strReturnString = "Four of ";       //
                break;                              //
            }                                       //
            case ('5'): {                           //
                strReturnString = "Five of ";       //
                break;                              //
            }                                       //
            case ('6'): {                           //
                strReturnString = "Six of ";        //
                break;                              //
            }                                       //
            case ('7'): {                           //
                strReturnString = "Seven of ";      //
                break;                              //
            }                                       //
            case ('8'): {                           //
                strReturnString = "Eight of ";      //
                break;                              //
            }                                       //
            case ('9'): {                           //
                strReturnString = "Nine of ";       //
                break;                              //
            }                                       //
            case ('1'): {                                    //This is in the case that the 10 card was inputted and the 2nd character must be 0 if it passed the previous if statement
                strReturnString = "Ten of ";                 //
                break;                                       //
            }                                                //
            case ('J'): {                           //
                strReturnString = "Jack of ";       //
                break;                              //
            }                                       //
            case ('Q'): {                           //
                strReturnString = "Queen of ";      //
                break;                              //
            }                                       //
            case ('K'): {                           //
                strReturnString = "King of ";       //
                break;                              //
            }                                       //
            default: {                              //If the first character was none of the above it must be invalid. Therefore unknown is returned to output
                return strErrorInput;               //
            }
        }

        switch (strUsersCard.charAt(strUsersCard.length()-1)) {         //Uses the last character as the expression to be checked then concatenates to the return string the appropriate string(ex. "Diamond" if char is 'D')
            case ('D'): {                                               //
                strReturnString = strReturnString.concat("Diamonds");   //
                break;                                                  //
            }                                                           //
            case ('H'): {                                               //
                strReturnString = strReturnString.concat("Hearts");     //
                break;                                                  //
            }                                                           //
            case ('S'): {                                               //
                strReturnString = strReturnString.concat("Spades");     //
                break;                                                  //
            }                                                           //
            case ('C'): {                                               //
                strReturnString = strReturnString.concat("Clubs");      //
                break;                                                  //
            }                                                           //
            default: {                                                  //If the last character was none of the above it must be invalid. Therefore unknown is returned to output
                return strErrorInput;                                   //
            }                                                           //
        }                                                               //

        return strReturnString;                                         //Returns the Description of the card user inputted correctly
    }
}
