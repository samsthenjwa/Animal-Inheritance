public class Main {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Animal dog2 = new Dog();
        Cat cat = new Cat();
        Home home = new Home();
        cat.setName("Storm");
        cat.sound();
        cat.eat();

        dog1.setName("Rax");
        dog1.Sound();
        dog2.setName("Rax");
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
