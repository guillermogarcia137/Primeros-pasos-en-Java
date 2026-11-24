package superej;
import java.util.*;

public class superej1232 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad, modulos;
        String nombre, ciudad, ciclo;
        boolean carnet;

        int sumaModulos = 0;
        double mediaModulos = 0;

        int dam = 0, daw = 0, asir = 0, smr = 0;

        // Crear tablas
        String[] nombres = new String[0];
        String[] ciudades = new String[0];
        String[] ciclos = new String[0];
        int[] edades = new int[0];
        int[] numeroModulos = new int[0];
        boolean[] conCarnet = new boolean[0];

        // Recogida de datos
        while (true) {

            System.out.println("Dime su nombre (fin para terminar):");
            nombre = sc.next();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            System.out.println("Dime su edad:");
            edad = sc.nextInt();

            System.out.println("Dime su ciudad:");
            ciudad = sc.next();

            System.out.println("Tiene carnet (true/false):");
            carnet = sc.nextBoolean();

            do {
                System.out.println("Ciclo (DAM, DAW, ASIR, SMR):");
                ciclo = sc.next().toUpperCase();
            } while (!ciclo.equals("DAM") && !ciclo.equals("DAW")
                    && !ciclo.equals("ASIR") && !ciclo.equals("SMR"));

            System.out.println("Cuantos modulos cursa:");
            modulos = sc.nextInt();

            // Insertar datos
            nombres = insertar(nombres, nombre);
            edades = insertar(edades, edad);
            ciudades = insertar(ciudades, ciudad);
            conCarnet = insertar(conCarnet, carnet);
            ciclos = insertar(ciclos, ciclo);
            numeroModulos = insertar(numeroModulos, modulos);

            sumaModulos += modulos;

            // Contar matriculaciones
            switch (ciclo) {
                case "DAM":
                    dam++;
                    break;
                case "DAW":
                    daw++;
                    break;
                case "ASIR":
                    asir++;
                    break;
                case "SMR":
                    smr++;
                    break;
            }
        }

        // Listar alumnos
        System.out.println("LISTADO DE ALUMNOS");

        for (int i = 0; i < nombres.length; i++) {
            mostrar(nombres[i], ciudades[i], edades[i],
                    conCarnet[i], ciclos[i], numeroModulos[i]);
        }

        // Calcular media
        if (nombres.length > 0) {
            mediaModulos = (double) sumaModulos / nombres.length;
        }

        System.out.println("Media de modulos: " + mediaModulos);

        // Alumnos por encima de la media
        System.out.println("ALUMNOS POR ENCIMA DE LA MEDIA");

        for (int i = 0; i < nombres.length; i++) {
            if (numeroModulos[i] > mediaModulos) {
                System.out.println(nombres[i]);
            }
        }

        // Mostrar matriculaciones
        System.out.println("Matriculaciones: DAM: " + dam
                + ", DAW: " + daw
                + ", ASIR: " + asir
                + ", SMR: " + smr);

        // Buscar alumnos
        System.out.println("Buscar por nombre, ciudad o ciclo:");
        String opcion = sc.next();

        String[] tabla;

        switch (opcion.toLowerCase()) {
            case "nombre":
                tabla = nombres;
                break;
            case "ciudad":
                tabla = ciudades;
                break;
            case "ciclo":
                tabla = ciclos;
                break;
            default:
                System.out.println("Opcion incorrecta");
                return;
        }

        System.out.println("Que " + opcion + " quieres buscar?");
        String dato = sc.next();

        int posicion = buscar(tabla, dato, 0);

        if (posicion == -1) {
            System.out.println("No existe ningun alumno");
        } else {
            while (posicion != -1) {

                mostrar(nombres[posicion], ciudades[posicion],
                        edades[posicion], conCarnet[posicion],
                        ciclos[posicion], numeroModulos[posicion]);

                posicion = buscar(tabla, dato, posicion + 1);
            }
        }
    }

    // FUNCIONES

    // Insertar String
    static String[] insertar(String[] t, String dato) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = dato;
        return t;
    }

    // Insertar int
    static int[] insertar(int[] t, int dato) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = dato;
        return t;
    }

    // Insertar boolean
    static boolean[] insertar(boolean[] t, boolean dato) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = dato;
        return t;
    }

    // Buscar datos
    static int buscar(String[] t, String dato, int inicio) {
        for (int i = inicio; i < t.length; i++) {
            if (t[i].equalsIgnoreCase(dato)) {
                return i;
            }
        }
        return -1;
    }

    // Mostrar alumno
    static void mostrar(String nombre, String ciudad, int edad,
            boolean carnet, String ciclo, int modulos) {

        String textoCarnet;

        if (carnet) {
            textoCarnet = "con carnet";
        } else {
            textoCarnet = "sin carnet";
        }

        System.out.println(nombre + ", de " + ciudad + ", "
                + edad + " años, " + textoCarnet
                + ", estudia " + modulos + " modulos en " + ciclo);
    }
}
