package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
         * There are 2 types of data,
         * 1. Primitive type -> stores the values, e.g. int - it will store the number
         * 2. non-primitive type/reference type -> stores the reference to a memory location, where a dynamic object is being stored.
         */
        /*
         * Primitive Data Types (8 total)
         *
         * 1. byte    -> -128 to 127                (8-bit, signed)
         * 2. short   -> -32,768 to 32,767          (16-bit, signed)
         * 3. int     -> -2,147,483,648 to 2,147,483,647 (32-bit, signed)
         * 4. long    -> -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807 (64-bit, signed)
         * 5. float   -> ~1.4e-45 to ~3.4e38        (32-bit, IEEE 754)
         * 6. double  -> ~4.9e-324 to ~1.7e308      (64-bit, IEEE 754)
         * 7. boolean -> true or false              (JVM-dependent size)
         * 8. char    -> '\u0000' (0) to '\uffff' (65,535) (16-bit, unsigned, Unicode)
         */

        // Integer types
        byte aSingleByte = 100;
        short aSmallNumber = 20000;
        int anInteger = 213456789;
        long aLargeNumber = 234524352435242436L;

        // Decimal types
        double aDouble = 1.317423;
        float aFloat = 3.1235412353215413254121234F;

        // Characters
        char copyrightSymbol = '\u00A9';
        char percentSymbol = '%';
        System.out.println("This is the copyright symbol: " + copyrightSymbol);
        System.out.println("This is the percent symbol: " + percentSymbol);

        // Type conversion
        /*
        * There are 2 type of data conversion,
        * 1. implicit
        * 2. explicit
        * */

        // Implicit conversion = widening (safe, automatic)
        int number01 = 5;
        double number02 = number01;
        System.out.println("normal int number01: " + number01 + " is now converted to double number02: " + number02);
        // Here number01 will still store 5 as integer, but number02 will store it as a double data type.

        // Explicit conversion = narrowing (may lose data, must be cast)
        double number03 = 5.8;
        // int number04 = number03; // This can't be done, as double to int conversion is not possible.
        int number05 = (int)number03;
        System.out.println("double number03: " + number03 + " is now converted to int number05: " + number05 + " but have lost the data after decimal.");

        /*
         * Examples of Non-primitive (Reference) types:
         * String, Arrays, Classes, Interfaces
        */
    }
}