package ClassesChallenge;

public class Account {

    private int accountNumber = 0;
    private double accountBalance = 0.0;
    private String custumerName;
    private String email;
    private String phoneNumber;

    public void deposit(double amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
            return;
        }
        accountBalance += amount;
        System.out.println("Deposit of: " + amount + " made. New balance: " + accountBalance );
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
            return;
        }

        if (accountBalance - amount <= 0) {
            System.out.println("Insufficient balance");
            return;
        }

        accountBalance -= amount;
        System.out.println("Withdrawing: " + amount + " made. New balance: " + accountBalance );
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }


    public String getcustumerName() {
        return custumerName;
    }

    public void setcustumerName(String custumerName) {
        if (custumerName == null || custumerName.isBlank()) {
        this.custumerName = "Unknown";
        } else {
            this.custumerName = this.custumerName;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String mail) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
