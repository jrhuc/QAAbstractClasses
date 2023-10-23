package Animals;

public class Dog extends Animal {
    protected String breed;
    protected String name;

    public Dog(boolean fluffy, String breed, String name) {
        super(fluffy);
        this.breed = breed;
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark");
    }
}
