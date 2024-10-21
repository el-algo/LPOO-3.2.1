// Subclase de león
public class Lion extends Feline {
    public void makeNoise() {
        System.out.println("Roarrr.");
    }

    @Override
    public void eat() {
        System.out.println("Comiendo como león.");
    }
}