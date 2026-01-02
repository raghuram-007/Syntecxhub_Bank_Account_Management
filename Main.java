import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankManager manager = new BankManager();

        while (true) {
            System.out.println("\n===== Bank Account Management =====");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. View Balance");
            System.out.println("5. View All Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Account Number: ");
                    int accNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Account Holder Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();

                    manager.createAccount(accNo, name, bal);
                    break;

                case 2:
                    System.out.print("Enter Account Number: ");
                    manager.deposit(sc.nextInt(), getAmount(sc));
                    break;

                case 3:
                    System.out.print("Enter Account Number: ");
                    manager.withdraw(sc.nextInt(), getAmount(sc));
                    break;

                case 4:
                    System.out.print("Enter Account Number: ");
                    manager.viewBalance(sc.nextInt());
                    break;

                case 5:
                    manager.viewAllAccounts();
                    break

                case 6:
                    System.out.println(" Thank you for using Bank System!");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println(" Invalid choice!");
            }
        }
    }

    private static double getAmount(Scanner sc) {
        System.out.print("Enter Amount: ");
        return sc.nextDouble();
    }
}
