package automation.tests;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int score;

        do {
        System.out.print("Please enter your score: ");
        score = scanner.nextInt();
        if (score >= 70 & score <= 100) {
            System.out.println("Congrats! You’ve passed the test!");}
        if ( score < 70 & score >= 0)  {
            System.out.println("Sorry, you’ve failed the test.");
        }
        if (score < 0) {
            System.out.println("Sorry, something went wrong, please try again");
        }
        if (score > 100) {
            System.out.println("Sorry, something went wrong, please try again");
        }
    }
        while (score < 0 || score > 100);
}}
