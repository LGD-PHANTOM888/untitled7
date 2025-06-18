import java.util.HashMap;
public class BankDemo {
    public static void main(String[] args) {
        HashMap<Integer, Account> accounts = new HashMap<>();
        accounts.put(1, new Account(1, "Иван Петренко", 1200.0));
        accounts.put(2, new Account(2, "Елена Коваль", 1500.0));
        accounts.put(3, new Account(3, "Сергей Иванов", 800.0));
        accounts.put(4, new Account(4, "Наталья Литвин", 2000.0));
        accounts.put(5, new Account(5, "Андрей Савчук", 500.0));
        accounts.put(6, new Account(6, "Мария Дяченко", 3000.0));
        System.out.println("=== МЕНЮ БАНКОВСКОЙ СИСТЕМЫ ===");
        System.out.println("1. Показать все счета");
        System.out.println("2. Найти счет по ID");
        System.out.println("3. Пополнить счет");
        System.out.println("4. Снять деньги");
        System.out.println("5. Выйти");
        System.out.println("\n=== СПИСОК ВСЕХ СЧЕТОВ ===");
        for (Account account : accounts.values()) {
            System.out.println(account);
        }
        System.out.println("\n=== ПОИСК СЧЕТА С ID = 3 ===");
        Account acc3 = accounts.get(3);
        if (acc3 != null) {
            System.out.println(acc3);
        }
        System.out.println("\n=== ПОЛУЧЕНИЕ СЧЕТА ID = 2 НА 450 ГРН ===");
        Account acc2 = accounts.get(2);
        if (acc2 != null) {
            acc2.deposit(450.0);
        }
        System.out.println("\n=== СНЯТИЕ 200 ГРН С СЧЕТА ID = 4 ===");
        Account acc4 = accounts.get(4);
        if (acc4 != null) {
            acc4.withdraw(200.0);
        }
        System.out.println("\n=== ОБНОВЛЕННЫЙ СПИСОК СЧЕТОВ ===");
        for (Account account : accounts.values()) {
            System.out.println(account);
        }
    }
}
