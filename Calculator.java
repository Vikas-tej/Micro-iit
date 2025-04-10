import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the  first number:");
        double a = input.nextDouble();
        System.out.println("Enter the operator:");
        char op = input.next().charAt(0);
        System.out.println("Enter the second number:");
        double b = input.nextDouble();
        double result;
        switch (op) {
            case '+':
                result = a + b;
                System.out.println(result);
                break;
            case '-':
                result = a - b;
                System.out.println(result);
                break;
            case '*':
                result = a * b;
                System.out.println(result);
                break;
            case '/':
                if (b != 0) {
                    result = a / b;
                    System.out.println("the result is :" + result);
                } else {
                    System.out.println("Error! not divisible by zero.");
                    input.close();
                }
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }
        input.close();
    }
}