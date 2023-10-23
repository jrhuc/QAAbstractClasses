package Animals;

public class Fish extends Animal {
    protected String type;

    public Fish(boolean fluffy, String type) {
        super(fluffy);
        this.type = type;
    }

    @Override
    public void makeNoise() {
        System.out.println("glub glub");
    }
}
