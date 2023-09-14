package smyrna;
public class Main {
    public static void main(String[] args) {
        Animal bear = new Animal();
        Animal dog = new Animal();
        Animal cat = new Animal();

        String[] bearDescription = {"large", "claws", "loves honey"};

        bear.avgWeight = 365;
        bear.setDescription(bearDescription);
        bear.sound = "roar";

        dog.avgWeight = 120;
        String[] dogDescription = {"medium", "friendly", "man's best friend"};
        dog.setDescription(dogDescription);
        dog.sound = "woof woof";

        cat.avgWeight = 10;
        String[] catDescription = {"small", "evil", "no one likes them"};
        cat.setDescription(catDescription);
        cat.sound = "meow";

        cat.printAnimalSound();
        dog.printAnimalSound();
        bear.printAnimalSound();

        cat.printDescription();
        dog.printDescription();
        bear.printDescription();
    }
}