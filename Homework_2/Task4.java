/* Задание 4:
 * Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
 * Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class Task4 {

    private static final Scanner scanner = new Scanner(System.in);

    public String inputValue() {
        System.out.print("\033[H\033[J");
        String str;
        while (true) {
            try {
                str = inputString("Введите строку: ");
                return str;
            } catch (StringInputException e) {
                System.out.print("\033[H\033[J");
                System.out.println("Строка не должна быть пустой");
            }
        }
    }

    public static String inputString(String invite) throws StringInputException {
        String result;

        System.out.print(invite);
        result = scanner.nextLine();
        if (result.isEmpty())
            throw new StringInputException("Строка не должна быть пустой");
        return result;

    }
}
