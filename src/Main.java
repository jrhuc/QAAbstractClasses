import Animals.*;
import Vehicles.Car;
import Vehicles.Plane;

import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();

        Fish fish = null;
        animals.add(new Fish(false,"clownfish"));
        animals.add(new Dog(true,"Labrador","Tommy"));
        animals.add(new Cat(false,"Sphinx","Bob"));
        animals.add(new Cat(true,"Maine Coon","Fluffy"));
        animals.add(fish);

        try {
            for (Animal a :
                    animals) {
                a.makeNoise();
            }
        }
        catch (NullPointerException n) {
            System.out.println("Null object reached");

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will always execute");
        }

        List<Moveable> move = new ArrayList<Moveable>();
        move.add(new Car());
        move.add(new Plane());
        move.add(new Dog(false,"Sphinx","Bob"));
        for (Moveable a:
                move) {
            System.out.println(a.move());
        }
    }
}