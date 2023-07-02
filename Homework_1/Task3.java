/* Задание 3:
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
 * и возвращающий новый массив, каждый элемент которого равен разности элементов 
 * двух входящих массивов в той же ячейке. Если длины массивов не равны, 
 * необходимо как-то оповестить пользователя.
 */

public class Task3 {
    
    public int [] diffArray(int [] arr1, int [] arr2){
        if (arr1.length != arr2.length){
            throw new MyArraysSizeException();
        }
        int [] resultArray = new int[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            resultArray[i] = arr1[i] - arr2[i];
        }
        return resultArray;
    }
}
