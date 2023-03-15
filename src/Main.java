public class Main {

    public static void main(String[] args) {
        Animal dogCommander = new Dog("Командер");
        Animal dogPrivate = new Dog("Рядовий");

        Animal catPretty = new Cat("Гарний");
        Animal catUki = new Cat("Юкі");

        System.out.println();

        System.out.println(dogCommander.run(150));
        System.out.println(dogCommander.swim(5));

        System.out.println();

        System.out.println(dogPrivate.run(-1));
        System.out.println(dogPrivate.swim(15));

        System.out.println();

        System.out.println(catPretty.run(0));
        System.out.println(catPretty.swim(20));

        System.out.println();

        System.out.println(catUki.run(210));
        System.out.println(catUki.swim(-1));

        System.out.println();

        System.out.println("Кількість котів: " + Cat.getCatsCount());
        System.out.println("Кількість собак: " + Dog.getDogsCount());
        System.out.println("Загальна кількість тварин: " + Animal.getAnimalsCount());
    }
}
