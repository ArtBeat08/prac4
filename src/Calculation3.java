import java.util.Scanner;

public class Calculation3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Введіть початкове значення діапазону: ");
        int start = scanner.nextInt();

        System.out.print("Введіть кінцеве значення діапазону: ");
        int end = scanner.nextInt();


        System.out.print("Введіть просте число від 1 до 9: ");
        int primeNumber = scanner.nextInt();


        if (primeNumber != 2 && primeNumber != 3 && primeNumber != 5 && primeNumber != 7) {
            System.out.println("Помилка: Введене число має бути простим і від 1 до 9.");
        } else {
            System.out.println("Числа у діапазоні, що не кратні " + primeNumber + ":");


            for (int i = start; i <= end; i++) {

                if (i % primeNumber == 0) {
                    continue;
                }
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }
}
