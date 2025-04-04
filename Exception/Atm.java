package Exception;

public class Atm {
    private double money;
    private int correctPin;

    public Atm(double initialMoney, int pin) {
        this.money = initialMoney;
        this.correctPin = pin;
    }

    public void withdraw(double amount, int pin) throws InvalidMoney, IncorrectPin, InsufficientFunds {

        if (amount <= 0) {
            throw new InvalidMoney("Invalid money: Amount must be greater than zero.");
        }

        if (pin != this.correctPin) {
            throw new IncorrectPin("Incorrect PIN.");
        }

        if (amount > this.money) {
            throw new InsufficientFunds("Insufficient funds.");
        }

        this.money -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + this.money);
    }

    public static class InvalidMoney extends Exception {
        public InvalidMoney(String message) {
            super(message);
        }
    }

    public static class IncorrectPin extends Exception {
        public IncorrectPin(String message) {
            super(message);
        }
    }

    public static class InsufficientFunds extends Exception {
        public InsufficientFunds(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Atm atm = new Atm(1000.0, 1234); 

        try {
            atm.withdraw(500.0, 1234); 
            atm.withdraw(-100.0, 1234); 
        } catch (InvalidMoney | IncorrectPin | InsufficientFunds e) {
            System.err.println("Error: " + e.getMessage());
        }

        try {
            atm.withdraw(100, 5678); 
        } catch (InvalidMoney | IncorrectPin | InsufficientFunds e) {
            System.err.println("Error: " + e.getMessage());
        }

        try{
            atm.withdraw(2000, 1234);
        } catch (InvalidMoney | IncorrectPin | InsufficientFunds e) {
            System.err.println("Error: " + e.getMessage());
        }

    }
}