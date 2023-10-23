import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Animals.Fish;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Fish(false,"clownfish"));
        animals.add(new Dog(true,"Labrador","Tommy"));
        animals.add(new Cat(false,"Sphinx","Bob"));
        animals.add(new Cat(true,"Maine Coon","Fluffy"));
        for (Animal a:
             animals) {
            a.makeNoise();
        }
    }
}