package section3_loops;

public class forLoop {
    public static void main(String[] args) {

        for (double rate = 5; rate <= 10.00; rate++) {
            double interestAmount = calculateInterest(100.00, rate);
            System.out.println("10,000 at " + rate + " % interest is " +  interestAmount);
        }

        for (double rate = 7.5; rate <= 10.00; rate+=0.25) {
            double interestAmount = calculateInterest(100.00, rate);
            System.out.println("10,000 at " + rate + " % interest is " +  interestAmount);
        }
    }


    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
    }
}
