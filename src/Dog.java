public class Dog extends Animal {
    
    private static int dogsCount;
    private final int maxRunMeters = 500;
    private final int maxSwimMeters = 10;

    public Dog(String name) {
        super(name);
        dogsCount++;
    }

    public static int getDogsCount() {
        return dogsCount;
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
        if (distance > maxSwimMeters) {
            return this.getName() + " не може проплисти так багато";
        }
        return super.swim(distance);
    }
}
