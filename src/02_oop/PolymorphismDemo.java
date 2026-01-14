abstract class PaymentMethod {
    abstract void pay (int amount);
}

class CardPaymentMethod extends PaymentMethod {
    @Override
    void pay(int amount) {
        System.out.println("Paid " + amount + " using card!");
    }
}

class UPIPaymentMethod extends PaymentMethod {
    @Override
    void pay(int amount) {
        System.out.println("Paid " + amount + " using UPI!");
    }
}

class CashPaymentMethod extends PaymentMethod {
    @Override
    void pay(int amount) {
        System.out.println("Paid " + amount + " using cash!");
    }
}

class PolymorphismDemo {
    static void processPayment(PaymentMethod payment, int amount) {
        payment.pay(amount);
    }

    public static void main(String[] args) {
        PaymentMethod p1 = new CardPayment();
        PaymentMethod p2 = new UPIPayment();
        PaymentMethod p3 = new CashPayment();

        processPayment(p1, 500);
        processPayment(p2, 1200);
        processPayment(p3, 300);
    }
}