package automation.tests;

public class Cat {
    public static void printBirthYear (int birthYear){
        System.out.println("Year of birth: " + birthYear);
    };
    public static int CatAge(int birthYear, int currentYear){
      return currentYear - birthYear;
    };
    public static void printCatWeight (int catWeight){
        System.out.println("Weight: " + catWeight);
    };
    public static void printCatBreed(String catBreed){
        System.out.println("Breed: " + catBreed);
    };
    public static void printFurColour (String furColour){
        System.out.println("Fur colour: " + furColour);
    };
    public static void amountOfFoodPerDay(int catWeight, String catName){
        if (catWeight > 0 & catWeight <= 4){
            System.out.println("Based on " + catName + " weight, " + "Amount of canned food per day: 4 " );
        };
        if (catWeight > 4 & catWeight <=6){
            System.out.println("Based on " + catName + " weight, " + "Amount of canned food per day: 5 " );
        };
        if (catWeight > 6 & catWeight < 10){
            System.out.println("It seems that " + catName + " is a big boy! " + "Amount of canned food per day: 6" );
        };
        if (catWeight >= 10 ){
            System.out.println(catName + " needs a diet!");
        };
    };
}

