/* Задание 2:
* Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
*/

public class Task2 {

    public int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
}
