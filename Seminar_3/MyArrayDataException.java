import java.util.List;

public class MyArrayDataException extends RuntimeException{

    public MyArrayDataException (int i, int j){
        super(String.format("В ячейке массива по адресу [%s][%s] не число", i, j));
    }
    
        public MyArrayDataException (List<Goal> goals){
        super(String.format("В ячейке массива по адресу %s не число", goals));
    }
}
