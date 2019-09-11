import java.util.Scanner;

public class E4_17 {

    public static void main(String[] args) {
        Scanner sUserInput = new Scanner(System.in);    //This will get the time that user inputs (integer)
        int iTime1 = 0;         //This will be the first time  (user inputted)
        int iTime2 = 0;         //This will be the second time (user inputted)
        int iHours1 = 0;        //This will be the hours portion of the first time (ex. if iTime1 = 1233 then iHours1 = 12)
        int iHours2 = 0;        //This will be the hours portion of the second time
        int iMinutes1 = 0;      //This will be the minutes portion of the first time
        int iMinutes2 = 0;      //This will be the minutes portion of the second time
        int iDiffHours = 0;     //This will be the total difference in hours between time 1 and time 2
        int iDiffMinutes = 0;   //This will be the total difference in minutes between time 1 and time 2

        System.out.println("Welcome to my program that prints the number of hours and minutes between two times \n" + //This will print the welcoming statement explaining purpose of program
                           "Please ONLY use military format (ex. 0900, 1730)");    //This will help user on how to input time correctly
        System.out.println("Please enter the first time: ");    //This will print a message asking user to input the first time
        iTime1 = sUserInput.nextInt();                          //This will receive the user input and store into iTime1 as an Int
        System.out.println("Please enter the second time: ");   //This will print a message asking user to input the second time
        iTime2 = sUserInput.nextInt();                          //This will receive the user input and store into iTime2 as an Int

        iHours1 = iTime1 / 100;       //This will get the hours portion of the first time and store into the appropriate hours variable
        iHours2 = iTime2 / 100;       //This will get the hours portion of the second time and store into the appropriate hours variable
        iMinutes1 = iTime1 % 100;     //This will get the minutes portion of the first time and store into the appropriate minutes variable
        iMinutes2 = iTime2 % 100;     //This will get the minutes portion of the second time and store into the appropriate minutes variable

        if(iHours1 <= iHours2) {                                //Checks if hours of time 1 is not larger than time 2
            iDiffHours = iHours2 - iHours1;                     //If True: simply subtract hours of time 2 by hours of time 1
            if(iMinutes1 <= iMinutes2) {                            //Checks if minutes of time 1 is not larger than time 2
                iDiffMinutes = iMinutes2 - iMinutes1;               //If true : simply subtract minutes of time 2 by minutes of time 1
            }
            else {                                                  //If false :
                iDiffHours -= 1;                                    //Decrements the difference in hours to "borrow" for the minutes
                iDiffMinutes = (60 - iMinutes1) + iMinutes2;        //Gets the remaining minutes to get to next hour and adds the second number
                                                                    //to get the difference in minutes
            }
        }
        else {                                                  //If False:
            iDiffHours = (24 - iHours1) + iHours2;          
            if(iMinutes1 <= iMinutes2) {
                iDiffMinutes = iMinutes2 - iMinutes1;
            }
            else {
                iDiffHours -= 1;
                iDiffMinutes = (60 - iMinutes1) + iMinutes2;
            }
        }

        System.out.println("The number of hours and minutes between the two times is: " + iDiffHours + " hours " + iDiffMinutes + " minutes");
    }
}