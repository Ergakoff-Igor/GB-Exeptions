
public class App {
    public void ButtonClick() {
        while (true) {
            try {
                String str = new ConsoleView().inputValue();
                Contact contact = new InputContact().inputContact(str);
                System.out.printf("Создан новый контакт: %s\n", contact);
                new SaveContact().write(contact);
                System.out.printf("Контакт [%s] упешно сохранен", contact);
                System.exit(0);
            } catch (RuntimeException e) {
                System.out.println(e);
            }
        }
    }
}
