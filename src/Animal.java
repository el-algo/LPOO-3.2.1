// Superclase de Animales
public abstract class Animal {
    String name;
    String species;
    String food;
    int hunger;
    int location[] = new int[2];

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getFood() {
        return food;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHunger() {
        return hunger;
    }

    public void setLocation(int[] location) {
        this.location = location;
    }

    public int[] getLocation() {
        return location;
    }
    
    public void sleep() {
        System.out.println("Zzz...");
    }

    // Métodos a sobreescribir
    public void makeNoise() {}

    public void eat() {}

    public void roam() {
        System.out.println("Vagando por su cuenta.");
    }
}