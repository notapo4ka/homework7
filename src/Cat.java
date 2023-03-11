import java.util.Objects;

public class Cat extends Animal {
    private static int catsCount;
    private final int maxRunMeters = 200;

    public Cat(String name) {
        super(name);
        catsCount++;
    }

    public static int getCatsCount() {
        return catsCount;
    }

    @Override
    public String run(int distance) {
        Objects.requireNonNull(distance, "distance must not be null");
        if (distance == 0) {
            return "Distance must not be null";
        }
        if (distance > maxRunMeters) {
            return this.getName() + " не може пробігти так багато";
        }
        return super.run(distance);
    }

    @Override
    public String swim(int distance) {
        Objects.requireNonNull(distance, "distance must not be null");
        if (distance == 0) {
            return "Distance must not be null";
        }
        return this.getName() + " не вміє плавати";
    }
}
