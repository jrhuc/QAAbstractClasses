package Animals;

public class Cat extends Animal{
    protected String breed;
    protected String name;

    public Cat(boolean fluffy, String breed, String name) {
        super(fluffy);
        this.breed = breed;
        this.name = name;
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }
}
