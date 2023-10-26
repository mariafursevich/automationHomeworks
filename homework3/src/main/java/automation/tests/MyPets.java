package automation.tests;
import java.util.Scanner;
import static automation.tests.Cat.*;

public class MyPets {
    String name;
    public MyPets (String name){
        this.name = name;
    }
        public static void main(String[] args){
        MyPets cat = new MyPets("Felix");
        System.out.println("Pet passport\n" + "Name: " + cat.name);
        Cat.printBirthYear(2015);
        Cat.printCatBreed("Siberian cat");
        Cat.printFurColour("Black & White");
        System.out.println("Age: " + Cat.CatAge(2015, 2023));

        System.out.println("What is cat's weight?");
        Scanner scanner = new Scanner(System.in);
        int weight = scanner.nextInt();

        Cat.printCatWeight(weight);
        Cat.amountOfFoodPerDay(weight, cat.name);
        }
    }

