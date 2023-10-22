package automation.tests;

import java.util.Scanner;

public class AdditionalTask5 {
    public static void main (String[] args)
    {

        // Additional Task 5
        int option;
        String name = "";
        String lastName = "";
        String birthYear = "";


        do {
            System.out.print("1.Ввести имя\n2.Ввести фамилию\n3.Ввести год рождения\n4.Вывести информацию\n0.Выход\n" +
                    "Выберите пункт меню: ");
            Scanner scanner = new Scanner(System.in);
            option = scanner.nextInt();
            System.out.println(" "); //Чтобы пустая строка разделяла текст
            switch (option) {
                case 1 -> {
                    System.out.print("Введите имя: ");
                    Scanner sc = new Scanner(System.in);
                    name = sc.nextLine();
                    System.out.println(" ");
                }
                case 2 -> {
                    System.out.print("Введите фамилию: ");
                    Scanner sc2 = new Scanner(System.in);
                    lastName = sc2.nextLine();
                    System.out.println(" ");
                }
                case 3 -> {
                    System.out.print("Введите год рождения: ");
                    Scanner sc3 = new Scanner(System.in);
                    birthYear = sc3.nextLine();
                    System.out.println(" ");
                }
                case 4 -> {
                    System.out.println("Общая информация: " + name + " " + lastName + " " + birthYear);
                    System.out.println(" ");
                }

                default -> System.out.println("Exit");
            }
        }
        while (option != 0);}
    }

