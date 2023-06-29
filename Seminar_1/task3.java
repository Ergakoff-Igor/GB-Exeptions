package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

//Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
//        Необходимо посчитать и вернуть сумму элементов этого массива. При этом накладываем на метод 2 ограничения:
//        метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может
//        лежать только значение 0 или 1. Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением
//        об ошибке.
public class task3 {
    static int[][] arr0 = new int[][]{
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 0, 1, 1},
            {1, 1, 1, 1, 1},
            {1, 1, 1, 1, 1}
    };

    private static int arrSum(int[][] arr) {
        if (isNotSquareArr(arr)) {
            throw new RuntimeException("массив не квадратный");
        }
        if (isDataNotCorrect(arr)) {
            throw new RuntimeException("массив должен содержать 0 или 1");
        }
        return Arrays.stream(arr).mapToInt(ints -> Arrays.stream(ints, 0, arr.length).sum()).sum();
    }


    private static boolean isNotSquareArr(int[][] arr) {
        for (int[] ints : arr) {
            if (arr.length != ints.length) {
                return true;
            }
        }
        return false;
    }

    private static boolean isDataNotCorrect(int[][] arr) {
        List<Integer> container = List.of(0, 1);
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if (!container.contains(arr[i][j])) {
//                    return  true;
//                }
//            }
//        }
//        return false;
        return IntStream.range(0, arr.length)
                .anyMatch(i -> IntStream.range(0, arr.length)
                        .anyMatch(j -> !container.contains(arr[i][j])));
    }

    public static void main(String[] args) {
        System.out.println(arrSum(arr0));
    }
}
