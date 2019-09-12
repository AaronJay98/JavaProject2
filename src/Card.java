public class Card {
    public Card(String strClassInput) {
        strUsersCard = strClassInput;
    }

    public String getDescription() {
        if(validateCard()) {
            //code goes here
        }
        else {
            return "Unknown";
        }
    }

    private Boolean validateCard() {
        if(strUsersCard.length() < 2 || strUsersCard.length() > 3) {
            return false;
        }
        else if(!(strUsersCard.length() == 3 && strUsersCard.charAt(0) == '1' && strUsersCard.charAt(1) == '0')) {
            return false;
        }
        switch (strUsersCard.charAt(0)) {
            case ('A')
        }
    }

    private String strUsersCard;
}
