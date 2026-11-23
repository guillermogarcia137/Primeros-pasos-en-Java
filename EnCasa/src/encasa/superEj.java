package encasa;
import java.util.*;
public class superEj {
    public static void main(String[] args) {
        ejecutarMenu();
    }

    public static void ejecutarMenu() {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        // ************************************************************
        // Menu 
        // ************************************************************
        
        int opcion;
        
        mostrarMenu();
        opcion = sc.nextInt();
        
        //Creamos un par de tablas
        int[] tabla1 = {10, 20, 30, 40, 50};
        int[] tabla2 = {4, 2, 1, 7, 7, 9, 23};
        int tabla3[];
        tabla3 = new int[0];

        switch (opcion){
            case 1 -> {
                // ejercicio con Boolean, boolean siempre devuelve o true o false
                System.out.println("Vamos a ver si podemos salir o nos quedamos en casa");
                boolean llueve, tareas, irBiblio, salir;
                boolean opcionSalida1, opcionSalida2;
                System.out.println("Llueve ? (true/false)");
                llueve = sc.nextBoolean();
                System.out.println("Has terminado las tareas ? (true/false)");
                tareas = sc.nextBoolean();
                System.out.println("Tienes que ir a por un libro ? (true/false)");
                irBiblio = sc.nextBoolean();
                //evaluamos la opciones
                
                opcionSalida1 = !llueve && tareas;    // si no llueve(false) y hemos terminado las tareas(true) 
                opcionSalida2 = irBiblio;
                salir = opcionSalida1 || opcionSalida2;
                // todo esto se puede ampliar
                System.out.println("Puedo salir ? " + salir);
            }
            //----------------------------------------------------------------
            case 2 -> {
                System.out.println("Dime el numero del mes: ");
                int dias;
                int mes = sc.nextInt();
                dias = switch (mes){
                    case 1,3,5,7,8,10,12 ->{
                        yield 31;
                    }
                    case 4,6,9,11 -> {
                        yield 30;
                    }
                    case 2-> {
                        yield 28;
                    }
                    default -> {
                        System.out.println("ERROR");
                        yield -1;
                    }            
                };
                System.out.println("El mes tiene "+dias);
            }
            //----------------------------------------------------------------
            case 3 -> {
                System.out.println("Vamos a calcular el numero mas alto, el mas bajo y la media de estos con while e if");
                double numero = 0, max = 0, min = 999, media = 0,contador =0,suma = 0;
                System.out.println("Dime un numero (finalizar con -01) ");
                numero = sc.nextDouble();
                while ( numero != -01 ) {
                    if (numero > max ) max = numero;
                    if (numero < min ) min = numero;
                    suma += numero;
                    contador++;
                    System.out.println("Siguiente numero: ");
                    numero = sc.nextDouble();
                    media = suma/contador;

                }
                System.out.println("El numero max es "+ max + " el min es " 
                        + min + " y la media es " + media);
            }
            //----------------------------------------------------------------
            case 4 -> {
                System.out.println("Vamos a hacer la secuencia");
                System.out.println("Numero inicial: ");
                int inicial = sc.nextInt();

                System.out.println("Numero final: ");
                int fin = sc.nextInt();

                System.out.println("Intervalo de salto: ");
                int salto = sc.nextInt();

                // Chequeo de valores negativos
                if (inicial < 0 || fin < 0 || salto < 0) {
                    System.out.println("Error: no se permiten numeros negativos.");
                } else if (salto == 0) {
                    System.out.println("Error: el intervalo de salto no puede ser 0.");
                } else if (inicial > fin) {
                    System.out.println("Error: el numero inicial debe ser menor o igual que el final.");
                } else {
                    System.out.println("Secuencia:");
                    for (int i = inicial; i <= fin; i += salto) {
                        System.out.print(i + " ");
                    }
                    System.out.println();
                }
            }
           //----------------------------------------------------------------

            case 5 -> {
                System.out.println("Vamos a hacer operaciones ");
                String operacion;
                double resultado = 0, num1, num2;
                System.out.println("Que operacion quieres hacer ? sumar, restar, multiplicar");
                operacion = sc.next();
                System.out.println("Dime el primer numero: ");
                num1 = sc.nextDouble();
                System.out.println("Dime el segundo numero");
                num2 = sc.nextDouble();
                switch (operacion) {
                    case "sumar" -> resultado = num1+num2;

                    case "restar" -> resultado = num1-num2;

                    case "multiplicar" -> resultado = num1*num2;

                    default -> System.out.println("ERROR");
                }
                System.out.println("El resultado de " + operacion + " " + num1 
                                   + " y " + num2 + " es " + resultado );
                
            }
        //----------------------------------------------------------------    
            case 6 -> {
                System.out.println("Dime un numero entre 0 y 9999");
                int numero = sc.nextInt();
                int dig1 = numero / 1000;
                int dig2 = (numero / 100) % 10;
                int dig3 = (numero / 10) % 10;
                int dig4 = numero % 10;

                if (numero < 0 || numero > 9999) {
                    System.out.println("El numero esta fuera del rango");
                } else if (numero < 100) {
                    if (dig2 == dig1) {
                        System.out.println("Es capicúa");
                    } else {
                        System.out.println("No es capicúa");
                    }
                } else if (numero < 1000) {
                    if (dig3 == dig1) {
                        System.out.println("Es capicúa");
                    } else {
                        System.out.println("No es capicúa");
                    }
                } else {
                    if (dig4 == dig1 && dig3 == dig2) {
                        System.out.println("Es capicúa");
                    } else {
                        System.out.println("No es capicúa");
                        }

                }
            }//cierre case 6 
            case 7 -> {
                String numero = "856";
                // Guardamos cada dígito en una variable char
                char dig1 = numero.charAt(0); // '8'
                char dig2 = numero.charAt(1); // '5'
                char dig3 = numero.charAt(2); // '6'

                System.out.println("Longitud: " + numero.length()); // 3
                System.out.println("Dígito 1: " + dig1);
                System.out.println("Dígito 2: " + dig2);
                System.out.println("Dígito 3: " + dig3);

                // Lo mismo, pero con un bucle
                for (int i = 0; i < numero.length(); i++) {
                    System.out.println("Posición " + i + ": " + numero.charAt(i));
                }
            }
            case 8 -> {
                System.out.println("De cuanto quieres que sea la piramide ?");
                int numero = sc.nextInt();

                for (int i = 1; i <= numero; i++) {
                    // Espacios para centrar
                    for (int j = 1; j <= numero - i; j++) {
                        System.out.print(" ");
                    }
                    // Asteriscos separados por espacio
                    for (int k = 1; k <= i; k++) {
                        System.out.print("* ");
                    }
                    System.out.println("");
                }

            }
            case 9 -> {
                int numero, convertir, binario= 0, decimal = 0, digito, posicion = 0, resto;
                System.out.println("Que quieres convertir a (1)Decimal>Binario o (2)Binario>Decilmal (Pulsa 1 o 2)");
                convertir = sc.nextInt();

                if (convertir == 1) {
                    System.out.println("Dime el numero decimal que quieres convertir");
                    decimal = sc.nextInt();
                    while(decimal > 0){
                        resto = decimal % 2;
                        decimal = decimal / 2;
                        System.out.println(resto);
                    }
                } else if (convertir == 2) {
                    System.out.println("Dime el numero binario que quieres convertir");
                    numero = sc.nextInt();
                    while (numero > 0) {
                        digito = numero % 10;
                        decimal = decimal + digito * (int) Math.pow(2, posicion);
                        numero = numero / 10;
                        posicion++;
                    }
                    System.out.println("El numero en decimal es: " + decimal);
                } else {
                    System.out.println("ERROR, introduce 1 o 2");
                }
            }
            case 10 ->{
                /*
                double numero, cuadrado, resto, raiz;
                int contador = 0;
                System.out.println("Dime un numero entero ");
                numero = sc.nextDouble();
                raiz = Math.sqrt(numero);
                if (raiz*raiz == numero)
                    System.out.println("La raiz cuadrada es " + raiz);
                else{
                    do{
                        contador++;
                        cuadrado = contador*contador;
                    }while(numero >= cuadrado);
                    resto = cuadrado - numero;
                    System.out.println("La raiz cuadrada es " + raiz + " y el resto " + resto);
                }
                */
        
                int numero, contador = 0, cuadrado, resto, raiz;

                System.out.println("Dime un numero");
                numero = sc.nextInt();
                do {
                    contador++;
                    cuadrado = contador * contador;
                } while (cuadrado <= numero);
                raiz = contador - 1;
                resto = numero - raiz * raiz;

                System.out.println("La raiz cuadrada es " + raiz + " y el resto " + resto);
                    
            }
            case 11-> {
                int hora, minutos, segundos, incremento;
                System.out.println("Dime la hora  ");
                hora = sc.nextInt();
                if (hora>23){
                    System.out.println("Formato de hora incorrecto");
                    sc.close();
                }else{
                    System.out.println("Dime los minutos  ");
                    minutos = sc.nextInt();
                    if (minutos >59){
                        System.out.println("Formato de hora incorrecto");
                        sc.close();
                    }else{
                        System.out.println("Dime los segundos  ");
                        segundos = sc.nextInt();
                        if (segundos >59){
                        System.out.println("Formato de hora incorrecto");
                        }else{
                            System.out.println("Cuanto quieres sumarle ? ");
                            incremento = sc.nextInt();

                                for (int i = 0; i < incremento; i++) {
                                    segundos++;
                                    if (segundos > 59){
                                        segundos = 0;
                                        minutos ++;
                                    }
                                    if (segundos >59){ 
                                        segundos = segundos - 60;
                                        minutos ++;
                                    }
                                    if (minutos > 59){
                                        minutos = 0;
                                        hora++;
                                    }
                                    if (hora >23 ){
                                        hora =0;
                                    }
                                }
                                System.out.printf("La hora final es: %02d:%02d:%02d%n", hora, minutos, segundos);
                            }
                    }
        
                }
        
            }//cierra case 11
            case 12 -> {
                int codigo, numero;
                char letra;
                System.out.println("Dime tu DNI: ");
                numero = sc.nextInt();
                codigo = numero%23;
                letra = switch (codigo) { //solucion con switch
                    case 0 -> 'T';
                    case 1 -> 'R';
                    case 2 -> 'W';
                    case 3 -> 'A';
                    case 4 -> 'G';
                    case 5 -> 'M';
                    case 6 -> 'Y';
                    case 7 -> 'F';
                    case 8 -> 'P';
                    case 9 -> 'D';
                    case 10 -> 'X';
                    case 11 -> 'B';
                    case 12 -> 'N';
                    case 13 -> 'J';
                    case 14 -> 'Z';
                    case 15 -> 'S';
                    case 16 -> 'Q';
                    case 17 -> 'V';
                    case 18 -> 'H';
                    case 19 -> 'L';
                    case 20 -> 'C';
                    case 21 -> 'K';
                    case 22 -> 'E';
                        default -> ' ';
                };   //importante poner punto y coma para que funcione 
                System.out.println("Codigo: " + codigo);
                System.out.println("Letra: " + letra); 
                    }
            case 13 -> {
                int[] nombreTabla = crearTabla(sc);
                mostrarTabla(nombreTabla);
            }
            case 14 -> {
                
                System.out.println("Longitud tabla 1: " + longitudTabla(tabla1));
                System.out.println("Longitud tabla 2: " + longitudTabla(tabla2));
            }
            case 15 -> {
                mostrarTabla(tabla2);
            }
            case 16 -> {
                mostrarTablasDeDisintosModos(tabla1);
            } 
            case 17 -> {
                rellenarTabla(tabla1, sc);
            } 
            case 18 -> { ordenarTabla(tabla2); mostrarTabla(tabla2); }
            case 19 -> { desordenarTabla(tabla1); mostrarTabla(tabla1); }
            case 20 -> {
                System.out.print("Número que buscas en la tabla ordenada: ");
                mostrarTabla(tabla1);
                System.out.println("Posición: " + buscarOrdenada(tabla1, sc.nextInt()));
            }
            case 21 -> {
                mostrarTabla(tabla2);
                System.out.print("Número que buscas: ");
                System.out.println("Posición: " + buscarDesordenada(tabla2, sc.nextInt()));
            }
            case 22 -> {
                System.out.print("Número que buscas: ");
                int posicion = ordenarYBuscar(tabla2, sc.nextInt());
                mostrarTabla(tabla2);
                System.out.println("Posición en la tabla ya ordenada: " + posicion);
            }
            case 23 -> { tabla3 = copiarTabla(tabla2); mostrarTabla(tabla3); }
            case 24 -> {
                mostrarTabla(tabla2);
                System.out.print("Desde qué índice: ");
                int desde = sc.nextInt();
                System.out.print("Hasta qué índice (sin incluirlo): ");
                int hasta = sc.nextInt();
                if (desde >= 0 && desde <= hasta && hasta <= tabla2.length) {
                    mostrarTabla(copiarRango(tabla2, desde, hasta));
                } else { System.out.println("Rango incorrecto."); }
            }
            case 25 -> {
                tabla3 = new int[tabla1.length];
                copiarElementos(tabla1, tabla3, 1, 0, 3);
                System.out.println("Copiamos tres valores desde la posición 1 de tabla1 a la 0 de tabla3.");
                mostrarTabla(tabla1); mostrarTabla(tabla3);
            }
            case 26 -> {
                System.out.print("Número que quieres añadir: ");
                tabla2 = insertarNoOrdenada(tabla2, sc.nextInt()); mostrarTabla(tabla2);
            }
            case 27 -> {
                System.out.print("Número que quieres insertar en orden: ");
                tabla1 = insertarOrdenada(tabla1, sc.nextInt()); mostrarTabla(tabla1);
            }
            case 28 -> {
                System.out.print("Número que quieres insertar sin repetir: ");
                tabla1 = insertarOrdenadaSinRepetidos(tabla1, sc.nextInt()); mostrarTabla(tabla1);
            }
            case 29 -> {
                System.out.print("Número que quieres añadir sin repetir: ");
                tabla2 = insertarNoOrdenadaSinRepetidos(tabla2, sc.nextInt()); mostrarTabla(tabla2);
            }
            case 30 -> {
                mostrarTabla(tabla2); System.out.print("Número que quieres eliminar: ");
                tabla2 = eliminarNoOrdenada(tabla2, sc.nextInt()); mostrarTabla(tabla2);
            }
            case 31 -> {
                mostrarTabla(tabla1); System.out.print("Número que quieres eliminar: ");
                tabla1 = eliminarOrdenada(tabla1, sc.nextInt()); mostrarTabla(tabla1);
            }
            case 32 -> { tabla2 = eliminarTabla(tabla2); mostrarTabla(tabla2); }
            case 33 -> {
                mostrarTabla(tabla1); mostrarTabla(tabla2);
                System.out.println("Mismos valores en el mismo orden: " + compararTablas(tabla1, tabla2));
            }
            case 34 -> {
                mostrarTabla(tabla2);
                System.out.println("Suma: " + suma(tabla2));
                System.out.println("Máximo: " + maximo(tabla2));
                System.out.println("Mínimo: " + minimo(tabla2));
                System.out.println("Media: " + media(tabla2));
            }
            case 35 -> {
                mostrarTabla(tabla2); System.out.print("Clave que quieres buscar: ");
                mostrarTabla(buscarTodos(tabla2, sc.nextInt()));
            }
            case 36 -> {
                mostrarTabla(tabla2); System.out.print("Elementos de cada grupo: ");
                mostrarTabla(suma(tabla2, sc.nextInt()));
            }
            case 37 -> { mostrarTabla(tabla1); mostrarTabla(invertir(tabla1)); }
            case 38 -> { mostrarTabla(tabla2); mostrarTabla(sinRepetidos(tabla2)); }
            case 39 -> {
                tabla3 = desordenarCopia(tabla1);
                System.out.println("Original: "); mostrarTabla(tabla1);
                System.out.println("Copia desordenada: "); mostrarTabla(tabla3);
            }
            case 40 -> menuCadenas(sc);
            case 41 -> chuletaTablas();
            case 0 -> System.out.println("Fin de los apuntes.");

            default -> System.out.println("ERROR, introduce un numero dentro del rango");
                 // notas 
                /*
                //cast: lo de hacer un double int
                   // ejemplo char
                String palabra = "Hola";

                char a = palabra.charAt(0);  // 'H'
                char b = palabra.charAt(1);  // 'o'
                char c = palabra.charAt(3);  // 'a'

                String texto = "Java";   **Recorrer un String letra por letra:**
                for (int i = 0; i < texto.length(); i++) {
                System.out.println(texto.charAt(i));
                }
                */
        }//cierra switch
        
        //Aqui sigue el resto del codigo
        //Vamos a crear un par de tablas para poder probar las funciones
        


    }//cierre main
    // ************************************************************
    // Funciones
    // ************************************************************
    // A parti de ahora(tema tablas 21/11/2026, finde antes del examen de funciones, tablas y cadenas de caracteres) 
    // vamos a empezar a usar las funciones para mas comodidad
    
    // ------------------------------------------------------------
    // Funciones de tablas
    // ------------------------------------------------------------

    // ************************************************************
    // Crear una tabla
    // ************************************************************
    static int[] crearTabla(Scanner sc) {
        sc.nextLine(); // Consumimos el salto pendiente de nextInt().

        System.out.print("Nombre de la tabla: ");
        String nombre = sc.nextLine();

        System.out.print("Longitud de la tabla: ");
        int longitud = sc.nextInt();
        while (longitud < 0) {
            System.out.print("La longitud debe ser 0 o mayor: ");
            longitud = sc.nextInt();
        }

        int[] tabla = new int[longitud];

        System.out.print("¿Quieres introducir valores? (s/n): ");
        char respuesta = sc.next().charAt(0);

        if (respuesta == 's') {
            for (int i = 0; i < tabla.length; i++) {
                System.out.print(nombre + "[" + i + "]: ");
                tabla[i] = sc.nextInt();
            }
        }

        return tabla;
    }
    
    
    // ************************************************************
    // Conocer la longitud de una tabla
    // ************************************************************
    static int longitudTabla(int[] tabla) {
        return tabla.length;
    }
    // ************************************************************
    // Mostrar una tabla
    // ************************************************************
    static void mostrarTabla(int[] tabla) {
        System.out.println(Arrays.toString(tabla));
    }
    // ************************************************************
    // Mostrar una tabla de distintos modos
    // ************************************************************
    static void mostrarTablasDeDisintosModos(int[] tabla) {
        System.out.println("Primera");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println(tabla[i]);
        }
        System.out.println("Segunda");
        System.out.println(Arrays.toString(tabla));
        System.out.println("Tercera");
        for (int i = 0; i < tabla.length; i++) {
            System.out.print(tabla[i]+ " ");
        }
        
    }

    // ************************************************************
    // Rellenar todo un Array
    // ************************************************************
    static int[] rellenarTabla(int[] tabla, Scanner sc) {
        System.out.println("De que numero quieres rellenar ? ");
        int valor = sc.nextInt();
        Arrays.fill(tabla, valor);
        mostrarTabla(tabla);
        return tabla;
    }
    // ************************************************************
    // Ordenar una tabla
    // ************************************************************
    static void ordenarTabla(int[] tabla) {
        Arrays.sort(tabla);
    }
    // ************************************************************
    // Desordenar una tabla
    // ************************************************************
    static void desordenarTabla(int[] tabla) {
        Random random = new Random();

        for (int i = tabla.length - 1; i > 0; i--) {
            int j = random.nextInt(i + 1);

            int aux = tabla[i];
            tabla[i] = tabla[j];
            tabla[j] = aux;
        }
    }
    // ************************************************************
    // Buscar en una tabla ordenada
    // ************************************************************
    static int buscarOrdenada(int[] tabla, int numero) {
        return Arrays.binarySearch(tabla, numero);
    }
    // ************************************************************
    // Buscar en una tabla desordenada
    // ************************************************************
    static int buscarDesordenada(int[] tabla, int numero) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == numero) {
                return i;
            }
        }
        return -1;
    }
    // ************************************************************
    // Ordenar una tabla y buscar
    // ************************************************************
    static int ordenarYBuscar(int[] tabla, int numero) {
        Arrays.sort(tabla);
        return Arrays.binarySearch(tabla, numero);
    }
    // ************************************************************
    // Copiar una tabla
    // ************************************************************
    static int[] copiarTabla(int[] tabla) {
        return Arrays.copyOf(tabla, tabla.length);
    }
    // ************************************************************
    // Copiar un rango de elementos
    // ************************************************************
    static int[] copiarRango(int[] tabla, int desde, int hasta) {
        return Arrays.copyOfRange(tabla, desde, hasta);
    }
    // ************************************************************
    // Copiar elementos consecutivos entre dos tablas 
    // ************************************************************
    static void copiarElementos(int[] origen, int[] destino, int posOrigen, int posDestino, int cantidad) {
        System.arraycopy(origen, posOrigen, destino, posDestino, cantidad);
    }
    
    // ************************************************************
    // Añadir un elemento en una tabla desordenada
    // ************************************************************
    static int[] insertarNoOrdenada(int[] tabla, int numero) { //permite repetidos
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = numero;
        return tabla;
    }
    // ************************************************************
    // Añadir un elemento en una tabla ordenada
    // ************************************************************
    static int[] insertarOrdenada(int[] tabla, int numero) { //permite repetidos
        int posicion = Arrays.binarySearch(tabla, numero);

        if (posicion < 0) {
            posicion = -posicion - 1;
        }

        int[] copia = new int[tabla.length + 1];

        System.arraycopy(tabla, 0, copia, 0, posicion);
        System.arraycopy(tabla, posicion, copia, posicion + 1, tabla.length - posicion);

        copia[posicion] = numero;
        return copia;
    }
    // ************************************************************
    // Inserción ordenada (sin repetidos)
    // ************************************************************
    static int[] insertarOrdenadaSinRepetidos(int[] tabla, int numero) {
        int posicion = Arrays.binarySearch(tabla, numero);

        if (posicion >= 0) {
            return tabla; // Ya existe, no lo insertamos
        }

        posicion = -posicion - 1;

        int[] copia = new int[tabla.length + 1];

        System.arraycopy(tabla, 0, copia, 0, posicion);
        System.arraycopy(tabla, posicion, copia, posicion + 1, tabla.length - posicion);

        copia[posicion] = numero;
        return copia;
    }
    // ************************************************************
    // Inserción no ordenada (sin repetidos)
    // ************************************************************
    static int[] insertarNoOrdenadaSinRepetidos(int[] tabla, int numero) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == numero) {
                return tabla; // Ya existe
            }
        }

        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = numero;

        return tabla;
    }
    // ************************************************************
    // Eliminar de una tabla desordenada
    // ************************************************************
    static int[] eliminarNoOrdenada(int[] tabla, int numero) {
        for (int i = 0; i < tabla.length; i++) {
            if (tabla[i] == numero) {
                tabla[i] = tabla[tabla.length - 1];
                return Arrays.copyOf(tabla, tabla.length - 1);
            }
        }
        return tabla;
    }
    // ************************************************************
    // Eliminar de una tabla ordenada
    // ************************************************************
    static int[] eliminarOrdenada(int[] tabla, int numero) {
        int posicion = Arrays.binarySearch(tabla, numero);

        if (posicion >= 0) {
            System.arraycopy(tabla, posicion + 1, tabla, posicion, tabla.length - posicion - 1);
            tabla = Arrays.copyOf(tabla, tabla.length - 1);
        }

        return tabla;
    }
    // ************************************************************
    // Eliminar toda una tabla
    // ************************************************************
    static int[] eliminarTabla(int[] tabla) {
        return Arrays.copyOf(tabla, 0);
    }
    // ************************************************************
    // Comparar dos tablas 
    // ************************************************************
    static boolean compararTablas(int[] tabla1, int[] tabla2) {
        return Arrays.equals(tabla1, tabla2);
    }

    //----------------------------------------------------------------------
    
    
    //----------------------------------------------------------------------
    
    





    public static void mostrarMenu() {
        System.out.println("APUNTES DE JAVA: elige una opción (datos de ejemplo en tablas).");
        System.out.println("1) Boolean: decidir si podemos salir");
        System.out.println("2) Días de un mes con switch");
        System.out.println("3) Máximo, mínimo y media con while");
        System.out.println("4) Secuencia con un salto");
        System.out.println("5) Calculadora");
        System.out.println("6) Número capicúa");
        System.out.println("7) Ejemplo charAt (tema 6)");
        System.out.println("8) Pirámide");
        System.out.println("9) Conversión decimal y binario");
        System.out.println("10) Raíz cuadrada entera");
        System.out.println("11) Reloj");
        System.out.println("12) Letra del DNI");
        System.out.println("13) Crear y mostrar una tabla");
        System.out.println("14) Longitud de una tabla");
        System.out.println("15) Mostrar una tabla");
        System.out.println("16) Distintas formas de recorrer tablas");
        System.out.println("17) Rellenar una tabla");
        System.out.println("18) Ordenar una tabla");
        System.out.println("19) Desordenar una tabla");
        System.out.println("20) Buscar en tabla ordenada");
        System.out.println("21) Buscar en tabla desordenada");
        System.out.println("22) Ordenar y buscar");
        System.out.println("23) Copiar una tabla");
        System.out.println("24) Copiar un rango");
        System.out.println("25) Copiar elementos entre tablas");
        System.out.println("26) Añadir al final");
        System.out.println("27) Insertar en orden");
        System.out.println("28) Insertar en orden sin repetidos");
        System.out.println("29) Añadir al final sin repetidos");
        System.out.println("30) Eliminar en tabla desordenada");
        System.out.println("31) Eliminar en tabla ordenada");
        System.out.println("32) Vaciar una tabla");
        System.out.println("33) Comparar tablas");
        System.out.println("34) Suma, máximo, mínimo y media");
        System.out.println("35) Buscar todos los índices");
        System.out.println("36) Sumar grupos consecutivos");
        System.out.println("37) Invertir tabla");
        System.out.println("38) Quitar repetidos");
        System.out.println("39) Desordenar una copia");
        System.out.println("40) CADENAS: funciones y chuleta del tema 6");
        System.out.println("41) CHULETA de tablas del tema 5");
        System.out.println("0) Salir");
    }

    // TEMA 5: funciones con tablas de números.
    public static int suma(int t[]) {
        int suma = 0;
        for (int i = 0; i < t.length; i++) {
            suma = suma + t[i];
        }
        return suma;
    }

    public static double media(int t[]) {
        // Convertimos a double para no perder los decimales de la división.
        double media = (double) suma(t) / t.length;
        return media;
    }

    public static int maximo(int t[]) {
        int maximo = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] > maximo) {
                maximo = t[i];
            }
        }
        return maximo;
    }

    public static int minimo(int t[]) {
        int minimo = t[0];
        for (int i = 1; i < t.length; i++) {
            if (t[i] < minimo) {
                minimo = t[i];
            }
        }
        return minimo;
    }

    public static int[] buscarTodos(int t[], int clave) {
        int posiciones[] = new int[0];
        for (int i = 0; i < t.length; i++) {
            if (t[i] == clave) {
                posiciones = insertarElementoEnTabla(posiciones, i);
            }
        }
        return posiciones;
    }

    public static int[] invertir(int t[]) {
        int invertida[] = new int[t.length];
        for (int i = 0; i < t.length; i++) {
            invertida[i] = t[t.length - 1 - i];
        }
        return invertida;
    }

    public static int[] insertarElementoEnTabla(int t[], int elem) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = elem;
        return t;
    }

    public static int[] sinRepetidos(int t[]) {
        int resultado[] = new int[0];
        for (int i = 0; i < t.length; i++) {
            if (buscarDesordenada(resultado, t[i]) == -1) {
                resultado = insertarNoOrdenada(resultado, t[i]);
            }
        }
        return resultado;
    }

    public static double[] insertarElementoEnTabla(double t[], double elem) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = elem;
        return t;
    }

    public static String[] insertarElementoEnTabla(String t[], String elem) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = elem;
        return t;
    }

    public static boolean[] insertarElementoEnTabla(boolean t[], boolean elem) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = elem;
        return t;
    }

    // Suma de grupos consecutivos. Si no caben grupos, devuelve una tabla vacía.
    public static int[] suma(int t[], int numElementos) {
        int resultado[] = new int[0];
        if (numElementos > 0 && numElementos <= t.length) {
            resultado = new int[t.length - numElementos + 1];
            for (int i = 0; i < resultado.length; i++) {
                for (int j = i; j < i + numElementos; j++) {
                    resultado[i] = resultado[i] + t[j];
                }
            }
        }
        return resultado;
    }

    public static int[] desordenarCopia(int t[]) {
        int copia[] = copiarTabla(t);
        desordenarTabla(copia);
        return copia;
    }

    public static void chuletaTablas() {
        System.out.println("TEMA 5: TABLAS");
        System.out.println("int t[] = {4, 7, 4}; // índices 0, 1 y 2");
        System.out.println("t.length: longitud. t[i]: valor. i: posición.");
        System.out.println("Arrays.toString(t): muestra los valores.");
        System.out.println("Arrays.sort(t): ordena y modifica t.");
        System.out.println("Arrays.binarySearch(t, clave): necesita t ordenada.");
        System.out.println("En binarySearch un resultado negativo significa que no está.");
        System.out.println("Arrays.copyOf(t, longitud): crea una copia con esa longitud.");
        System.out.println("Arrays.copyOfRange(t, desde, hasta): hasta no se incluye.");
        System.out.println("Arrays.fill(t, valor): rellena toda la tabla.");
        System.out.println("Arrays.equals(a, b): compara valores y orden.");
        System.out.println("t = insertarNoOrdenada(t, 9); // guarda la tabla devuelta");
        System.out.println("int copia[] = t; comparte la tabla; no copia los elementos.");
        System.out.println("Máximo, mínimo y media: necesitan una tabla con elementos.");
    }

    // Un Scanner compartido. nextLine recoge una frase completa, incluidos espacios.
    public static String leerTexto(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static void menuCadenas(Scanner sc) {
        int opcion;
        do {
            mostrarMenuCadenas();
            opcion = sc.nextInt();
            sc.nextLine(); // Retiramos el salto que deja nextInt antes de leer frases.
            String frase;
            switch (opcion) {
                case 1 -> mostrarCaracteres(leerTexto(sc, "Frase: "));
                case 2 -> System.out.println(contarVocales(leerTexto(sc, "Frase: ")));
                case 3 -> {
                    frase = leerTexto(sc, "Frase: ");
                    String letra = leerTexto(sc, "Letra: ");
                    if (letra.length() == 1) {
                        System.out.println(contarLetra(frase, letra.charAt(0)));
                    } else { System.out.println("Introduce una sola letra."); }
                }
                case 4 -> {
                    frase = leerTexto(sc, "Frase: ");
                    System.out.println(contarPalabra(frase, leerTexto(sc, "Fragmento que cuentas: ")));
                }
                case 5 -> {
                    frase = leerTexto(sc, "Frase: ");
                    System.out.println("Posición (-1 si no está): " + buscar(frase, leerTexto(sc, "Texto que buscas: ")));
                }
                case 6 -> System.out.println(alReves(leerTexto(sc, "Frase: ")));
                case 7 -> System.out.println(sinEspacios(leerTexto(sc, "Frase: ")));
                case 8 -> System.out.println(sinVocales(leerTexto(sc, "Frase: ")));
                case 9 -> {
                    frase = leerTexto(sc, "Primer texto: ");
                    System.out.println(unir(frase, leerTexto(sc, "Segundo texto: ")));
                }
                case 10 -> {
                    frase = leerTexto(sc, "Frase: ");
                    String nuevo = leerTexto(sc, "Texto que insertas: ");
                    System.out.print("Posición: ");
                    int posicion = sc.nextInt();
                    if (posicion >= 0 && posicion <= frase.length()) {
                        System.out.println(insertar(frase, nuevo, posicion));
                    } else { System.out.println("Posición incorrecta."); }
                }
                case 11, 20 -> {
                    frase = leerTexto(sc, "Frase: ");
                    System.out.print("Desde: "); int desde = sc.nextInt();
                    System.out.print("Hasta (sin incluir): "); int hasta = sc.nextInt();
                    if (desde >= 0 && desde <= hasta && hasta <= frase.length()) {
                        if (opcion == 11) { System.out.println(eliminar(frase, desde, hasta)); }
                        else { System.out.println(frase.substring(desde, hasta)); }
                    } else { System.out.println("Rango incorrecto."); }
                }
                case 12 -> {
                    frase = leerTexto(sc, "Frase: ");
                    String antiguo = leerTexto(sc, "Texto que sustituyes: ");
                    String nuevo = leerTexto(sc, "Texto nuevo: ");
                    System.out.println(sustituir(frase, antiguo, nuevo));
                }
                case 13 -> {
                    frase = leerTexto(sc, "Primer texto: ");
                    System.out.println(iguales(frase, leerTexto(sc, "Segundo texto: ")));
                }
                case 14 -> System.out.println(esPalindroma(leerTexto(sc, "Frase sin tildes: ")));
                case 15 -> {
                    frase = leerTexto(sc, "Primera palabra: ");
                    System.out.println(sonAnagramas(frase, leerTexto(sc, "Segunda palabra: ")));
                }
                case 16 -> System.out.println(Arrays.toString(separarPalabras(leerTexto(sc, "Frase (un espacio entre palabras): "))));
                case 17 -> System.out.println(Arrays.toString(ordenarPalabras(leerTexto(sc, "Frase (un espacio entre palabras): "))));
                case 18 -> {
                    frase = leerTexto(sc, "Frase: ");
                    char letras[] = pasarATabla(frase);
                    System.out.println(Arrays.toString(letras));
                    System.out.println(pasarACadena(letras));
                }
                case 19 -> {
                    frase = leerTexto(sc, "Frase: ");
                    System.out.println(frase.toLowerCase()); System.out.println(frase.toUpperCase());
                }
                case 21 -> {
                    frase = leerTexto(sc, "Primera palabra: ").toLowerCase();
                    String otra = leerTexto(sc, "Segunda palabra: ").toLowerCase();
                    System.out.println("Negativo: antes; cero: iguales; positivo: después.");
                    System.out.println(frase.compareTo(otra));
                }
                case 22 -> System.out.println(contarPalabras(leerTexto(sc, "Frase: ")));
                case 23 -> System.out.println(iniciales(leerTexto(sc, "Nombre completo: ")));
                case 24 -> System.out.println(primeraMayuscula(leerTexto(sc, "Palabra: ")));
                case 25 -> {
                    frase = leerTexto(sc, "Frase: ");
                    String letra = leerTexto(sc, "Carácter que eliminas: ");
                    if (letra.length() == 1) {
                        System.out.println(quitarCaracter(frase, letra.charAt(0)));
                    } else { System.out.println("Introduce un solo carácter."); }
                }
                case 26 -> System.out.println(ordenarLetras(leerTexto(sc, "Palabra: ")));
                case 27 -> chuletaCadenas();
                case 28 -> System.out.println(contarEspacios(leerTexto(sc, "Frase: ")));
                case 0 -> System.out.println("Fin del submenú de cadenas.");
                default -> System.out.println("Opción incorrecta.");
            }
        } while (opcion != 0);
    }

    public static void mostrarMenuCadenas() {
        System.out.println("\nTEMA 6: CADENAS DE CARACTERES");
        System.out.println("1) Longitud y charAt: recorrer letras  2) Contar vocales");
        System.out.println("3) Contar una letra  4) Contar un fragmento  5) Buscar un fragmento");
        System.out.println("6) Invertir  7) Quitar espacios  8) Quitar vocales  9) Unir textos");
        System.out.println("10) Insertar texto  11) Borrar un rango  12) Sustituir texto");
        System.out.println("13) Comparar igualdad  14) Palíndroma  15) Anagramas");
        System.out.println("16) Separar palabras  17) Ordenar palabras  18) String y char[]");
        System.out.println("19) Mayúsculas y minúsculas  20) Extraer substring  21) compareTo");
        System.out.println("22) Contar palabras  23) Iniciales  24) Primera letra mayúscula");
        System.out.println("25) Quitar un carácter  26) Ordenar letras  27) CHULETA  28) Contar espacios  0) Salir");
        System.out.print("Opción: ");
    }

    public static void chuletaCadenas() {
        System.out.println("String frase = \"Hola mundo\";");
        System.out.println("frase.length(): 10. En String lleva (); en tablas es t.length.");
        System.out.println("frase.charAt(0): H. Último índice: frase.length() - 1.");
        System.out.println("frase.substring(0, 4): Hola. El límite final NO se incluye.");
        System.out.println("frase.indexOf(\"mundo\"): 5; si no aparece devuelve -1.");
        System.out.println("frase.equals(otra): compara contenido. No uses == para esto.");
        System.out.println("frase.equalsIgnoreCase(otra): ignora mayúsculas.");
        System.out.println("frase.compareTo(otra): negativo antes, 0 iguales, positivo después.");
        System.out.println("frase = frase.toLowerCase(); // guarda el resultado");
        System.out.println("frase = frase.toUpperCase();");
        System.out.println("frase = frase.replace(\"Hola\", \"Adiós\");");
        System.out.println("String palabras[] = frase.split(\" \"); // separador: un espacio");
        System.out.println("char letras[] = frase.toCharArray(); String copia = String.valueOf(letras);");
        System.out.println("Scanner: next() lee una palabra; nextLine() lee la línea completa.");
        System.out.println("Después de nextInt(), usa nextLine() para consumir el salto pendiente.");
        System.out.println("Las cadenas no se modifican: los métodos devuelven otra cadena.");
        System.out.println("Ordenar palabras usa el orden de String de Java; aquí trabajamos en minúsculas.");
    }

    public static void mostrarCaracteres(String frase) {
        System.out.println("Longitud: " + frase.length());
        for (int i = 0; i < frase.length(); i++) {
            System.out.println("Índice " + i + ": " + frase.charAt(i));
        }
    }

    // Cuenta el inicio de cada palabra; también admite varios espacios seguidos.
    public static int contarPalabras(String frase) {
        int cantidad = 0;
        boolean dentro = false;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                dentro = false;
            } else if (!dentro) {
                cantidad++;
                dentro = true;
            }
        }
        return cantidad;
    }

    public static String iniciales(String frase) {
        String resultado = "";
        boolean comienzo = true;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                comienzo = true;
            } else if (comienzo) {
                resultado = resultado + Character.toUpperCase(frase.charAt(i));
                comienzo = false;
            }
        }
        return resultado;
    }

    public static String primeraMayuscula(String palabra) {
        if (palabra.length() > 0) {
            palabra = Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1);
        }
        return palabra;
    }

    public static String quitarCaracter(String frase, char letra) {
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != letra) {
                resultado = resultado + frase.charAt(i);
            }
        }
        return resultado;
    }

    public static String ordenarLetras(String palabra) {
        char letras[] = palabra.toLowerCase().toCharArray();
        Arrays.sort(letras);
        return String.valueOf(letras);
    }

    // TEMA 6: funciones con cadenas; aquí también podemos usar tablas.
    // ************************************************************
    // RECORRER Y CONTAR
    // ************************************************************

    // Cuenta los espacios normales de una frase.
    // length() obtiene la longitud y charAt(i) obtiene el carácter de la posición i.
    public static int contarEspacios(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ' ') {
                contador++;
            }
        }
        return contador;
    }

    // Cuenta las veces que aparece una letra. Distingue mayúsculas y minúsculas.
    public static int contarLetra(String frase, char letra) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    // Comprueba si un carácter es vocal, incluyendo las vocales acentuadas.
    public static boolean esVocal(char letra) {
        letra = Character.toLowerCase(letra);
        boolean vocal = false;
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'
                || letra == 'á' || letra == 'é' || letra == 'í' || letra == 'ó'
                || letra == 'ú' || letra == 'ü') {
            vocal = true;
        }
        return vocal;
    }

    // Reutiliza esVocal para no escribir la misma comprobación otra vez.
    public static int contarVocales(String frase) {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++) {
            if (esVocal(frase.charAt(i))) {
                contador++;
            }
        }
        return contador;
    }

    // Busca una palabra o fragmento. Devuelve su primera posición o -1 si no está.
    public static int buscar(String frase, String palabra) {
        int posicion = frase.indexOf(palabra);
        return posicion;
    }

    // Cuenta apariciones de un fragmento sin solaparlas, como en el libro.
    // Cuenta "pan" también dentro de "pantalla". Distingue mayúsculas.
    public static int contarPalabra(String frase, String palabra) {
        int contador = 0;
        // La cadena vacía se descarta para que la búsqueda siempre pueda avanzar.
        if (palabra.length() > 0) {
            int posicion = frase.indexOf(palabra);
            while (posicion != -1) {
                contador++;
                posicion = frase.indexOf(palabra, posicion + palabra.length());
            }
        }
        return contador;
    }

    // ************************************************************
    // CREAR OTRA CADENA A PARTIR DE UNA
    // ************************************************************

    // Recorre desde el último carácter hasta el primero.
    public static String alReves(String frase) {
        String resultado = "";
        for (int i = frase.length() - 1; i >= 0; i--) {
            resultado = resultado + frase.charAt(i);
        }
        return resultado;
    }

    // Copia los caracteres que no son espacios. La frase original no cambia.
    public static String sinEspacios(String frase) {
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                resultado = resultado + frase.charAt(i);
            }
        }
        return resultado;
    }

    // Copia solamente los caracteres que no son vocales.
    public static String sinVocales(String frase) {
        String resultado = "";
        for (int i = 0; i < frase.length(); i++) {
            if (!esVocal(frase.charAt(i))) {
                resultado = resultado + frase.charAt(i);
            }
        }
        return resultado;
    }

    // Une dos textos colocando un espacio entre ellos.
    public static String unir(String primera, String segunda) {
        String resultado = primera + " " + segunda;
        return resultado;
    }

    // Inserta texto en una posición entre 0 y frase.length(), ambos incluidos.
    // substring(0, posicion) obtiene lo que hay antes de esa posición.
    public static String insertar(String frase, String texto, int posicion) {
        String principio = frase.substring(0, posicion);
        String finalFrase = frase.substring(posicion);
        return principio + texto + finalFrase;
    }

    // Borra una parte: desde se incluye, hasta NO se incluye.
    // Ejemplo: eliminar("abcdef", 1, 4) devuelve "aef".
    // Debe cumplirse: 0 <= desde <= hasta <= frase.length().
    public static String eliminar(String frase, int desde, int hasta) {
        String principio = frase.substring(0, desde);
        String finalFrase = frase.substring(hasta);
        return principio + finalFrase;
    }

    // Cambia todas las apariciones del fragmento antiguo por el nuevo.
    // Guarda el resultado: frase = sustituir(frase, "hola", "adiós");
    public static String sustituir(String frase, String antiguo, String nuevo) {
        String resultado = frase.replace(antiguo, nuevo);
        return resultado;
    }

    // ************************************************************
    // COMPARAR CADENAS
    // ************************************************************

    // Compara el contenido sin distinguir mayúsculas y minúsculas.
    // Para comparar cadenas no debemos usar ==.
    public static boolean iguales(String primera, String segunda) {
        return primera.equalsIgnoreCase(segunda);
    }

    // Una frase palíndroma se lee igual en ambos sentidos.
    // Como en el tema, quitamos espacios e ignoramos mayúsculas.
    // Escribe la frase sin tildes para esta comprobación.
    public static boolean esPalindroma(String frase) {
        frase = frase.toLowerCase();
        frase = sinEspacios(frase);
        String invertida = alReves(frase);
        return frase.equals(invertida);
    }

    // Son anagramas si tienen las mismas letras, con las mismas repeticiones.
    public static boolean sonAnagramas(String primera, String segunda) {
        primera = primera.toLowerCase();
        segunda = segunda.toLowerCase();
        char letras1[] = primera.toCharArray();
        char letras2[] = segunda.toCharArray();
        // Al ordenar las letras, los anagramas quedan exactamente iguales.
        Arrays.sort(letras1);
        Arrays.sort(letras2);
        return Arrays.equals(letras1, letras2);
    }

    // ************************************************************
    // CADENAS Y TABLAS DE CARACTERES
    // ************************************************************

    // Convierte String a char[], como se explica al final del tema.
    public static char[] pasarATabla(String frase) {
        char letras[] = frase.toCharArray();
        return letras;
    }

    // Realiza la conversión contraria: char[] a String.
    public static String pasarACadena(char letras[]) {
        String frase = String.valueOf(letras);
        return frase;
    }

    // Separa las palabras. Admite un espacio entre cada palabra y ninguno en los extremos.
    // Ejemplo: "hola mundo" pasa a {"hola", "mundo"}.
    public static String[] separarPalabras(String frase) {
        String palabras[];
        if (frase.length() == 0) {
            palabras = new String[0];
        } else {
            palabras = frase.split(" ");
        }
        return palabras;
    }

    // Separa las palabras y ordena la tabla, con el orden de String de Java.
    // Para el ejercicio, usa palabras en minúsculas y un espacio entre ellas.
    public static String[] ordenarPalabras(String frase) {
        String palabras[] = separarPalabras(frase.toLowerCase());
        Arrays.sort(palabras);
        return palabras;
    }

}
