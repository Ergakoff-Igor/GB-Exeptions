
public class MyArrayLimitException extends RuntimeException{

    public MyArrayLimitException (String input){

        super(String.format("В строке [%s] слишшком много значений", input));
    }

}
