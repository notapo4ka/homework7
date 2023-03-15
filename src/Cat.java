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
        if (distance > maxRunMeters) {
            return this.getName() + " не може пробігти так багато";
        }
        return super.run(distance);
    }

    @Override
    public String swim(int distance) {
        return this.getName() + " не вміє плавати";
    }
}
