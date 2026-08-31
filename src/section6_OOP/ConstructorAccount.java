package section6_OOP;

public class ConstructorAccount {
    private String accountNumber;
    private String custumerName;
    private double balance;
    private String email;

    //Dos formas de crear constructores.

    public ConstructorAccount() {
        this("Unknown", "Unknown", 0.0, "Unknown");
    }

    public ConstructorAccount(
            String accountNumber,
            String custumerName,
            double balance,
            String email
    ) {
        this.accountNumber = accountNumber;
        this.custumerName = custumerName;
        this.balance = balance;
        this.email = email;
    }


}
