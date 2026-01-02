import java.util.*;

public class BankManager {

    private HashMap<Integer, BankAccount> accountMap = new HashMap<>();
    private HashSet<Integer> accountSet = new HashSet<>();

    // Create account
    public void createAccount(int accNo, String name, double initialBalance) {

        if (accountSet.contains(accNo)) {
            System.out.println(" Account number already exists!");
            return;
        }

        BankAccount account = new BankAccount(accNo, name, initialBalance);
        accountMap.put(accNo, account);
        accountSet.add(accNo);

        System.out.println(" Account created successfully!");
    }

    // Deposit
    public void deposit(int accNo, double amount) {
        BankAccount account = accountMap.get(accNo);

        if (account == null) {
            System.out.println(" Account not found!");
            return;
        }

        account.deposit(amount);
        System.out.println(" Amount deposited successfully!");
    }

    // Withdraw
    public void withdraw(int accNo, double amount) {
        BankAccount account = accountMap.get(accNo);

        if (account == null) {
            System.out.println(" Account not found!");
            return;
        }

        if (account.withdraw(amount)) {
            System.out.println(" Withdrawal successful!");
        } else {
            System.out.println(" Insufficient balance!");
        }
    }

    // View balance
    public void viewBalance(int accNo) 
        BankAccount account = accountMap.get(accNo);

        if (account == null) {
            System.out.println(" Account not found!");
            return;
        }

        System.out.println(" Current Balance: Rs." + account.getBalance());
    }

    // View all accounts (optional)
    public void viewAllAccounts() {
        if (accountMap.isEmpty()) {
            System.out.println(" No accounts available.");
            return;
        }

        for (BankAccount acc : accountMap.values()) {
            System.out.println(acc);
        }
    }
}
