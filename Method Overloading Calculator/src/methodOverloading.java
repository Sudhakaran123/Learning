import java.util.Scanner;

public class methodOverloading {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        double result = 0.0;

        switch (operator) {
            case '+':
                result = calculate(num1, num2, '+');
                break;
            case '-':
                result = calculate(num1, num2, '-');
                break;
            case '*':
                result = calculate(num1, num2, '*');
                break;
            case '/':
                result = calculate(num1, num2, '/');
                break;
            default:
                System.out.println("Invalid operator.");
                System.exit(1);
        }

        System.out.println("Result: " + result);

        scanner.close();
    }

    public static double calculate(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    System.exit(1);
                }
            default:
                System.out.println("Invalid operator.");
                System.exit(1);
                return 0;
        }
    }
}
