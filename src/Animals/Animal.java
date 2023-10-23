package Animals;

public abstract class Animal {
    protected boolean fluffy;

    public Animal(boolean fluffy) {
        this.fluffy = fluffy;
    }

    public abstract void makeNoise();
}
