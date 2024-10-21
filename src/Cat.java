// Subclase de gato
public class Cat extends Feline implements Pet {
    public void makeNoise() {
        System.out.println("Miau.");
    }

    public void eat() {
        System.out.println("Comiendo como gato.");
    }

    public void beFriendly() {
        System.out.println("Ronroneando.");
    }

    public void play() {
        System.out.println("Jugando con un laser.");
    }
}
