import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть перше число:");
        double num1 = scanner.nextDouble();

        System.out.println("Введіть оператор (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Введіть друге число:");
        double num2 = scanner.nextDouble();

        double result;

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Результат: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Результат: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Результат: " + result);
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Результат: " + result);
                } else {
                    System.out.println("Помилка: ділення на нуль!");
                }
                break;
            default:
                System.out.println("Невірний оператор. Використовуйте +, -, * або /.");
        }

        scanner.close();
    }
}
