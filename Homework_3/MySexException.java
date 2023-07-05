public class MySexException extends RuntimeException{

    public MySexException (String input){

        super(String.format("Пол должен указываться 'm' или 'f', введено: [%s]", input));
    }

}
