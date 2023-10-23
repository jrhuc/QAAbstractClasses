package Vehicles;

import Animals.Moveable;

public class Plane implements Moveable {
    @Override
    public String move() {
        return "move by flying";
    }
}
