// Subclase de perro
public class Dog extends Canine implements Pet {
    public void makeNoise() {
        System.out.println("Guau.");
    }

    public void eat() {
        System.out.println("Comiendo como perro.");
    }

    public void beFriendly() {
        System.out.println("Buscando caricias.");
    }
    
    public void play() {
        System.out.println("Agarrando la pelota.");
    }
}
