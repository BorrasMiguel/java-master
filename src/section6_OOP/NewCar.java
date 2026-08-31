package section6_OOP;

public class NewCar {
    public static void main(String[] args) {
        Car car = new Car();

        car.setMake("BMW");
        car.setModel("Serie 5");
        car.setColor("Blue");
        car.setDoors(4);

        System.out.println("Make " + car.getMake());
        System.out.println("Model " + car.getModel());

        car.describeCar();

        Car car2 = new Car();
        car2.setMake("Porsche");
        car2.setModel("Carrera");
        car2.setColor("white");
        car2.setDoors(2);
        System.out.println("Make " + car2.getMake());
        System.out.println("Model " + car2.getModel());
        car2.describeCar();
    }
}
