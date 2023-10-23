package Vehicles;
import Animals.Moveable;


public class Car implements Moveable {
    @Override
    public String move() {
        return "Move using wheels";
    }
}
