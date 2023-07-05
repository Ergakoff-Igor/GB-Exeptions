public class MyNumberException extends RuntimeException{
    
        public MyNumberException (String input){

        super(String.format("Некорректный формат номера, Введено: [%s]", input));
    }
}
