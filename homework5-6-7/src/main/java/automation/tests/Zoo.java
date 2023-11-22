package automation.tests;
import java.util.ArrayList;
import java.util.Scanner;

public class Zoo extends ZooOccupants{

        public static void main (String [] args) {
            Animals tiger = new Animals();
            Animals bear = new Animals();
            Animals allAnimals = new Animals();
            Birds flamingo = new Birds();
            Birds hummingbird = new Birds();
            Birds allBirds = new Birds();
            Fishes trout = new Fishes();
            Fishes stingray = new Fishes();
            Fishes allFishes = new Fishes();


            int userChoice;
            do {
                Scanner sc = new Scanner(System.in);

                System.out.println("Welcome to the Zoo! Please, сhoose what Zoo's occupant you want to learn about:\n" +
                        "1. Tiger\n" + "2. Bear\n" + "3. Flamingo\n" + "4. Hummingbird\n" + "5. Trout\n" + "6. Stingray\n"
                        + "0. Exit\n" + "Enter number:  ");
                userChoice = sc.nextInt();

                switch (userChoice) {
                    case 1 -> {
                        System.out.println("Information about Tiger");
                        allAnimals.showBacicInfo();
                        allAnimals.breathe();
                        allAnimals.move();
                        tiger.makeSound("Tiger can growl, roar, chuff and moan.\n");
                    }
                    case 2 -> {
                        System.out.println("Information about Bear");
                        allAnimals.showBacicInfo();
                        allAnimals.breathe();
                        allAnimals.move();
                        bear.makeSound("Bear can growl, moan, and even woof as a signal to a fellow bear or other animals.\n");
                    }
                    case 3 -> {
                        System.out.println("Information about Flamingo");
                        allBirds.showBacicInfo();
                        allBirds.breathe();
                        allBirds.move();
                        flamingo.makeSound("Flamingo vocalizations range from nasal honking to grunting or growling.\n");
                    }
                    case 4 -> {
                        System.out.println("Information about Hummingbird");
                        allBirds.showBacicInfo();
                        allBirds.breathe();
                        allBirds.move();
                        hummingbird.makeSound("All hummingbirds make the same high pitched sounds referred to as \"squeaks\" or \"twitters\".\n");
                    }
                    case 5 -> {
                        System.out.println("Information about Trout");
                        allFishes.showBacicInfo();
                        allFishes.breathe();
                        allFishes.move();
                        trout.makeSound("Trout can make a croaking sound\n");
                    }
                    case 6 -> {
                        System.out.println("Information about Stingray");
                        allFishes.showBacicInfo();
                        allFishes.breathe();
                        allFishes.move();
                        stingray.makeSound("Stingray can make clicking noises\n");
                    }
                    case 0 -> {
                        System.out.println("Bye!");
                    }

                    default -> System.out.println("We don't have information about " + userChoice);

                }
            }
            while (userChoice != 0);
        }
}