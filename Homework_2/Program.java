/**
 * Главный класс запуска программ
 */
public class Program {



    public static void main(String[] args) {
        Task1 task1 = new Task1();
        Task2 task2 = new Task2();

        // Task 1:
        // System.out.printf("Вы ввели: %.2f",task1.inputFloatNum());

        // Task 2:
        int[] arrayTask2 = { 1, 5, 3, 3, 6, 15, 4, 5, 5, 1 };
        task2.resultCode(arrayTask2, 0, 8);

        
    }
}