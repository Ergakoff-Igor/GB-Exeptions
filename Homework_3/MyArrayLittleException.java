public class MyArrayLittleException extends RuntimeException{

    public MyArrayLittleException (String input){

        super(String.format("В строке [%s] заполнены не все поля", input));
    }

}