package TPIV;

import java.util.ArrayList;
import java.util.List;

public class Oso {
    // Atributos del oso
    private String nombre;
    private List<String> habilidades; // Lista de habilidades (si tiene)

    // Constructor por defecto
    public Oso() {
        this.nombre = "";
        this.habilidades = new ArrayList<>(); // Inicializamos la lista
    }

    // Constructor con parámetros
    public Oso(String nombre) {
        this.nombre = nombre;
        this.habilidades = new ArrayList<>(); // Inicializamos la lista vacía (por si el oso no tiene habilidades)
    }

    // Constructor para un oso con habilidades (Polar)
    public Oso(String nombre, List<String> habilidades) {
        this.nombre = nombre;
        this.habilidades = habilidades; // Se pasan las habilidades al crear el objeto
    }

    // Método para obtener el nombre del oso
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la lista de habilidades
    public List<String> getHabilidades() {
        return habilidades;
    }

    // Método para añadir habilidades (opcional, si quieres que se puedan agregar más habilidades luego)
    public void agregarHabilidad(String habilidad) {
        habilidades.add(habilidad);
    }

    // Método principal
    public static void main(String[] args) {
        // Crear habilidades de Polar
        List<String> habilidadesPolar = new ArrayList<>();
        habilidadesPolar.add("Ninjutsu");
        habilidadesPolar.add("Aikido");
        habilidadesPolar.add("Taekwondo");
        habilidadesPolar.add("Karate");
        habilidadesPolar.add("Espionaje");
        habilidadesPolar.add("Muay Thai");

        // Crear objetos de cada oso
        Oso pardo = new Oso("Pardo"); // Pardo no tiene habilidades
        Oso panda = new Oso("Panda"); // Panda tampoco tiene habilidades
        Oso polar = new Oso("Polar", habilidadesPolar); // Polar tiene habilidades

        // Crear una lista de osos
        List<Oso> osos = new ArrayList<>();
        osos.add(pardo);
        osos.add(panda);
        osos.add(polar);

        // Imprimir nombres de los osos
        System.out.println("Nombres de los osos:");
        for (Oso oso : osos) {
            System.out.println(oso.getNombre());
        }

        // Imprimir habilidades de Polar
        System.out.println("\nHabilidades de combate de Polar:");
        for (String habilidad : polar.getHabilidades()) {
            System.out.println(habilidad);
        }
    }
}
