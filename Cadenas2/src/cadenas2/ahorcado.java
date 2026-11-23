package cadenas2;
import java.util.*;
/**
 *
 * @author Guille
 */
public class ahorcado {

    public static void main(String[] args) {
        ahorcado();
    }

    public static void ahorcado() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Jugador A, introduce una palabra: ");
        String palabra = sc.next().toLowerCase();
        int intentos = palabra.length() * 2;
        String oculta = crearGuiones(palabra);

        for (int i = 0; i < 3; i++) {
            System.out.println();
        }

        while (intentos > 0 && !palabra.equals(oculta)) {
            mostrarPalabra(oculta);
            System.out.println("Intentos: " + intentos);
            System.out.print("Jugador B, introduce una letra: ");
            char letra = sc.next().toLowerCase().charAt(0);

            oculta = descubrirLetra(palabra, oculta, letra);
            intentos--;
        }

        mostrarPalabra(oculta);

        if (palabra.equals(oculta)) {
            System.out.println("¡Gana el jugador B!");
        } else {
            System.out.println("¡Gana el jugador A!");
        }

        System.out.println("La palabra era: " + palabra);
    }

    public static String crearGuiones(String palabra) {
        String guiones = "";

        for (int i = 0; i < palabra.length(); i++) {
            guiones = guiones + "_";
        }

        return guiones;
    }

    public static String descubrirLetra(String palabra, String oculta, char letra) {
        String resultado = "";

        for (int i = 0; i < palabra.length(); i++) {
            if (palabra.charAt(i) == letra) {
                resultado = resultado + letra;
            } else {
                resultado = resultado + oculta.charAt(i);
            }
        }

        return resultado;
    }

    public static void mostrarPalabra(String oculta) {
        System.out.print("Palabra: ");

        for (int i = 0; i < oculta.length(); i++) {
            System.out.print(oculta.charAt(i) + " ");
        }

        System.out.println();
    }
}

