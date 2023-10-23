package automation.tests;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        // Task 2
        Scanner scanner2 = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int x = scanner2.nextInt();
        int sum = 0;
        int resultMultiplier = x >= 0 ? 1 : -1;
        for ( int i = 0; i <= x*resultMultiplier; i++) {
            sum += i;}
        System.out.printf("The sum of all numbers from 0 to %d is %d", x, sum*resultMultiplier);
        }
}
