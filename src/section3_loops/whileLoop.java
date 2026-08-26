package section3_loops;

public class whileLoop {

    public static void main(String[] args) {
        /*
        int j = 0;
        while (true) {
            if (j == 10) {
                break;
            }
            System.out.println(j);
            j++;
        }
*/
        int j = 1;
        boolean isReady = true;
        do {
            if (j > 10) {
                break;
            }
            System.out.println(j);
            j++;
        } while (isReady);

        int number = 0;
        while (number < 50) {
            number += 5;
            if (number % 25 == 0) {
                continue;
            }
            System.out.print( number + " _ ");
        }

    }

}
