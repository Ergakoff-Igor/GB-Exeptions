public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException() {
        super("Массив не квадратный");
    }

    public MyArraySizeException(String message) {
        super(message);
    }
}
