class Account {
    private String owner;
    private int balance;

    public Account(String owner, int balance) {
        setOwner(owner);
        setBalance(balance);
    }

    void setOwner(String owner) {
        if (owner == null || owner.isEmpty()) {
            throw new IllegalArgumentException("Owner cannot be null");
        } else {
            this.owner = owner;
        }
    }

    void setBalance(int balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance must be non-negative");
        } else {
            this.balance = balance;
        }
    }

    void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            throw new IllegalArgumentException("Amount must be positive");
        }
        }

    void withdraw(int amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
    }

    int getBalance() {
            return this.balance;
        }
    }

class EncapsulationDemo {
    public static void main(String[] args) {
        Account ac = new Account("Sanidhy", 5000);

        ac.deposit(500);
        ac.withdraw(300);

        System.out.println(ac.getBalance());
    }
}