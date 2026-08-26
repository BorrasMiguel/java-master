package challenges;

public class challengeWhile {

    public static void main(String[] args) {

        int number = 1;
        int evenCount = 0;
        int oddCount = 0;

        while (number <= 20) {
            number++;
            if (!isEvenNumber(number)) {
                oddCount++;
                continue;
            }

            System.out.println("Even Number: " + number);
            evenCount++;

            if (evenCount >= 5) {
                break;
            }

        }

        System.out.println("Odd count: " + oddCount);
        System.out.println("Even count: " + evenCount);

    }

    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

}
