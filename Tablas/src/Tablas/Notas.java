package Tablas;
import java.util.*;

public class Notas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota = 0;
        int notas[] = new int[0]; // creamos la tabla vacia
        
        System.out.println("Dime tus notas. (finalizar con -1)");
        do {
            nota = sc.nextInt();
            if (nota != -1) {
                notas = insertarElementoEnTabla(notas, nota);
            }
        } while (nota != -1);
        
        sc.close(); 
    }

    static int[] insertarElementoEnTabla(int t[], int elem) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = elem;
        System.out.println("Tras insertar el elemento en el nuevo hueco: " + Arrays.toString(t));
        return t;
    }
}
