// Interfaz que define acciones peligrosas
interface AccionesPeligrosas {
    void disparar();
    void emboscar();
}

// Clase abstracta que representa un vaquero genérico
abstract class Vaquero {
    protected String nombre;
    protected int edad;

    // Constructor
    public Vaquero(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método concreto
    public void montarCaballo() {
        System.out.println(nombre + " está montando a caballo.");
    }

    // Método concreto
    public void saludar() {
        System.out.println("Hola, soy " + nombre + " y tengo " + edad + " años.");
    }

    // Método abstracto
    public abstract void habilidadEspecial();
}

// Clase concreta que representa a un Pistolero
class Pistolero extends Vaquero implements AccionesPeligrosas {

    // Constructor
    public Pistolero(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método abstracto
    @Override
    public void habilidadEspecial() {
        System.out.println(nombre + " puede apuntar con precisión.");
    }

    // Implementación de métodos de la interfaz
    @Override
    public void disparar() {
        System.out.println(nombre + " está disparando con precisión.");
    }

    @Override
    public void emboscar() {
        System.out.println(nombre + " está preparando una emboscada.");
    }
}

// Clase concreta que representa a un Ganadero
class Ganadero extends Vaquero {

    // Constructor
    public Ganadero(String nombre, int edad) {
        super(nombre, edad);
    }

    // Implementación del método abstracto
    @Override
    public void habilidadEspecial() {
        System.out.println(nombre + " sabe arrear ganado.");
    }
}

// Clase principal para probar el programa
public class Rancho {
    public static void main(String[] args) {
        Vaquero pistolero = new Pistolero("Billy", 30);
        Vaquero ganadero = new Ganadero("Joe", 45);

        pistolero.saludar();
        pistolero.montarCaballo();
        pistolero.habilidadEspecial();
        ((Pistolero) pistolero).disparar();
        ((Pistolero) pistolero).emboscar();

        ganadero.saludar();
        ganadero.montarCaballo();
        ganadero.habilidadEspecial();
    }
}
