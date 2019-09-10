import java.util.Scanner;

public class E4_17 {

    public static void main(String[] args) {
        Scanner sUserInput = new Scanner(System.in);
        int iTime1 = 0;
        int iTime2 = 0;
        int iHours1 = 0;
        int iHours2 = 0;
        int iMinutes1 = 0;
        int iMinutes2 = 0;
        int iDiffHours = 0;
        int iDiffMinutes = 0;

        System.out.println("Welcome to my program that prints the number of hours and minutes between two times");

        System.out.println("Please enter the first time: ");
        iTime1 = sUserInput.nextInt();
        System.out.println("Please enter the second time: ");
        iTime2 = sUserInput.nextInt();

        iHours1 = iTime1 / 100;
        iHours2 = iTime2 / 100;
        iMinutes1 = iTime1 % 100;
        iMinutes2 = iTime2 % 100;

        if(iHours1 <= iHours2) {
            iDiffHours = iHours2 - iHours1;
            if(iMinutes1 <= iMinutes2) {
                iDiffMinutes = iMinutes2 - iMinutes1;
            }
            else {
                iDiffHours -= 1;
                iDiffMinutes = (60 - iMinutes1) + iMinutes2;
            }
        }
        else {
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