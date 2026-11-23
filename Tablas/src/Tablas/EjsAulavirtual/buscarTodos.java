package Tablas.EjsAulavirtual;

import java.util.Arrays;

public class buscarTodos {

    public static void main(String[] args) {
        ejercicioBuscarTodos();
    }

    public static void ejercicioBuscarTodos() {
        int numeros[] = {4, 7, 4, 2, 4};
        int clave = 4;

        System.out.println("Tabla: " + Arrays.toString(numeros));
        System.out.println("Clave: " + clave);
        System.out.println("Posiciones: " + Arrays.toString(buscarTodos(numeros, clave)));
    }

    public static int[] buscarTodos(int numeros[], int clave) {
        int posiciones[] = new int[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == clave) {
                posiciones = insertarElementoEnTabla(posiciones, i);
            }
        }
        return posiciones;
    }

    public static int[] insertarElementoEnTabla(int numeros[], int elem) {
        numeros = Arrays.copyOf(numeros, numeros.length + 1);
        numeros[numeros.length - 1] = elem;
        return numeros;
    }
}
