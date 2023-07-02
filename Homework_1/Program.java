// Класс запуска программы

public class Program {

    public static void main(String[] args) {

        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();
        PrintArray pa = new PrintArray();

        // Задание 1:

        int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        Integer[] array2 = { 1, 2, 3, 4, 5, null, 7, 8, 9, 10 };

        // ArithmeticException:
        System.out.println(task1.divide(5, 0));

        // ArrayIndexOutOfBoundsException
        task1.printValueByIndex(array1, 15);

        // NullPointerException
        System.out.println(task1.sumValue(array2));

        // Задание 2:

        String[][] arr = new String[][] {
        { "1", "1", "1" , "1", "1"},
        { "1", "1", "1" , "1", "1"},
        { "1", "1", "1" , "1", "1"},
        { "1", "1", "1" , "1", "1"},
        { "1", "1", "1" , "1", "1"}
        };

        System.out.println(task2.sum2d(arr));

        // Массивы для заданий № 3 и № 4:
        int[] array3 = { 1, 6, 6, 4, 5, 6, 7, 8, 9, 10 };
        int[] array4 = { 1, 5, 3, 3, 6, 15, 4, 5, 5, 1 };

        // Вывод исходных массивов:
        System.out.print("Массив № 1: ");
        pa.printArray(array3);
        System.out.print("Массив № 2: ");
        pa.printArray(array4);

        // Задание 3:
        System.out.print("Разность элементов массивов: ");
        pa.printArray(task3.diffArray(array3, array4));

        // Задание 4:
        System.out.print("Частное элементов массивов: ");
        pa.printArray(task4.divideArray(array3, array4));
    }

}
