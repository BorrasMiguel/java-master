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

        String month = "APRIL";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");

        System.out.println(getQuarter("NOVEMBER"));
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

    //yield aparece cuando en vez de devolver directamente con -> "1st", necesitas abrir un bloque { } y hacer más cosas dentro.
    // Si usas yield con varias lineas si necesitas yield

    public static String getQuarter(String month) {

        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> "1st";
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> "4th";
            default -> {
                yield month + " is bad";
            }
        };

    }
}

