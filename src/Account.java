public class Account {
    private int id;
    private String ownerName;
    private double balance;

    public Account(int id, String ownerName, double balance) {
        this.id = id;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("На рахунок ID " + id + " зараховано " + amount + " грн.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("З рахунку ID " + id + " знято " + amount + " грн.");
        } else {
            System.out.println("Недостатньо коштів на рахунку ID " + id);
        }
    }

    @Override
    public String toString() {
        return "Рахунок ID: " + id + ", Власник: " + ownerName + ", Баланс: " + balance + " грн.";
    }
}
