package Section_7_ClassesAndInheritance.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Dog dog = new Dog();
        doAnimalStuff(dog, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {
        animal.makeNoice();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
