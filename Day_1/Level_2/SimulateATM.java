// Q.2) Create a BankAccount class with attributes accountHolder, accountNumber, and balance.
// Add methods for:
//Depositing money.
//Withdrawing money (only if sufficient balance exists).
//Displaying the current balance.

// Create BankAccount class
class BankAccount {

    // set attributes
    private String bankAccount;
    private String accountHolder;
    private long accountNumber;
    public int currentBalance = 0;

    // Create constructor
    BankAccount(String bankAccount, String accountHolder, long accountNumber) {
        this.bankAccount = bankAccount;
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
    }

    // Create method to deposit money
    void depositMoney(int money) {
        if (money <= 0) {
            System.out.println("\nInvalid amount entered!");
        } else {
            currentBalance += money;
            System.out.print("\nMoney deposited successfully");
        }
    }

    // Create method to withdraw money
    void withdrawMoney(int money) {
        if (money <= 0) {
            System.out.println("\nInvalid amount entered!");
        } else {
            currentBalance -= money;
            System.out.println("\nMoney withdrawn successfully");
        }
    }

    // Create method to display the currentBalance
    void showCurrentBalance() {
        System.out.println("\nThe current balance is: " + currentBalance);
    }

}

public class SimulateATM {
    public static void main(String[] args) {

        // Create an object of BankAccount class
        BankAccount obj = new BankAccount("State Bank of India",
                "Adarsh",
                111211018);

        // call method to Deposit money in account
        obj.depositMoney(50000);

        // call method to withdraw money from account
        obj.withdrawMoney(12000);

        // call method to Display current Balance
        obj.showCurrentBalance();

    }
}
