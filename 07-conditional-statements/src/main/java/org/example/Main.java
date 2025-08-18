package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner((System.in));

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("What operation do you want to perform? ");
        String operation = scanner.nextLine();

//        if(operation.equals("sum")){
//            System.out.printf("%f + %f = %f", number1, number2, (number1 + number2));
//        } else if (operation.equals("subtract")) {
//            System.out.printf("%f - %f = %f", number1, number2, (number1 - number2));
//        } else if (operation.equals("multiply")) {
//            System.out.printf("%f * %f = %f", number1, number2, (number1 * number2));
//        } else if (operation.equals("divide")) {
//            if(number2 == 0){
//                System.out.print("Cannot divide by zero");
//            } else{
//                System.out.printf("%f / %f = %f", number1, number2, (number1 / number2));
//            }
//        } else{
//            System.out.printf("%s is not a supported operation.", operation);
//        }

        switch (operation){
            case "sum":
                System.out.printf("%f + %f = %f", number1, number2, (number1 + number2));
                break;
            case "subtract":
                System.out.printf("%f - %f = %f", number1, number2, (number1 - number2));
                break;
            case "multiply":
                System.out.printf("%f * %f = %f", number1, number2, (number1 * number2));
                break;
            case "divide":
                if(number2 == 0){
                    System.out.print("Cannot divide by zero");
                } else{
                    System.out.printf("%f / %f = %f", number1, number2, (number1 / number2));
                }
                break;
            default:
                System.out.printf("%s is not a supported operation.", operation);
        }

        scanner.close();
    }
}