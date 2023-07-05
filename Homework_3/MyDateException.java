public class MyDateException extends RuntimeException{

    public MyDateException (String input){

        super(String.format("Некорректный формат даты Введено: [%s]", input));
    }

}