
package cadenas;
import java.io.UnsupportedEncodingException;
import java.util.*;
public class CadenasDeCaracteres {


    public static void main(String[] args) {

        String nombre;
        String textoCarnet;
        boolean carnet;

        String nombres[] = new String[0];
        boolean tieneCarnet[] = new boolean[0];

        Scanner sc = new Scanner(System.in);

        System.out.println("Dame nombres: (fin para acabar)");

        do {
            System.out.println("Nombre: ");
            nombre = sc.next();

            if (!nombre.equalsIgnoreCase("fin")) {
                nombres = insertarElementoEnTabla(nombres, nombre);

                System.out.println("Tiene carnet? true / false");
                carnet = sc.nextBoolean();

                tieneCarnet = insertarElementoEnTabla(tieneCarnet, carnet);
            }

        } while (!nombre.equalsIgnoreCase("fin"));

        for (int i = 0; i < nombres.length; i++) {

            if (tieneCarnet[i] == true) {
                textoCarnet = " tiene carnet ";
            } else {
                textoCarnet = " no tiene carnet ";
            }

            System.out.println(nombres[i] + textoCarnet);
        }
    }

    static String[] insertarElementoEnTabla(String t[], String elem) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = elem;
        return t;
    }

    static boolean[] insertarElementoEnTabla(boolean t[], boolean elem) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = elem;
        return t;
    }
}