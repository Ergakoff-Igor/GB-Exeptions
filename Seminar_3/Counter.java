// Task 2

import java.io.IOException;

import javax.imageio.IIOException;

/**
 * Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение
 * внутренней int переменной на 1. Сделайте так, чтобы с объектом такого типа
 * можно было работать в блоке try-with-resources. Подумайте, что должно
 * происходить
 * при закрытии этого ресурса? Напишите метод для проверки, закрыт ли ресурс.
 * При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
 */
public class Counter implements AutoCloseable {
    public int num = 0;
    public boolean closed = false;

    public void add() throws Exception{
        if (closed) {
            throw new IOException("Ресурс уже закрыт");
        }
        num++;

    }

    @Override
    public void close() throws Exception {
        System.out.println("Ресурс успешно закрыт");
        closed = true;
    }

    @Override
    public String toString() {
        return "Counter{" +
                "count=" + num +
                '}';
    }
}
