/*
Implemente una jerarquía de clases con información de animales y escriba una
clase de prueba donde se declare un arreglo de animales, creando un objeto de
cada tipo de animal e invocando los métodos declarados en la superclase Animal.
*/
public class Prueba {
    public static void main(String[] args) {
        // Declaración del arreglo de animales
        Animal[] animals = new Animal[6];
        
        // Creación de objetos de cada tipo de animal
            // Felinos
        animals[0] = new Lion();
        animals[1] = new Tiger();
        animals[2] = new Cat();

            // Hipopotamo
        animals[3] = new Hippo();
        
            // Caninos
        animals[4] = new Wolf();
        animals[5] = new Dog();
 
        // Invocación de los métodos de la superclase Animal
        for (Animal animal : animals) {
            animal.makeNoise();
            animal.eat();
            animal.sleep();
            animal.roam();

            // Impresión para separar las invocaciones
            System.out.println("");
        }
        
        // Instanciando dos objetos que implementan la clase Pet
        Cat p1 = new Cat();
        Dog p2 = new Dog();
        
        p1.play();
        p1.beFriendly();
        System.out.println("");
        
        p2.play();
        p2.beFriendly();
        System.out.println("");
    }
}