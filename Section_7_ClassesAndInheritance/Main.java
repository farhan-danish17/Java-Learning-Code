package Section_7_ClassesAndInheritance;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        // car.make() = "Porsche";
        // car.model() = "Carrera";
        // car.colour() = "Red";
        System.out.println("make = " + car.getMake());
        System.out.println("model = " + car.getModel());
        car.describeCar();
    }
}
