package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s! How old are you? ", name);
//        int age = scanner.nextInt();
//        // Cleans up the input buffer. as nextInt will not reject the 'enter' press.
//        scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        System.out.printf("%d is an excellent age to start programing. What language do you prefer? ", age);

        String language = scanner.nextLine();

        System.out.printf("%s is a very popular programing language.", language);

        scanner.close();
    }
}