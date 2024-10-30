import java.util.Scanner;

public class Calculation2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст для підрахунку кількості речень:");
        String text = scanner.nextLine();


        int sentenceCount = 0;
        int i = 0;


        while (i < text.length()) {
            char symbol = text.charAt(i);

            if (symbol == '.' || symbol == '!' || symbol == '?') {
                sentenceCount++;
            }
            i++;
        }

        System.out.println("Кількість речень: " + sentenceCount);
        scanner.close();
    }
}
