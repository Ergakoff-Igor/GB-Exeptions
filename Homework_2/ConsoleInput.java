import java.util.Scanner;

public class ConsoleInput  {
      private static final Scanner scanner = new Scanner(System.in);

    /** Метод, который запрашивает у пользователя ввод дробного числа (типа float),
     * и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
     * вместо этого, необходимо повторно запросить у пользователя ввод данных
     * @return float
     */
    public static float inputFloat(String invite) {
        while (true) {
            try {
                System.out.print(invite);
                return Float.parseFloat(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Введите число в правильном формате вещественного - допустимы только цифры и точка");
            }
        }
    }

    
    public static float inputFloat() {
        return inputFloat("");
    }

    /**
     * Метод  для ввода строки пользователем. Бросаем пользовательское исключение StringInputException при вводе пустой строки.
     * @return String Введенная строка
     * @throws StringInputException
     */
    // public static String inputString() throws StringInputException {
    //     return inputString("");
    // }

    // public static String inputString(String invite) throws StringInputException {
    //     String result;

    //             System.out.print(invite);
    //             result = scanner.nextLine();
    //             if (result.isEmpty()) throw new StringInputException("Строка не должна быть пустой");
    //             return result;

    // }
}
