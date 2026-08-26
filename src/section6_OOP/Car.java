package section6_OOP;

public class Car {

    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar() {
        System.out.println("Make is: " + make +
                            " \nModel is: " + model +
                            " \nColor is: " + color +
                            " \nDoors is: " + doors +
                            " \nConvertible is: " + (convertible ? "convertible" : " "));
    }
}
