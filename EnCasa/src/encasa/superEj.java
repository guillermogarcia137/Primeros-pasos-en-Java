package encasa;
import java.util.Scanner;
public class superEj {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
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

        opcion = sc.nextInt();
        
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
        //----------------------------------------------------------------
                }
        
            }//cierra case 11
            case 12 -> {
                System.out.println("12");
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
            }
            default -> System.out.println("ERROR, introduce un numero dentro del rango");

        }//cierra switch
    }
}









