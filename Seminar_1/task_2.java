package org.example;

import java.io.BufferedReader;
import java.util.Scanner;

//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//        Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//        1. если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//        2. если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//        3. если вместо массива пришел null, метод вернет -3
//        4.Напишите метод, в котором реализуйте взаимодействие с пользователем.
//        То есть, этот метод запросит искомое число у пользователя, вызовет первый,
//        обработает возвращенное значение и покажет читаемый результат пользователю.
//        Например, если вернулся -2, пользователь увидит сообщение: “Искомый элемент не найден”.
public class task_2 {
    private static int[] array = {1,2,3,4};
    public static int getNum(int[] arr, int min, int num) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < min) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) return i;
        }
        return -2;
    }

    public static void run () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число и минимальную длину");
        int num = scanner.nextInt();
        int numLength = scanner.nextInt();
        int result = getNum(array, numLength, num);
        if (result == -2) {
            System.out.println("Искомый элемент не найден");
        }
        System.out.println(result);
    }

    public static void main(String[] args) {
        run();
    }
}

