import java.util.Objects;

public class Animal {
    private static int animalsCount;
    private String name;

    public Animal(String name) {
        this.name = name;
        animalsCount++;
    }

    public static int getAnimalsCount() {
        return animalsCount;
    }

    public String getName() {
        return name;
    }

    public String run(int distance) {
        Objects.requireNonNull(distance, "distance must not be null");
        if (distance == 0) {
            return "Distance must not be null";
        }
        return this.name + " пробіг " + distance + " метр/метрів";
    }

    public String swim(int distance) {
        Objects.requireNonNull(distance, "distance must not be null");
        if (distance == 0) {
            return "Distance must not be null";
        }
        return this.name + " проплив " + distance + " метр/метрів";
    }
}
