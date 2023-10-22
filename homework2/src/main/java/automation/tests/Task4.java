package automation.tests;

import java.util.Scanner;

public class Task4 {
    public static void main (String[] args)
    {

        // Task 4

    String [] channels2 = {"KBS", "SBS", "TVN", "VT", "NNSA"};
    Scanner scanner = new Scanner(System.in);
    int channelNumber;
     do {
    System.out.print("Enter channel number from 1 to 5.\nFor Exit enter 0 \nWhat channel do you want to see? ");
         System.out.println(" ");
    channelNumber = scanner.nextInt();
        if (channelNumber == 1)
        {
            System.out.println("Name of channel is: " + channels2[0]);
            System.out.println(" ");
        }
        if (channelNumber == 2)
        {
            System.out.println("Name of channel is: " + channels2[1]);
            System.out.println(" ");
        }
        if (channelNumber == 3)
        {
            System.out.println("Name of channel is: " + channels2[2]);
            System.out.println(" ");
        }
        if (channelNumber == 4)
        {
            System.out.println("Name of channel is: " + channels2[3]);
            System.out.println(" ");
        }
        if (channelNumber == 5)
        {
            System.out.println("Name of channel is: " + channels2[4]);
            System.out.println(" ");
        };
        if (channelNumber == 0)
        {
            System.out.println("Menu was closed");
            System.out.println(" ");
        }}
       while (channelNumber > 0 & channelNumber <= 5);

    }
}
