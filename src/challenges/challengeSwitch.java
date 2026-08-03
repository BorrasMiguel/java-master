package challenges;

public class challengeSwitch {
    public static void main(String[] args) {
        printNatoWord('b');
        printNatoWord('a');
        printNatoWord('i');

    }

    public static void printNatoWord(char character) {

        switch (character) {
            case 'a' -> System.out.println("Able");
            case 'b' -> System.out.println("Baker");
            case 'c' -> System.out.println("Charlie");
            case 'd' -> System.out.println("Dog");
            case 'e' -> System.out.println("Easy");
            default -> System.out.println("The letter with a messaging saying no found");

        }
    }
}
