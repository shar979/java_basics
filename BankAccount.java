
public class BankAccount {

    private String account_number;
    private double balance;
    private String date_of_opening;
    private String customer_name;

    public BankAccount(String account_number, double balance,
                       String date_of_opening, String customer_name) {

        this.account_number = account_number;
        this.balance = balance;
        this.date_of_opening = date_of_opening;
        this.customer_name = customer_name;
    }

    public double deposit(double amount) {
        balance = balance + amount;
        return amount;
    }

    public String withdraw(double amount) {

        if (balance < amount) {
            return "Insufficient balance";
        } else {
            balance = balance - amount;
            return String.valueOf(amount);
        }
    }

    public void check_balance() {
        System.out.println("Current Balance: " + balance);
    }

    public void customer_details() {
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Account Number: " + account_number);
        System.out.println("Date of Opening: " + date_of_opening);
        System.out.println("Account Balance: " + balance);
    }

    public static void main(String[] args) {

        BankAccount account = new BankAccount(
            "ACC001", 5000.0, "15/11/2026", "John Mwangi"
        );

        System.out.println("Amount Deposited: " +
                           account.deposit(1500));

        System.out.println("Amount Withdrawn: " +
                           account.withdraw(1000));

        account.check_balance();

        System.out.println("\nCustomer Details:");
        account.customer_details();
    }
}
