package uni.aed.sort;
import java.util.Arrays;
import java.util.Comparator;

public class SortObject {

    private Object[] heap;

    public void iniciarDatos(Object[] datos) {
        heap = new Object[datos.length];
        for (int i = 0; i < datos.length; i++) {
            heap[i] = datos[i];
        }
    }
    private void construirHeapMax() {
        for (int i = heap.length / 2; i >= 0; i--) {
            heapificarMax(i, heap.length - 1);
        }
    }
    public void ordenarHeapSort() {
        construirHeapMax();

        for (int i = heap.length - 1; i > 0; i--) {
            intercambiar(0, i);
            heapificarMax(0, i - 1);
        }
    }

    private void heapificarMax(int inicio, int fin) {
        int padre = inicio;
        int hijo = 2 * padre + 1;

        while (hijo <= fin) {
            if (hijo + 1 <= fin && comparar(heap[hijo], heap[hijo + 1]) < 0) {
                hijo++;
            }
////
            if (hijo <= fin && comparar(heap[padre], heap[hijo]) < 0) {
                intercambiar(padre, hijo);
                padre = hijo;
                hijo = 2 * padre + 1;
            } else {
                return;
            }
        }
    }

    private void intercambiar(int i, int j) {
        Object temp = heap[i];
        heap[i] = heap[j];
        heap[j] = temp;
    }

    private int Comparacion(Object obj1, Object obj2) {
        if (obj1 == null || obj2 == null) {
            return 0;
        }

        Comparar comparar1 = (Comparar) obj1;
        Comparar comparar2 = (Comparar) obj2;

        return comparar1.comparacion(comparar2);
    }
    
    /////
    
    interface Directorio {
    void sort();
    }
    
    ////
    

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

    
    
    ////
    
    
    
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
 

