/**
 * Главный класс запуска программ
 */
public class Program {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();
        Task3 task3 = new Task3();
        Task4 task4 = new Task4();

        // Task 1:
        System.out.printf("Вы ввели: %.2f",task1.inputFloatNum());

        // Task 2:
        int[] arrayTask2 = { 1, 5, 3, 3, 6, 15, 4, 5, 5, 1 };
        task2.resultCodeTask2(arrayTask2, 0, 8);

        // Task 3:
        int a = 90;
        int b = 3;
        task3.printDivide(a, b);

        task3.printSum(23, 234);

        int[] abc = { 1, 2 };
        task3.changeArray(abc, 3, 9);

        // Task 4:
        System.out.println("Введена строка: " + task4.inputValue());
    }
}