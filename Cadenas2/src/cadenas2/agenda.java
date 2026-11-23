package cadenas2;
import java.util.*;

/**
 *
 * @author Guille
 */
public class agenda {

    public static void main(String[] args) {
        agenda();
    }

    public static void agenda() {
        Scanner sc = new Scanner(System.in);
        String contactos[] = new String[0];
        String opcion;

        do {
            mostrarMenu();
            opcion = sc.nextLine().toLowerCase();

            switch (opcion) {
                case "a" -> contactos = anadirContacto(contactos, sc);
                case "b" -> consultarTelefono(contactos, sc);
                case "c" -> mostrarContactos(contactos);
                case "d" -> System.out.println("Fin de la agenda.");
                default -> System.out.println("Opción incorrecta.");
            }
        } while (!opcion.equals("d"));
    }

    public static void mostrarMenu() {
        System.out.println("a) Añadir un contacto");
        System.out.println("b) Buscar un teléfono por el nombre");
        System.out.println("c) Mostrar los contactos ordenados por nombre");
        System.out.println("d) Salir");
        System.out.print("Elige una opción: ");
    }

    public static String[] anadirContacto(String contactos[], Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Teléfono: ");
        String telefono = sc.nextLine();

        if (nombre.length() == 0 || telefono.length() == 0
                || nombre.indexOf(':') != -1 || telefono.indexOf(':') != -1) {
            System.out.println("Introduce nombre y teléfono sin usar el carácter ':'.");
        } else {
            contactos = insertarElementoEnTabla(contactos, nombre + ":" + telefono);
            System.out.println("Contacto añadido.");
        }

        return contactos;
    }

    public static String[] insertarElementoEnTabla(String t[], String elem) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = elem;
        return t;
    }

    public static String obtenerNombre(String contacto) {
        int separador = contacto.indexOf(':');
        // El nombre ocupa desde el principio hasta antes de los dos puntos.
        return contacto.substring(0, separador);
    }

    public static String buscarTelefono(String contactos[], String nombre) {
        String telefono = "";
        int i = 0;

        while (i < contactos.length && telefono.equals("")) {
            if (obtenerNombre(contactos[i]).equalsIgnoreCase(nombre)) {
                int separador = contactos[i].indexOf(':');
                telefono = contactos[i].substring(separador + 1);
            }
            i++;
        }

        return telefono;
    }

    public static void consultarTelefono(String contactos[], Scanner sc) {
        if (contactos.length == 0) {
            System.out.println("La agenda está vacía.");
        } else {
            System.out.print("Nombre que quieres buscar: ");
            String nombre = sc.nextLine();
            String telefono = buscarTelefono(contactos, nombre);

            if (telefono.equals("")) {
                System.out.println("No se ha encontrado ese contacto.");
            } else {
                System.out.println("Teléfono: " + telefono);
            }
        }
    }

    public static void ordenarContactos(String contactos[]) {
        for (int i = 0; i < contactos.length - 1; i++) {
            for (int j = i + 1; j < contactos.length; j++) {
                String primero = obtenerNombre(contactos[i]).toLowerCase();
                String segundo = obtenerNombre(contactos[j]).toLowerCase();

                // Si compareTo es positivo, primero va después de segundo.
                if (primero.compareTo(segundo) > 0) {
                    String auxiliar = contactos[i];
                    contactos[i] = contactos[j];
                    contactos[j] = auxiliar;
                }
            }
        }
    }

    public static void mostrarContactos(String contactos[]) {
        if (contactos.length == 0) {
            System.out.println("La agenda está vacía.");
        } else {
            ordenarContactos(contactos);

            for (int i = 0; i < contactos.length; i++) {
                System.out.println(contactos[i]);
            }
        }
    }
}