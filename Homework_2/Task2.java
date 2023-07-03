/* Task 2:
 * Если необходимо, исправьте код:
 *  try {
        int d = 0;                                            // Хардкод, от которогу нужно избавляться 

        double catchedRes1 = intArray[8] / d;                 // 1. Необходимо привести числитель к double, иначе результат будет без дробных
                                                              // 2. Избавляемся от хардкода, при указании индекса массива
        System.out.println("catchedRes1 = " + catchedRes1);

    } catch (ArithmeticException e) {                         // 1. Необходимо добавить обработку ArrayIndexOutOfBoundsException
                                                              // 2. Необходимо добавить обработку NullPointerException
        System.out.println("Catching exception: " + e);       // 3. Можно переопределить обработку ArithmeticException
    }
 */

import java.util.Arrays;

public class Task2 {

    public void resultCode(int[] intArray, int d, int index) {
        try {
            double catchedRes1 = (double) intArray[index] / d;
            if (d == 0) {
                throw new MyDivideByZeroException();
            }
            System.out.printf("catchedRes1 = " + catchedRes1);
        } catch (NullPointerException e) {
            System.out.println("У вас NullPointerException: " + e + "\n>>> " + Arrays.toString(e.getStackTrace()));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println(new MyDivideByZeroException());
        }
    }
}
