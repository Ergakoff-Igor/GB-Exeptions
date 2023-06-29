import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Запишите в файл следующие строки:
 *
 * Анна=4
 * Елена=5
 * Марина=6
 * Владимир=?
 * Полина=?
 * Константин=?
 * Иван=4
 *
 * Реализуйте метод, который считывает данные из файла и сохраняет в двумерный
 * массив (либо HashMap,
 * если студенты с ним знакомы). В отдельном методе нужно будет пройти по
 * структуре данных,
 * если сохранено значение ?, заменить его на соответствующее число.Если на
 * каком-то месте
 * встречается символ, отличный от числа или ?, бросить подходящее исключение.
 * Записать в тот же файл данные с замененными символами ?.
 */
public class Task3 {
    private static final List<String> strings = List.of("Анна=4", "Елена=5", "Марина=6", "Полина=?", "Владимир=?",
            "Константин=fgfgsfd", "Иван=4");
    // для проверки, заменить какое-то из значений на null

    public static void main(String[] args) {

        write(strings, "Task3.txt");
        rewrite("Task3.txt");
    }

    private static void write(List<String> strings, String path) {
        File file = new File(path);
        try {
            FileWriter writer = new FileWriter(file, true);
            for (String str : strings) {
                writer.write(str);
                writer.write("\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    private static Map<String, Integer> read(String path) {
        File file = new File(path);
        Map<String, Integer> result = new LinkedHashMap<>();
        BufferedReader reader = null;
        try {
//            FileReader fr = new FileReader(file); можно вместо 63 строки
            reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] array = line.split("=");
                String name = array[0];
                String temp = array[1];
                int number;
                if (temp.equals("?")) {
                    number = name.length();
                } else {
                    number = Integer.parseInt(temp);
                }
                result.put(name, number);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException("Файл не найден");
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении файла");
        }
        catch (NumberFormatException e) {
            throw new RuntimeException("Недопустимое значение");
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("Возможно в файле пустые строки");
        }
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }


    private static void rewrite(String path) {
        Map<String, Integer> map = read(path);
        List<String> toWrite = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            toWrite.add(entry.toString());
        }
        write(toWrite, path);
    }
}
