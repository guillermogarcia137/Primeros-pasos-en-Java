package Tablas.EjsAulavirtual;
import java.util.*;
public class sumaConsecutivos {

     public static void main(String[] args) {
        ejercicioSuma();
    }

    public static void ejercicioSuma() {
        int numeros[] = {10, 1, 5, 8, 9, 2};
        int numElementos = 3;

        System.out.println("Tabla: " + Arrays.toString(numeros));
        System.out.println("Elementos por grupo: " + numElementos);
        System.out.println("Sumas: " + Arrays.toString(suma(numeros, numElementos)));
    }

    public static int[] suma(int t[], int numElementos) {
        int resultado[] = new int[0];

        if (numElementos > 0 && numElementos <= t.length) {
            resultado = new int[t.length - numElementos + 1];

            for (int i = 0; i < resultado.length; i++) {
                int total = 0;
                for (int j = i; j < i + numElementos; j++) {
                    total = total + t[j];
                }
                resultado[i] = total;
            }
        }
        return resultado;
    }
}
