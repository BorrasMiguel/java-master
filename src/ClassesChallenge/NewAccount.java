package ClassesChallenge;

public class NewAccount {

    public static void main(String[] args) {

        Account account1 = new Account();
        Account account2 = new Account();
        Account account3 = new Account();

        account1.setcustumerName("Miguel");
        account2.setcustumerName("Ana");
        account3.setcustumerName("Chica");

        account1.setEmail("miguel@gmail.com");
        account2.setEmail("ana@gmail.com");
        account3.setEmail("chica@gmail.com");

        account1.deposit(1000);
        account1.withdraw(300);

        account2.deposit(500);
        account2.withdraw(20);

        account3.deposit(30);
        account3.withdraw(100);

        System.out.println(account1.getAccountBalance());
        System.out.println(account2.getAccountBalance());
        System.out.println(account3.getAccountBalance());
    }
}
