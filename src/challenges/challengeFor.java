package challenges;

public class challengeFor {
    public static void main(String[] args) {

        int counter = 0;
        int sum = 0;
        for (int num = 1; num <= 1000; num ++) {
            if (num % 3 == 0 && num % 5 == 0) {
                System.out.println(num);
                sum += num;
                counter++;

                if (counter == 5) {
                    System.out.println("The sum of the numbers is " + sum);
                    break;
                }
            }
        }
    }
}
