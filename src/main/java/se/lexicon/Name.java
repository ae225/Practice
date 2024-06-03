package se.lexicon;

import java.util.Scanner;

public class Name {
    public static void main(String[] args) {

        Scanner myObject = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = myObject.nextLine();
        System.out.println("Name: " + name);
    }
}
