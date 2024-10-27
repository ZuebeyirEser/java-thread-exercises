package headfirstjava;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric1 {
    public static void main(String[] args) {
        List<Animal> animals = List.of(new Dog(), new Cat(), new Cat());
        takeAnimal(animals);
        List<Dog> dogs = List.of(new Dog(), new Dog(), new Dog());
        takeAnimal(dogs);

    }
    public static void takeAnimal(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.eat();

        }
    }
}
