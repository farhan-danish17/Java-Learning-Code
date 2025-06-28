package Section_7_ClassesAndInheritance;

public class Car {
    
    private String make;
    private String model;
    private String colour;
    private int doors;
    private boolean convertible;

    public void describeCar () {
        System.out.println(
            doors + "-Door " +
            colour + " " +
            make + " " +
            model + " " +
            (convertible ? "convertible" : "")
            );
    }
}