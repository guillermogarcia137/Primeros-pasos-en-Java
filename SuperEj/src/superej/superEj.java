package superej;
import java.util.*;
public class superEj {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        // ************************************************************
        // Menu 
        // ************************************************************
        
        int opcion;
        
        System.out.println("Que quieres hacer ? ");
        System.out.println("Estas son las opciones: ");
        System.out.println("  1)Ver si podemos salir con Boolean ");
        System.out.println("  2)Ver los dias que tiene un  mes con switch y case");
        System.out.println("  3)Calcular el numero mas alto, el mas bajo y la media de estos con while e if");
        System.out.println("  4)Secuencia ordenada a partir de tres datos: número inicial, número final e intervalo de salto en la secuencia. Usando iF y for");
        System.out.println("  5)Operaciones usando Switch y case  ");
        System.out.println("  6)Ver si un numero es capicua");
        System.out.println("  7)Ejemplo charAt"); 
        System.out.println("  8)Imprimir piramide con for");
        System.out.println("  9)Convertir de decimal a binario y viceversa");
        System.out.println("  10) Calcula raiz cuadrada con do");
        System.out.println("  11) Reloj");
        System.out.println("  12) Letra DNI");
        System.out.println("  13) Crear una tabla ");
        System.out.println("  14) Mostrar una tabla ");
        System.out.println("  15) Conocer la longitud de una tabla ");
        System.out.println("  16) Mostrar una tabla de distintos formas ");
        System.out.println("  17) Rellenar todo una tabla ");
        System.out.println("  18) Ordenar una tabla ");
        System.out.println("  19) Desordenar una tabla ");
        System.out.println("  20) Buscar en tabla ordenada ");
        System.out.println("  21) Buscar en tabla desordenada ");
        System.out.println("  22) Ordenar y buscar ");
        System.out.println("  23) Copiar una tabla ");
        System.out.println("  24) Copiar un rango ");
        System.out.println("  25) Copiar elementos entre tablas ");
        System.out.println("  26) Añadir al final ");
        System.out.println("  27) Insertar en orden ");
        System.out.println("  28) Insertar en orden sin repetidos ");
        System.out.println("  29) Añadir sin repetidos ");
// INICIO AÑADIDO: opciones nuevas del menú
        System.out.println("  30) Eliminar en tabla desordenada ");
        System.out.println("  31) Eliminar en tabla ordenada ");
        System.out.println("  32) Vaciar tabla ");
        System.out.println("  33) Comparar tablas ");
        System.out.println("  34) Suma, máximo, mínimo y media ");
        System.out.println("  35) Buscar todos los índices ");
        System.out.println("  36) Sumar grupos consecutivos ");
        System.out.println("  37) Invertir tabla ");
        System.out.println("  38) Quitar repetidos ");
        System.out.println("  39) Desordenar copia ");
        System.out.println("  40) Longitud y recorrido con charAt ");
        System.out.println("  41) Contar vocales ");
        System.out.println("  42) Contar una letra ");
        System.out.println("  43) Contar fragmentos ");
        System.out.println("  44) Buscar un fragmento ");
        System.out.println("  45) Invertir una cadena ");
        System.out.println("  46) Quitar espacios ");
        System.out.println("  47) Quitar vocales ");
        System.out.println("  48) Unir textos ");
        System.out.println("  49) Insertar texto ");
        System.out.println("  50) Eliminar un rango de texto ");
        System.out.println("  51) Sustituir texto ");
        System.out.println("  52) Comparar igualdad ");
        System.out.println("  53) Palíndroma ");
        System.out.println("  54) Anagramas ");
        System.out.println("  55) Separar palabras ");
        System.out.println("  56) Ordenar palabras ");
        System.out.println("  57) String y char[] ");
        System.out.println("  58) Mayúsculas y minúsculas ");
        System.out.println("  59) Extraer substring ");
        System.out.println("  60) Comparación alfabética ");
        System.out.println("  61) Contar palabras ");
        System.out.println("  62) Iniciales ");
        System.out.println("  63) Primera letra mayúscula ");
        System.out.println("  64) Quitar un carácter ");
        System.out.println("  65) Ordenar letras ");
        System.out.println("  66) Contar espacios ");
        System.out.println("  67) EJERCICIO tablas: buscarTodos ");
        System.out.println("  68) EJERCICIO tablas: desordenar y copiar ");
        System.out.println("  69) EJERCICIO tablas: suma de consecutivos ");
        System.out.println("  70) EJERCICIO cadenas: ahorcado ");
        System.out.println("  71) EJERCICIO cadenas: agenda ");
        System.out.println("  72) EJERCICIO cadenas: frase ordenada ");
// FIN AÑADIDO: opciones nuevas del menú
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
                int[] nombreTabla = crearTabla();
// INICIO AÑADIDO: mostrar resultado nombreTabla int[] nombreTabla = crearTabla
                mostrarTabla(nombreTabla);
// FIN AÑADIDO: mostrar resultado nombreTabla int[] nombreTabla = crearTabla
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
                rellenarTabla(tabla1);
            } 
            case 18 -> {
                ordenarTabla(tabla1);
// INICIO AÑADIDO: mostrar resultado tabla1 ordenarTabla
                mostrarTabla(tabla1);
// FIN AÑADIDO: mostrar resultado tabla1 ordenarTabla
            }
            case 19 -> {
                desordenarTabla(tabla1);
// INICIO AÑADIDO: mostrar resultado tabla1 desordenarTabla
                mostrarTabla(tabla1);
// FIN AÑADIDO: mostrar resultado tabla1 desordenarTabla
            }     

// INICIO AÑADIDO: case nuevos
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
                case 40 -> { sc.nextLine(); mostrarCaracteres(leerTexto(sc, "Frase: ")); }
                case 41 -> { sc.nextLine(); System.out.println(contarVocales(leerTexto(sc, "Frase: "))); }
                case 42 -> {
                    sc.nextLine();
                    String frase = leerTexto(sc, "Frase: ");
                    String letra = leerTexto(sc, "Letra: ");
                    if (letra.length() == 1) {
                        System.out.println(contarLetra(frase, letra.charAt(0)));
                    } else { System.out.println("Introduce una sola letra."); }
                }
                case 43 -> {
                    sc.nextLine();
                    String frase = leerTexto(sc, "Frase: ");
                    System.out.println(contarPalabra(frase, leerTexto(sc, "Fragmento que cuentas: ")));
                }
                case 44 -> {
                    sc.nextLine();
                    String frase = leerTexto(sc, "Frase: ");
                    System.out.println("Posición (-1 si no está): " + buscar(frase, leerTexto(sc, "Texto que buscas: ")));
                }
                case 45 -> { sc.nextLine(); System.out.println(alReves(leerTexto(sc, "Frase: "))); }
                case 46 -> { sc.nextLine(); System.out.println(sinEspacios(leerTexto(sc, "Frase: "))); }
                case 47 -> { sc.nextLine(); System.out.println(sinVocales(leerTexto(sc, "Frase: "))); }
                case 48 -> {
                    sc.nextLine();
                    String frase = leerTexto(sc, "Primer texto: ");
                    System.out.println(unir(frase, leerTexto(sc, "Segundo texto: ")));
                }
                case 49 -> {
                    sc.nextLine();
                    String frase = leerTexto(sc, "Frase: ");
                    String nuevo = leerTexto(sc, "Texto que insertas: ");
                    System.out.print("Posición: ");
                    int posicion = sc.nextInt();
                    if (posicion >= 0 && posicion <= frase.length()) {
                        System.out.println(insertar(frase, nuevo, posicion));
                    } else { System.out.println("Posición incorrecta."); }
                }
                case 50, 59 -> {
                    sc.nextLine();
                    String frase = leerTexto(sc, "Frase: ");
                    System.out.print("Desde: "); int desde = sc.nextInt();
                    System.out.print("Hasta (sin incluir): "); int hasta = sc.nextInt();
                    if (desde >= 0 && desde <= hasta && hasta <= frase.length()) {
                        if (opcion == 50) { System.out.println(eliminar(frase, desde, hasta)); }
                        else { System.out.println(frase.substring(desde, hasta)); }
                    } else { System.out.println("Rango incorrecto."); }
                }
                case 51 -> {
                    sc.nextLine();
                    String frase = leerTexto(sc, "Frase: ");
                    String antiguo = leerTexto(sc, "Texto que sustituyes: ");
                    String nuevo = leerTexto(sc, "Texto nuevo: ");
                    System.out.println(sustituir(frase, antiguo, nuevo));
                }
                case 52 -> {
                    sc.nextLine();
                    String frase = leerTexto(sc, "Primer texto: ");
                    System.out.println(iguales(frase, leerTexto(sc, "Segundo texto: ")));
                }
                case 53 -> { sc.nextLine(); System.out.println(esPalindroma(leerTexto(sc, "Frase sin tildes: "))); }
                case 54 -> {
                    sc.nextLine();
                    String frase = leerTexto(sc, "Primera palabra: ");
                    System.out.println(sonAnagramas(frase, leerTexto(sc, "Segunda palabra: ")));
                }
                case 55 -> { sc.nextLine(); System.out.println(Arrays.toString(separarPalabras(leerTexto(sc, "Frase (un espacio entre palabras): ")))); }
                case 56 -> { sc.nextLine(); System.out.println(Arrays.toString(ordenarPalabras(leerTexto(sc, "Frase (un espacio entre palabras): ")))); }
                case 57 -> {
                    sc.nextLine();
                    String frase = leerTexto(sc, "Frase: ");
                    char letras[] = pasarATabla(frase);
                    System.out.println(Arrays.toString(letras));
                    System.out.println(pasarACadena(letras));
                }
                case 58 -> {
                    sc.nextLine();
                    String frase = leerTexto(sc, "Frase: ");
                    System.out.println(frase.toLowerCase()); System.out.println(frase.toUpperCase());
                }
                case 60 -> {
                    sc.nextLine();
                    String frase = leerTexto(sc, "Primera palabra: ").toLowerCase();
                    String otra = leerTexto(sc, "Segunda palabra: ").toLowerCase();
                    System.out.println("Negativo: antes; cero: iguales; positivo: después.");
                    System.out.println(frase.compareTo(otra));
                }
                case 61 -> { sc.nextLine(); System.out.println(contarPalabras(leerTexto(sc, "Frase: "))); }
                case 62 -> { sc.nextLine(); System.out.println(iniciales(leerTexto(sc, "Nombre completo: "))); }
                case 63 -> { sc.nextLine(); System.out.println(primeraMayuscula(leerTexto(sc, "Palabra: "))); }
                case 64 -> {
                    sc.nextLine();
                    String frase = leerTexto(sc, "Frase: ");
                    String letra = leerTexto(sc, "Carácter que eliminas: ");
                    if (letra.length() == 1) {
                        System.out.println(quitarCaracter(frase, letra.charAt(0)));
                    } else { System.out.println("Introduce un solo carácter."); }
                }
                case 65 -> { sc.nextLine(); System.out.println(ordenarLetras(leerTexto(sc, "Palabra: "))); }
                case 66 -> { sc.nextLine(); System.out.println(contarEspacios(leerTexto(sc, "Frase: "))); }
            case 67 -> ejercicioBuscarTodos();
            case 68 -> ejercicioDesordenar();
            case 69 -> ejercicioSuma();
            case 70 -> ahorcado(sc);
            case 71 -> { sc.nextLine(); agenda(sc); }
            case 72 -> { sc.nextLine(); ejercicioOrdenarFrase(sc); }

// FIN AÑADIDO: case nuevos
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
    static int[] crearTabla() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre de la tabla: ");
        String nombre = sc.nextLine();

        System.out.print("Longitud de la tabla: ");
        int longitud = sc.nextInt();

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
    static int[] rellenarTabla(int[] tabla) {
        System.out.println("De que numero quieres rellenar ? ");
        Scanner sc = new Scanner(System.in);
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
    
    




// INICIO AÑADIDO: funciones y ejercicios

    // ============================================================
    // FUNCIONES ADICIONALES DE TABLAS (TEMA 5)
    // ============================================================
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
    // ============================================================
    // FUNCIONES DE CADENAS DE CARACTERES (TEMA 6)
    // ============================================================
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

    public static String leerTexto(Scanner sc, String mensaje) {
        System.out.print(mensaje);
        return sc.nextLine();
    }

    public static void mostrarCaracteres(String frase) {
        System.out.println("Longitud: " + frase.length());
        for (int i = 0; i < frase.length(); i++) {
            System.out.println("Índice " + i + ": " + frase.charAt(i));
        }
    }

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

    // Inserción para las tablas de cadenas, como en tus apuntes.
    public static String[] insertarElementoEnTabla(String t[], String elem) {
        t = Arrays.copyOf(t, t.length + 1);
        t[t.length - 1] = elem;
        return t;
    }

    // ============================================================
    // EJERCICIOS DE TABLAS Y CADENAS
    // ============================================================

    public static void ejercicioBuscarTodos() {
        int t[] = {4, 7, 4, 2, 4};
        int clave = 4;
        System.out.println("Tabla: " + Arrays.toString(t));
        System.out.println("Clave: " + clave);
        System.out.println("Posiciones: " + Arrays.toString(buscarTodos(t, clave)));
    }

    public static void ejercicioDesordenar() {
        int t[] = {1, 2, 3, 4, 5};
        int copia[] = desordenarCopia(t);
        System.out.println("Copia desordenada: " + Arrays.toString(copia));
        System.out.println("Original sin modificar: " + Arrays.toString(t));
        desordenarTabla(t);
        System.out.println("Original modificada: " + Arrays.toString(t));
    }

    public static void ejercicioSuma() {
        int t[] = {10, 1, 5, 8, 9, 2};
        System.out.println("Tabla: " + Arrays.toString(t));
        System.out.println("Sumas de grupos de 3: " + Arrays.toString(suma(t, 3)));
    }

    public static void ejercicioOrdenarFrase(Scanner sc) {
        System.out.print("Frase con un espacio entre palabras: ");
        String frase = sc.nextLine();
        String palabras[] = ordenarPalabras(frase);
        System.out.println("Palabras ordenadas:");
        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }
    }

    public static void ahorcado(Scanner sc) {

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

    public static void agenda(Scanner sc) {
        String contactos[] = new String[0];
        String opcion;

        do {
            System.out.println("a) Añadir un contacto");
        System.out.println("b) Buscar un teléfono por el nombre");
        System.out.println("c) Mostrar los contactos ordenados por nombre");
        System.out.println("d) Salir");
        System.out.print("Elige una opción: ");
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

    /*
    ============================================================
    CHULETAS RÁPIDAS: consultar aquí; no tienen una opción de menú.
    ============================================================
    TABLAS (TEMA 5)
    int t[] = {4, 7, 4};       // índices 0, 1 y 2
    t.length                  // longitud; sin paréntesis
    t[i]                      // valor; i es la posición
    Arrays.toString(t)        // mostrar todos los valores
    Arrays.sort(t)            // ordena y modifica t
    Arrays.fill(t, 5)         // rellena con 5
    Arrays.binarySearch(t, 7) // necesita tabla ordenada; negativo si no está
    Arrays.copyOf(t, 5)       // otra tabla, con longitud 5
    Arrays.copyOfRange(t, 1, 3) // desde incluido, hasta excluido
    Arrays.equals(a, b)       // mismos valores en el mismo orden
    int copia[] = t;          // comparte la tabla; no copia sus valores
    t = insertarNoOrdenada(t, 9); // guardar la tabla devuelta
    Máximo, mínimo y media necesitan una tabla con elementos.

    CADENAS (TEMA 6; también podemos utilizar tablas)
    String frase = "Hola mundo";
    frase.length()             // 10; lleva paréntesis
    frase.charAt(0)            // 'H'; último índice: length() - 1
    frase.substring(0, 4)      // "Hola"; 4 no se incluye
    frase.indexOf("mundo")     // 5; -1 si no aparece
    frase.equals(otra)         // compara contenido; no usar ==
    frase.equalsIgnoreCase(otra) // ignora mayúsculas
    frase.compareTo(otra)      // negativo: antes, 0: iguales, positivo: después
    frase = frase.toLowerCase();
    frase = frase.toUpperCase();
    frase = frase.replace("Hola", "Adiós");
    String palabras[] = frase.split(" "); // un espacio como separador
    char letras[] = frase.toCharArray();
    String copia = String.valueOf(letras);
    Los métodos devuelven otra cadena: hay que guardar el resultado.

    ENTRADA CON SCANNER
    sc.next()                  // una palabra
    sc.nextLine()              // línea completa, incluidos espacios
    sc.nextInt()               // un entero; deja pendiente el salto de línea
    sc.nextLine();             // consumir ese salto antes de leer una frase
    Compartir el Scanner que recibe la función para las opciones nuevas.
    */

// FIN AÑADIDO: funciones y ejercicios
}//cierre del todo 










