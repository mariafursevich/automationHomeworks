package automation.tests;
import java.util.Scanner;

public class MyPets extends Category implements Actions {
    String name;
    public MyPets (String name){
        this.name = name;
    }
        public static void main(String[] args) {
            MyPets myCat = new MyPets("Felix");
            System.out.println("Pet passport\n" + "Name: " + myCat.name);
            Category.showCategory();
            Category.showSubCategory();
            Category.showSquad();
            Cat.printBirthYear(2015);
            Cat.printCatBreed("Siberian cat");
            Cat.printFurColour("Black & White");
            System.out.println("Age: " + Cat.CatAge(2015, 2023));
            myCat.makeSound();
            myCat.canSwim();
            Scanner scanner = new Scanner(System.in);
            int weight;
            do{
                try {
                    System.out.println("What is " + myCat.name + " weight?"); //Обработка исключения, если пользователь ввел спец. символ, например %
                weight = scanner.nextInt();
                } catch (Exception e) {
                    System.out.println("Sorry, the operation is impossible! Rerun the program.");
                    break;  //Если ловим ошибку, то прекращаем работу программы
                }
            Cat.printCatWeight(weight);
            Cat.amountOfFoodPerDay(weight, myCat.name);
            }
            while (weight <= 0);
            }
    @Override
    public void makeSound() {
        System.out.println(name + " says "+ "Meooow!");
    };
    @Override
    public void canSwim() {
        System.out.println(name + " doesn't like to swim\n");
    }
}
