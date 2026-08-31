package section6_OOP;

public class Car {

    private String make = "Tesla";
    private String model = "Model Y";
    private String color = "grey";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }


    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        if (make == null) make = "Unknown";
        String toLowerCaseMake = make.toLowerCase();
        switch (toLowerCaseMake) {
            case "tesla", "bmw", "porsche", "ferrari" -> this.make = toLowerCaseMake;
            default -> {
                this.make = "Unsupported";
            }
        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar() {
        System.out.println("Make is: " + make +
                            " \nModel is: " + model +
                            " \nColor is: " + color +
                            " \nDoors is: " + doors +
                            " \nConvertible is: " + (convertible ? "convertible" : " "));
    }
}
