public class MyArraysSizeException extends RuntimeException {

    public MyArraysSizeException() {
        super("Длины массивов не равны");
    }
}
