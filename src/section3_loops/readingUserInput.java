package section3_loops;

import java.util.Scanner;

public class readingUserInput {
    public static void main(String[] args) {

        int currentYear = 2026;

       //  System.out.println(getInputFromConsole((currentYear)));
        System.out.println(getInputFromScanner((currentYear)));
    }

    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("hi, what´s your name?");
        System.out.println("Hello, " + name);

        String dateOfBirthday = System.console().readLine("What date of birthday?");
        int age = currentYear - Integer.parseInt(dateOfBirthday);

        return "So are " + age + " years old!";
    }

    public static String getInputFromScanner(int currentYear) {

        Scanner scanner = new Scanner(System.in);

        // String name = System.console().readLine("hi, what´s your name?");
        System.out.println("Hello, what's your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);


        boolean validDOB = false;
        int age = 0;

        do {
            System.out.println("Enter year of birth >= " + (currentYear - 125) + " and <= " + currentYear);

            try {
                age = checkInputFromConsole(currentYear, scanner.nextLine());
                validDOB = age < 0 ? false : true;
            } catch (NumberFormatException e) {
                System.out.println("Please enter an integer");
            }

        } while (!validDOB);

        return "So are " + age + " years old!";

    }

    public static int checkInputFromConsole(int currentYear, String dateOfBirth) {

        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if (dob > currentYear || dob < minimumYear) {
            return -1;
        }

        return currentYear - dob;
    }

}
