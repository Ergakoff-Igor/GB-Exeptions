/* Task 3:
 * Если необходимо, исправьте код:
    public static void main(String[] args) throws Exception {                   // main не должен пробрасывать исключения,
                                                                                // Необходим рефакторинг кода
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);                                          // Необходима обработка деления на 0;
            printSum(23, 234);
            int[] abc = { 1, 2 };                                               // Хардкод
            abc[3] = 9;                                                         // Хардкод
        } catch (Throwable ex) {                                                // Нарушена иерархия исключений
                                                                                // Обработку данного исключения нужно поставить в конце списка, 
                                                                                // т.к. при его вызов смысл других отсутствует
            System.out.println("Что-то пошло не так...");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(Integer a, Integer b) throws FileNotFoundException { // Данный метод не может вызвать FileNotFoundException
                                                                                     // Необходимо добавить NullPointerException,
                                                                                     // Либо сменить тип входящих аргументов на int
        System.out.println(a + b);
    }
 */

public class Task3 {

    public void printDivide(int a, int b) {
        try {
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            throw new MyDivideByZeroException();
        }
    }

    public void changeArray(int[] abc, int index, int value) {
        try {
            abc[index] = value;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    public void printSum(Integer a, Integer b) throws NullPointerException {
        System.out.println(a + b);
    }

}
