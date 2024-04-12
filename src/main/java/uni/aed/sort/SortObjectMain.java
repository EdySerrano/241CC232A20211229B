
package uni.aed.sort;

public class SortObjectMain {
    
    interface Directorio{
    void sort();
    }
}
 


//////////////Añada un método Sort a la Interface Directorio e implemente el método en la clase DirectorioV1, Realice una demostración de su funcionamiento.
import java.util.Arrays;

public class DirectorioV1 implements Directorio {

    private Object[] datos;

    public DirectorioV1(Object[] datos) {
        this.datos = datos;
    }

    @Override
    public void sort() {
        SortObject sortObject = new SortObject();
        sortObject.iniciarDatos(datos);
        sortObject.ordenarHeapSort();

        System.out.println("Datos ordenados:");
        Arrays.stream(datos).forEach(System.out::println);
    }
}


public class Main {

    public static void main(String[] args) {
        // Ordenamiento de Objetos Persona
        Persona[] personas = new Persona[]{
                new Persona("Juan", 30),
                new Persona("Ana", 25),
                new Persona("Pedro", 40),
                new Persona("María", 22)
        };

        Directorio directorioPersona = new DirectorioV1(personas);
        directorioPersona.sort();

        // Ordenamiento de Números Enteros
        Integer[] numeros = new Integer[]{5, 2, 4, 1, 3};

        Directorio directorioNumero = new DirectorioV1(numeros);
        directorioNumero.sort();
    }
}

class Persona implements Comparable<Persona> {

    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    @Override
    public int comparacion(Persona otraPersona) {
        int comparacionNombre = this.nombre.comparar(otraPersona.getNombre());
        if (comparacionNombre != 0) {
            return comparacionNombre;
        }

        return Integer.comparar(this.edad, otraPersona.getEdad());
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre='" + nombre + edad ;

                }
    
}