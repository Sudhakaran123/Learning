package ProgramsAssaignment;

import java.util.Scanner;

public class TheCalculatorDilemma {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number");
        double num2 = scan.nextDouble();
        System.out.println("Enter the operator");
        String operation = scan.next();
        scan.close();

        calculation(num1, num2, operation);
    }

    public static void calculation(double num1, double num2, String operation) {
        double result;

        switch (operation) {
            case "+":
                result = num1 + num2;
                System.out.println("The addition result is: " + result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println("The subtraction result is: " + result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println("The multiplication result is: " + result);
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The division result is: " + result);
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            case "%":
                result = num1 % num2;
                System.out.println("The remainder result is: " + result);
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
