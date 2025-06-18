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
        System.out.println("На счет ID " + id + " засчитано " + amount + " грн.");
    }
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Со счета ID " + id + " снято " + amount + " грн.");
        } else {
            System.out.println("Недостаточно средств на счете ID " + id);
        }
    }
    @Override
    public String toString() {
        return "Счет ID: " + id + ", Владелец: " + ownerName + ", Баланс: " + balance + " грн.";
    }
}
