package challenges;

public class challengeOperators {
    public static void main(String[] args) {
        double num = 20.00;
        double num2 = 80.00;

        double result = (num + num2) * 100.00;
        System.out.println("MyValueTotal is " + result);

        double remainder = result % 40;  //Esto sería el resto de 10.000 dividido por 40
        System.out.println("theRemainder = " + remainder);

        boolean isNoremeinder = (remainder == 0) ? true : false;
        System.out.println("isNoRemainder = " + isNoremeinder);

        if (!isNoremeinder) {
            System.out.println("Got some remainder");
        }
    }
}
