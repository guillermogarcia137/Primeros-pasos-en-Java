package cadenas2;

import java.util.*;

/**
 *
 * @author Guille
 */
public class fraseOrdenada {
    public static void main(String[] args) {
        ordenarFrase();
    }

    public static void ordenarFrase() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = sc.nextLine();
        String palabras[] = ordenarPalabras(frase);

        System.out.println("Palabras ordenadas:");
        mostrarPalabras(palabras);
    }

    public static String[] ordenarPalabras(String frase) {
        String palabras[] = new String[0];
        if (frase.length() > 0) {
            frase = frase.toLowerCase();
            // split separa usando un espacio.
            palabras = frase.split(" ");
            Arrays.sort(palabras);
        }
        return palabras;
    }

    public static void mostrarPalabras(String palabras[]) {
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }
}
