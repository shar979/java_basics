import java.util.Scanner;

class BankAccount {

    // Encapsulation
    private int accountNo;
    private String accountName;
    private String emailAddress;
    private double accountBalance;

    public BankAccount(int accountNo, String accountName,
                       String emailAddress, double accountBalance) {

        this.accountNo = accountNo;
        this.accountName = accountName;
        this.emailAddress = emailAddress;
        this.accountBalance = accountBalance;
    }

      public int getAccountNo() {
        return accountNo;
    }

    public String getAccountName() {
        return accountName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // First account
        System.out.println("Enter details for Account 1:");

        System.out.print("Account Number: ");
        int accNo1 = input.nextInt();
        input.nextLine();

        System.out.print("Account Name: ");
        String accName1 = input.nextLine();

        System.out.print("Email Address: ");
        String email1 = input.nextLine();

        System.out.print("Account Balance: ");
        double balance1 = input.nextDouble();

        BankAccount account1 = new BankAccount(
            accNo1, accName1, email1, balance1
        );

        // Second account
        System.out.println("\nEnter details for Account 2:");

        System.out.print("Account Number: ");
        int accNo2 = input.nextInt();
        input.nextLine();

        System.out.print("Account Name: ");
        String accName2 = input.nextLine();

        System.out.print("Email Address: ");
        String email2 = input.nextLine();

        System.out.print("Account Balance: ");
        double balance2 = input.nextDouble();

        BankAccount account2 = new BankAccount(
            accNo2, accName2, email2, balance2
        );

        // Third account
        System.out.println("\nEnter details for Account 3:");

        System.out.print("Account Number: ");
        int accNo3 = input.nextInt();
        input.nextLine();

        System.out.print("Account Name: ");
        String accName3 = input.nextLine();

        System.out.print("Email Address: ");
        String email3 = input.nextLine();

        System.out.print("Account Balance: ");
        double balance3 = input.nextDouble();

        BankAccount account3 = new BankAccount(
            accNo3, accName3, email3, balance3
        );

        // Display account details
        System.out.println("\nACCOUNT DETAILS");
        System.out.println("---------------------------------------------------------------");

        System.out.printf("%-12s %-15s %-25s %s%n",
                "Acc No", "Acc Name", "Email", "Balance");

        System.out.println("---------------------------------------------------------------");

        System.out.printf("%-12d %-15s %-25s %.2f%n",
                account1.getAccountNo(),
                account1.getAccountName(),
                account1.getEmailAddress(),
                account1.getAccountBalance());

        System.out.printf("%-12d %-15s %-25s %.2f%n",
                account2.getAccountNo(),
                account2.getAccountName(),
                account2.getEmailAddress(),
                account2.getAccountBalance());

        System.out.printf("%-12d %-15s %-25s %.2f%n",
                account3.getAccountNo(),
                account3.getAccountName(),
                account3.getEmailAddress(),
                account3.getAccountBalance());

        System.out.println("---------------------------------------------------------------");

        input.close();
    }
}

