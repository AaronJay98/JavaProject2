package edu.sjsu.macaldo.aaronjay;

public class Card {

    public Card(String strClassInput) {
        strUsersCard = strClassInput;
    }


    public String getDescription() {
        String strReturnString = "";
        String strErrorInput = "Unknown";

        if(strUsersCard.length() < 2 || strUsersCard.length() > 3) {
            return strErrorInput;
        }

        if(strUsersCard.length() == 3) {
            if (!(strUsersCard.length() == 3 && strUsersCard.charAt(0) == '1' && strUsersCard.charAt(1) == '0')) {
                return strErrorInput;
            }
        }

        switch (strUsersCard.charAt(0)) {
            case ('A'): {
                strReturnString = "Ace of ";
                break;
            }
            case ('2'): {
                strReturnString = "Two of ";
                break;
            }
            case ('3'): {
                strReturnString = "Three of ";
                break;
            }
            case ('4'): {
                strReturnString = "Four of ";
                break;
            }
            case ('5'): {
                strReturnString = "Five of ";
                break;
            }
            case ('6'): {
                strReturnString = "Six of ";
                break;
            }
            case ('7'): {
                strReturnString = "Seven of ";
                break;
            }
            case ('8'): {
                strReturnString = "Eight of ";
                break;
            }
            case ('9'): {
                strReturnString = "Nine of ";
                break;
            }
            case ('1'): {
                strReturnString = "Ten of ";
                break;
            }
            case ('J'): {
                strReturnString = "Jack of ";
                break;
            }
            case ('Q'): {
                strReturnString = "Queen of ";
                break;
            }
            case ('K'): {
                strReturnString = "King of ";
                break;
            }
            default: {
                return strErrorInput;
            }
        }

        switch (strUsersCard.charAt(strUsersCard.length()-1)) {
            case ('D'): {
                strReturnString = strReturnString.concat("Diamonds");
                break;
            }
            case ('H'): {
                strReturnString = strReturnString.concat("Hearts");
                break;
            }
            case ('S'): {
                strReturnString = strReturnString.concat("Spades");
                break;
            }
            case ('C'): {
                strReturnString = strReturnString.concat("Clubs");
                break;
            }
            default: {
                return strErrorInput;
            }
        }

        return strReturnString;
    }

    private String strUsersCard;
}
