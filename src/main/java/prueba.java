
import java.util.Arrays;

public class prueba {
    public static void main(String[] args) {
        int[] arreglo = {5, 2, 9, 10, 5, 6};
        System.out.println("Arreglo original: " + Arrays.toString(arreglo));
        selectionSort(arreglo);
        System.out.println("Arreglo ordenado: " + Arrays.toString(arreglo));
    }
    public static void selectionSort(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n - 1; i++) {
            int indiceMinimo = i;
            for (int j = i + 1; j < n; j++) {
                if (arreglo[j] < arreglo[indiceMinimo]) {
                    indiceMinimo = j;
                }
            }
            // Intercambiar arreglo[i] y arreglo[indiceMinimo]
            int temp = arreglo[i];
            arreglo[i] = arreglo[indiceMinimo];
            arreglo[indiceMinimo] = temp;
        }
    }
}