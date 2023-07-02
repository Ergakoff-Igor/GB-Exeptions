
/*
 * Задание № 1:
 * Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */
public class Task1 {

    public double divide(int a, int b) {
        return a / b;
    }

    // out of bounds
    public void printValueByIndex(int[] array, int index) {
        System.out.printf("Элемент с индексом %d равен %d.\n", index, array[index]);
    }

    public int sumValue(Integer [] array){
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }
}