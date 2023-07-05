
import java.util.Scanner;


public class ConsoleView {
    Scanner in;

    private static final Scanner scanner = new Scanner(System.in, "ibm866");

    public String inputValue() throws RuntimeException {
        // System.out.print("\033[H\033[J");
        String str;
        while (true) {
            try {
                str = inputString("Введите данные контакта через пробел: ");
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
