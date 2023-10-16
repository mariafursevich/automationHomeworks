package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String info = "Maria Fursevich Manual QA Engineer";
        System.out.println(info);

        byte var1 = 125;
        System.out.println("Byte - " + var1);
        short var2 =31555;
        System.out.println("Short - " + var2);
        int var3 = 3;
        System.out.println("Int - " + var3);
        long var4 = 2147;
        System.out.println("Long - " + var4);
        float var5 = 5.5F;
        System.out.println("Float - " + var5);
        double var6 = 10.5789;
        System.out.println("Double - " + var6);
        boolean var7 = true;
        System.out.println("Boolean - " + var7);
        char var8 = 'A';
        System.out.println("Char - " + var8);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! Nice to meet you!" +
                " Please, enter your name and job title (2 words with spaces): ");
        String answer1 = scanner.nextLine();
        String[] entredValues= answer1.split(" ");
        String name = entredValues[0];
        String job = entredValues[1];
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Good job, "+ name +"!"+ " Do you want to know more about yourself?" + " Enter yes or no");
        String answer2 = scanner2.nextLine();

            if (answer2.contains("yes")) {
                String fakeJob = "Actor";
                String fakeJob2 = "Singer";
                String replaceValue = "Automation testing";
        System.out.println("Your name is empty? " + name.isEmpty());
        System.out.println("Your name length is: "+ name.length());
        System.out.println("Your name in lowercase is: " + name.toLowerCase());
        System.out.println("Your name in uppercase is: " + name.toUpperCase());
        System.out.println("The third letter of your name is: " + name.charAt(3));
        System.out.println("Are you " + fakeJob + " ? "+  fakeJob.equals(job));
        System.out.println("Ok...maybe you're " + fakeJob2 + " ? " + job.equalsIgnoreCase(fakeJob2));
        System.out.println("Ooo yeah! I remember you're " + job);
        System.out.println("Does your name start with A? " + name.startsWith("A"));
        System.out.println("Does your name end with a? " + name.endsWith("a"));
        System.out.println("Maybe your name contains a?  " + name.contains("a"));
        System.out.println("Let me replace some letters in your name: "+ name.replace("a", "$"));

        System.out.println( String.format("I think you're " + name + " is studying" + " %s",replaceValue) + "!");
        StringBuffer buffer = new StringBuffer(name);
        buffer.append (" is a nice person! Good luck!");
        System.out.println(buffer);
        }
           else System.out.println("Got it! Thank you! See you next time <3");
    }}