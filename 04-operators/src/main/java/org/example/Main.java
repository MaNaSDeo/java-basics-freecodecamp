package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * There are 8 types of operators in Java:
         *
         * 1. Arithmetic operators   (+, -, *, /, %, ++, --)
         * 2. Assignment operators   (=, +=, -=, *=, /=, %=, etc.)
         * 3. Relational operators   (==, !=, >, <, >=, <=)
         * 4. Logical operators      (&&, ||, !)
         * 5. Bitwise operators      (&, |, ^, ~, <<, >>, >>>)
         * 6. Conditional (Ternary)  (? :)
         * 7. Type Cast operator     ((type) value, e.g. (int) 3.5)
         * 8. Instanceof operator    (obj instanceof ClassName)
         */


        /*
        * Arithmetic operators - 5 types
         * 1. Addition(+)
         * 2. Subtraction(-)
         * 3. Multiplication(*)
         * 4. Division(/) -> int/int = int; double/double or double/int or int/double = double;
         * 5. Modulus(%) aka modulo/remainder
        * */

        // Assignment operator
        int number = 12;
        number = number + 5;
        number += 5;
        System.out.println("number: " + number);

        // Relational operator
        int number1 = 12;
        int number2 = 15;
        System.out.println("is equal to: " + (number1 == number2));
        System.out.println("is not equal to: " + (number1 != number2));
        System.out.println("is greater than: " + (number1 > number2));
        System.out.println("is less than: " + (number1 < number2));
        System.out.println("is greater than or equal to: " + (number1 > number2));
        System.out.println("is less than or equal to: " + (number1 < number2));

        // Logical operator
        int age = 25;
        System.out.println("And operator: " + (age >= 18 && age <= 60));
        System.out.println("Or operator: " + (age >= 18 || age <= 60));
        boolean thisIsFalse = false;
        System.out.println("Not operator: " + !thisIsFalse);

        // Post-increment/decrement -> Use the value first, then increase/decrease it.
        // Use x++ or x-- when we want to increment/decrement but use the old value first.
        number1++; // 13
        number2--; // 14

        // Pre-increment/decrement -> Increase/decrease the value first, then use it.
        // Use ++x or --x when we want to increment/decrement before using the value.
        ++number1; // 14
        --number2; // 13

    }
}