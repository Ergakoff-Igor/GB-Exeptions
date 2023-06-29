package org.example;

import java.util.Scanner;

//Создайте boolean метод, который запросит у пользователя поля: login, password и confirm password
//          Логин должен содержать только символы: a, b, c, d, e, 0,1, _, если это не так нужно бросить RuntimeException
//        с соответствующим сообщением.
//          Логин должен быть не меньше 4 и не больше 8 символов, если это не так нужно бросить RuntimeException с соответствующим
//        сообщением.
//          Пароль должен быть не меньше 4 и не больше 8 символов и состоять только из цифр, если это не так нужно бросить
//        RuntimeException с соответствующим сообщением.
//          Пароль и его повтор должны совпадать, если это не так нужно бросить RuntimeException с соответствующим сообщением.
public class task4 {

    private static boolean loginIsValid(String login) {
        if (!login.matches("[abcde01_]{4,8}")) {
            throw new RuntimeException("Логин должен содержать только символы: a, b, c, d, e, 0, 1, _ " +
                    "и быть длиной от 4 до 8 символов!");
        }
        return true;
    }

    private static boolean passwordIsValid(String password) {
        if (!password.matches("\\d{4,8}")) {
            throw new RuntimeException("Пароль должен состоять только из цифр и быть длиной от 4 до 8 символов!");
        }
        return true;
    }

    private static boolean passwordsIsEquals(String password, String confirm) {
        if (!password.equals(confirm)) {
            throw  new RuntimeException ("пароль и повтор должны совпадать");
        }
        return true;
    }

    private static boolean check (String login, String password, String confirm) {
        return loginIsValid(login) && passwordIsValid(password) && passwordsIsEquals(password, confirm);
    }

    private static void run() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите логин ");
        String login = scanner.next();
        System.out.println("Введите пароль ");
        String password = scanner.next();
        System.out.println("Повторите пароль ");
        String confirm = scanner.next();

        if (check(login, password, confirm)) System.out.println("вы успешно зарегистрировались.");
    }

    public static void main(String[] args) {
        while (true) {
            run();
        }
    }
}
