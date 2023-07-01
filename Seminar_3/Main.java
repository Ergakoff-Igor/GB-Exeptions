import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // try (Counter counter = new Counter();) {
        // counter.add();
        // counter.close();
        // counter.add();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        // devide(10, 0);
        try {
            reaFile();
        } catch (NonExistedFileException e) {
            System.out.println(e.getMessage());
        }

        // Counter counter = new Counter();
        // System.out.println("counter =" + counter);
        // try {
        // counter.add();
        // } catch (Exception e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // System.out.println(counter);

        // try {
        // counter.close();
        // } catch (Exception e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        // try {
        // counter.add();
        // } catch (Exception e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
    }

    // Task 3:

    public static double devide(int num1, int num2) {
        double result = 0;
        try {
            result = num1 / num2;

        } catch (ArithmeticException e) {
            throw new DivideByZeroException();
        }
        return result;
    }

    public static void reaFile() throws NonExistedFileException {
        try (FileReader reader = new FileReader(new File("test.txt"))) {
            reader.read();
        } catch (IOException e) {
            throw new NonExistedFileException();
        }
    }
}
