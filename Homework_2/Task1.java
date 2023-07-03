/*
 * Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
 * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
 * вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.Scanner;

public class Task1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static float inputFloatNum(String invite) {

        while (true) {
            try {
                System.out.print("Введите дробное число через точку: ");
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("\033[H\033[J");
                System.out.println("Введите число в правильном формате вещественного - допустимы только цифры и точка");
            }
        }
    }

    public float inputFloatNum() {
        System.out.print("\033[H\033[J");
        return inputFloatNum("");
    }

}
