package challenges;

public class digitSumChallenge {


    public static void main(String[] args) {
        System.out.println(sumDigits(125));
        System.out.println(sumDigits(1000));
        System.out.println(sumDigits(225));
        System.out.println(sumDigits(10));
    }

    public static int sumDigits (int number) {

        if (number < 0) {
            System.out.println("Number is negative");
            return -1;
        }

        int sumDigi = 0;

        while (number > 0) {
            sumDigi += (number % 10);
            number = number / 10;
        }

        return sumDigi;

    }
}
