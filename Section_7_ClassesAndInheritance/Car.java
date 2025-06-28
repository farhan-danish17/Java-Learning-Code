package Section_7_ClassesAndInheritance;

public class Car {
    
    private String make = "Tesla";
    private String model = "Model X";
    private String colour = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColour() {
        return colour;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

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