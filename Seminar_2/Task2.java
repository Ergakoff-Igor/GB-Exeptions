/**
 * Обработайте возможные исключительные ситуации. "Битые" значения
 * в исходном массиве считайте нулями. Можно внести в код правки,
 * которые считаете необходимыми
 */

public class Task2 {
    public static void main(String[] args) {
        String[][] arr0 = new String[][] {
                { "1", "1" },
                { "1", "1", "1", "1", "1" },
                { "1", "2" },
                { "3", "3" },
                { "2", "6" }
        };

        System.out.println(sum2d(arr0));

    }

    private static int sum2d(String[][] arr) {
        int sum = 0;
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < 5; j++) {
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                }
            }

        } catch (NumberFormatException e) {
            System.out.println("Введено не число");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Мало элементов в двумерном массиве дополнено нулями");
            sum = sum2d(copy(arr, 5));
        }
        return sum;
    }

    private static String[][] copy(String[][] array, int length) {
        for (int i = 0; i < length; i++) {
            String[] element = array[i];
            if (element.length < length) {
                String[] temp = new String[length];
                System.arraycopy(element, 0, temp, 0, element.length);
                for (int j = element.length; j < temp.length; j++) {
                    temp[j] = "0";
                }
                // element = temp;
                array[i] = temp;
            }
        }
        return array;
    }
}