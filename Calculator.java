import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double a = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        char op = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = scanner.nextDouble();

        double result;

        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero!");
                    return;
                }
                result = a / b;
                break;
            default:
                System.out.println("Operator is invalid");
                return;
        }

        System.out.println("Result of Calculation is: " + result);
        scanner.close();
    }
}