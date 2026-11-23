package Tablas.EjsAulavirtual;
import java.util.*;
public class desordenar {

    public static void main(String[] args) {
        desordenar();
    }

    public static void desordenar() {
        int numeros[] = {1, 2, 3, 4, 5};

        System.out.println("Original: " + Arrays.toString(numeros));
        int copia[] = desordenarCopia(numeros);
        System.out.println("Copia desordenada: " + Arrays.toString(copia));
        System.out.println("Original sin modificar: " + Arrays.toString(numeros));

        desordenar(numeros);
        System.out.println("Original modificada: " + Arrays.toString(numeros));
    }

    // Primera versión: modifica la tabla que recibe.
    public static void desordenar(int t[]) {
        for (int i = t.length - 1; i > 0; i--) {
            // Elegimos una posición al azar entre 0 e i, incluidos.
            int posicion = (int) (Math.random() * (i + 1));
            intercambiar(t, i, posicion);
        }

        // Si el azar la ha dejado ordenada, cambiamos dos valores distintos.
        if (t.length > 1 && estaOrdenada(t)) {
            int posicion = 1;
            while (posicion < t.length && t[posicion] == t[0]) {
                posicion++;
            }
            if (posicion < t.length) {
                intercambiar(t, 0, posicion);
            }
        }
        // Con menos de dos valores distintos no hay un desorden visible posible.
    }

    // Segunda versión: devuelve otra tabla y conserva la original.
    public static int[] desordenarCopia(int t[]) {
        int copia[] = Arrays.copyOf(t, t.length);
        desordenar(copia);
        return copia;
    }

    public static void intercambiar(int t[], int primera, int segunda) {
        int auxiliar = t[primera];
        t[primera] = t[segunda];
        t[segunda] = auxiliar;
    }

    public static boolean estaOrdenada(int t[]) {
        boolean ordenada = true;
        for (int i = 1; i < t.length; i++) {
            if (t[i - 1] > t[i]) {
                ordenada = false;
            }
        }
        return ordenada;
    }
}