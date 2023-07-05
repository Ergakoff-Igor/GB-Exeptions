public class InputContact {

    public Contact inputContact(String input) {
            String[] array = input.split(" ");
            if (array.length > 6) {
                throw new MyArrayLimitException(input);
            }
            if (array.length < 6) {
                throw new MyArrayLittleException(input);
            }
            if (array[3].length() != 10) {
                throw new MyDateException(array[3]);
            }
            if (array[4].length() != 7) {
                throw new MyNumberException(array[4]);
            }
            if (!array[5].equals("m") && !array[5].equals("f")) {
                throw new MySexException(array[5]);
            }
            Contact newContact = new Contact(array[0], array[1], array[2], array[3], array[4], array[5]);
            return newContact;

    }

    /*
     * while (true) {
     * try {
     * str = inputString("Введите данные контакта через пробел: ");
     * return str;
     * 
     * } catch (StringInputException e) {
     * System.out.print("\033[H\033[J");
     * System.out.println("Строка не должна быть пустой");
     * }
     * }
     */
}
