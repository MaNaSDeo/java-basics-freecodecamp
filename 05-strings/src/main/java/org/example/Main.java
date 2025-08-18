package org.example;

import java.util.Locale;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // A string literal. Stored in the "String Pool" (part of JVM Heap).
        String name = "Manas Deo";

        // A new String object. Even though the content is the same,
        // this creates a NEW object in heap memory, outside the String Pool.
        String nameNew = new String("Manas Deo");

        // Prints the string value ("Manas Deo") because println calls toString().
        System.out.println(name);


        // ----------------- String Pool Behavior -----------------

        // Both literalString1 and literalString2 refer to the same object
        // in the String Pool, because string literals with same value are reused.
        String literalString1 = "abc";
        String literalString2 = "abc";

        // Creates two different String objects in the heap,
        // even though content is the same ("xyz").
        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");

        // == compares references (memory addresses).
        // true, because both refer to the same object in String Pool.
        System.out.println(literalString1 == literalString2);

        // false, because they are two different objects in the heap
        // (different memory addresses), even though contents are equal.
        System.out.println(objectString1 == objectString2);

        System.out.println("value equality");
        System.out.println(objectString1.equals(objectString2)); // true
        System.out.println(objectString1.equalsIgnoreCase(objectString2)); // true

        /*
         * Use == → checks reference equality (same memory location).
         * Use .equals() → checks value equality (same characters).
         * */

        String country = "India";
        int age = 28;
        String company = "BlackBuck";

        /*
        * string - %s
        * integer - %d
        * double - %f
        * char - %c
        * boolean - %b
        * */

        System.out.println("Hello World! I'm " + name + ". I'm from " + country + " and I'm " + age + " years old.");

        String formattedString = String.format("My name is %s. I'm from %s. I'm %d years old. I work for %s", name, country, age, company);

        System.out.println(formattedString);

        System.out.println("length of name: " + name.length());
        System.out.println("is string empty: " + "".isEmpty());
        System.out.println("is name string empty: " + name.isEmpty());

        // Converts the string to uppercase using the default system locale (your computer's language setting)
        System.out.println("uppercase: " + name.toUpperCase());

        // Converts the string to uppercase using the ROOT locale (a neutral, locale-independent setting,
        // ensures consistent results across all systems regardless of language/region)
        System.out.println("uppercase: " + name.toUpperCase(Locale.ROOT));

        // Converts the string to lowercase using the default system locale
        System.out.println("lowercase: " + name.toLowerCase());

        // Converts the string to lowercase using the ROOT locale for consistent results across all environments
        System.out.println("lowercase: " + name.toLowerCase(Locale.ROOT));

    }
}