package automation.tests;

public class ZooOccupants {

    public static class Animals implements Actions{
        public void showBacicInfo() {
            System.out.println("Kingdom: animals\n" +
                    "Class: mammals");
        }
        public void move() {
            System.out.println("Way of moving: Animals of all shapes and sizes move around in many different ways " +
                    "using different body parts to help them.");
        }
        public void breathe() {
            System.out.println("Way of breathing: There are many different ways of breathing. Terrestrial animals generally take in oxygen from the air.");
        }
        public void makeSound(String sound){
            System.out.println(sound);
        }
    }

    public static class Birds implements Actions{

        public void showBacicInfo() {
            System.out.println("Kingdom: animals\n" +
                    "Class: birds");
        }
        public void move() {
            System.out.println("Way of moving: Birds fly by flapping their wings, steering mainly with their tails.");
        }
        public void breathe() {
            System.out.println("Way of breathing: Air flows into a bird’s body through nostril-like openings on the beak and passes out again through the trachea.");
        }
        public void makeSound(String sound){
            System.out.println(sound);
        }
    }

    public static class Fishes implements Actions{
        public void showBacicInfo() {
            System.out.println("Kingdom: animals\n" +
                    "Class: fishes");
        }
        public void move() {
            System.out.println("Way of moving: Most fishes generate thrust using lateral movements of their body and caudal fin, " +
                    "but many other species move mainly using their median and paired fins.");
        }
        public void breathe() {
            System.out.println("Way of breathing: All Fishes use gills for breathing under water. ");
        }
        public void makeSound(String sound){
            System.out.println(sound);
        }
    }

}
