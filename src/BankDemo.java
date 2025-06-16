import java.util.HashMap;

public class BankDemo {
    public static void main(String[] args) {
        HashMap<Integer, Account> accounts = new HashMap<>();

        accounts.put(1, new Account(1, "Іван Петренко", 1200.0));
        accounts.put(2, new Account(2, "Олена Коваль", 1500.0));
        accounts.put(3, new Account(3, "Сергій Іванов", 800.0));
        accounts.put(4, new Account(4, "Наталія Литвин", 2000.0));
        accounts.put(5, new Account(5, "Андрій Савчук", 500.0));
        accounts.put(6, new Account(6, "Марія Дяченко", 3000.0));

        System.out.println("=== МЕНЮ БАНКІВСЬКОЇ СИСТЕМИ ===");
        System.out.println("1. Показати всі рахунки");
        System.out.println("2. Знайти рахунок за ID");
        System.out.println("3. Поповнити рахунок");
        System.out.println("4. Зняти кошти");
        System.out.println("5. Вийти");

        System.out.println("\n=== СПИСОК ВСІХ РАХУНКІВ ===");
        for (Account account : accounts.values()) {
            System.out.println(account);
        }

        System.out.println("\n=== ПОШУК РАХУНКУ З ID = 3 ===");
        Account acc3 = accounts.get(3);
        if (acc3 != null) {
            System.out.println(acc3);
        }

        System.out.println("\n=== ПОПОВНЕННЯ РАХУНКУ ID = 2 НА 450 ГРН ===");
        Account acc2 = accounts.get(2);
        if (acc2 != null) {
            acc2.deposit(450.0);
        }

        System.out.println("\n=== ЗНЯТТЯ 200 ГРН З РАХУНКУ ID = 4 ===");
        Account acc4 = accounts.get(4);
        if (acc4 != null) {
            acc4.withdraw(200.0);
        }

        System.out.println("\n=== ОНОВЛЕНИЙ СПИСОК РАХУНКІВ ===");
        for (Account account : accounts.values()) {
            System.out.println(account);
        }
    }
}
