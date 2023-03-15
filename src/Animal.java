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
        if (distance <= 0) {
            return "The [distance] parameter must be non-zero and greater than zero";
        }
        return this.name + " пробіг " + distance + " метр/метрів";
    }

    public String swim(int distance) {
        if (distance <= 0) {
            return "The [distance] parameter must be non-zero and greater than zero";
        }
        return this.name + " проплив " + distance + " метр/метрів";
    }
}
