import java.util.Scanner;

public class нов {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите выражение:");
        String strings = scanner.nextLine();
        String[] input = strings.split(" ");
        if (input.length != 3) {
            System.out.println("ошибка, введите корректное выражение");
            return;
        }
        int a = Integer.parseInt(input[0]);
        String operator = input[1];
        int b = Integer.parseInt(input[2]);
        int c = 0;
        if (a >= 0 && a <= 10 && b >= 0 && b <= 10) {
            switch (operator) {
                case "+":
                    c = a + b;
                    break;
                case "-":
                    c = a - b;
                    break;
                case "*":
                    c = a * b;
                    break;
                case "/":
                    // Проверка деления на 0
                    if (b != 0) {
                        c = a / b;
                    } else {
                        System.out.println("ошибка, введите корректное значение");
                        return;
                    }
                    break;
                default:
                    System.out.println("ошибка, введите корректное значение");
                    return;
            }
            System.out.println("Результат: " + c);
        } else {
            System.out.println("ошибка, введите корректные значения");
        }
    }
}