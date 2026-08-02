package section2_Methods;

public class methodsOverLoadingChallenge {
    public static void main(String[] args) {

        System.out.println(converterToCentimeters(54));
        System.out.println(converterToCentimeters(54, 12));

    }

    public static double converterToCentimeters(int inches) {
        double centimeters = inches * 2.54;
        return centimeters;
    }

    public static double converterToCentimeters(int feet, int inches) {
        int totalInches = feet * 12 + inches;
        return converterToCentimeters(totalInches);
    }
}
