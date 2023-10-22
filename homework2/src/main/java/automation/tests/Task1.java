package automation.tests;
import java.util.Scanner;

public class Task1{
        public static void main(String[] args){
    //Task 1

            String str = new String();
            Scanner scanner = new Scanner(System.in);
            while (!str.equals("Exit")) {
                System.out.print("Enter something: ");
                str = scanner.nextLine();
            if (str.equals("Exit")){
                    System.out.print("Buy!");
                }
            }}}
