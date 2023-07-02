/* Задание 4:
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, 
 * и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих 
 * массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. 
 * Важно: При выполнении метода единственное исключение, 
 * которое пользователь может увидеть - RuntimeException, т.е. ваше.
 */

public class Task4 {

    public double[] divideArray(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new MyArraysSizeException();
        }
        double[] resultArray = new double[arr1.length];
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] == 0){
                throw new MyDivideByZeroException();
            }
            resultArray[i] = (double) arr1[i] / (double) arr2[i];
        }
        return resultArray;
    }
}
