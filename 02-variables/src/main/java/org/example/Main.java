package org.example;

public class Main {
    static int duration = 1;
    static int number_which_never_got_defined;
    static char character_which_never_got_defined;

    public static void main(String[] args) {
        int age = 0;
        age = 200;
        System.out.println("I am " + age + " years old from last " + duration + " year");
        System.out.println("number_which_never_got_defined " + number_which_never_got_defined);
        System.out.println("character_which_never_got_defined " + character_which_never_got_defined);
    }
}