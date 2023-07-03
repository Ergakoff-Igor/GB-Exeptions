# GB. Исключения в программировании и их обработка. ДЗ № 2.

1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

2. Если необходимо, исправьте код:
try {\
int d = 0;\
double catchedRes1 = intArray[8] / d;\
System.out.println("catchedRes1 = " + catchedRes1);\
} catch (ArithmeticException e) {\
System.out.println("Catching exception: " + e);\
}

3. Если необходимо, исправьте код:
public static void main(String[] args) throws Exception {\
try {\
int a = 90;\
int b = 3;\
System.out.println(a / b);\
printSum(23, 234);\
int[] abc = { 1, 2 };\
abc[3] = 9;\
} catch (Throwable ex) {\
System.out.println("Что-то пошло не так...");\
} catch (NullPointerException ex) {\
System.out.println("Указатель не может указывать на null!");\
} catch (IndexOutOfBoundsException ex) {\
System.out.println("Массив выходит за пределы своего размера!");\
}\
}\
public static void printSum(Integer a, Integer b) throws FileNotFoundException {\
System.out.println(a + b);\
}

4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.