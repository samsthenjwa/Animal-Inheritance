public class Main {
    public static void main(String[] args) {
        Home home = new Home();

        Dog dog1 = new Dog();
        Animal dog2 = new Dog();
        Cat cat = new Cat();

        dog1.Sound();
        dog2.eat();

        cat.eat();
        cat.sound();

        home.makeAllSounds(dog1);
        home.adoptPet(dog1);


        home.adoptPet(cat);
        home.makeAllSounds(cat);


        home.adoptPet(dog1);
        home.makeAllSounds(dog2);

    }
}
