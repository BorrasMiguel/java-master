package section3_loops;

public class swicht {
    public static void main(String[] args) {

//        int value = 1;
//        if (value == 1) {
//            System.out.println("value is 1");
//        } else if (value == 2) {
//            System.out.println("value is 2");
//        } else {
//            System.out.println("is not 1 or 2");
//        }

        printNumberInWord(3);
        printNumberInWord(2);
        printNumberInWord(5);

        }

    public static void printNumberInWord(int number) {

        switch (number) {
            case 0 -> System.out.println("zero");
            case 1 -> System.out.println("one");
            case 2 -> System.out.println("two");
            case 3 -> System.out.println("three");
            case 4 -> System.out.println("four");
            case 5 -> System.out.println("five");
            case 6 -> System.out.println("six");
            default -> System.out.println("other");
        }


    }
}
