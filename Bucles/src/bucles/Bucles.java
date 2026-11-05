/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

/**
 *
 * @author Guille
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // String = texto. Guardamos "856" entre comillas dobles.
        // Aunque parezca un número, aquí es texto (una cadena de caracteres).
        String numero = "856";

        // char = UN solo carácter (se escribe entre comillas simples).
        // charAt(n) devuelve el carácter que está en la posición n.
        // Las posiciones empiezan en 0, no en 1.
        char dig1 = numero.charAt(0); // posición 0 -> '8' (el primero)
        char dig2 = numero.charAt(1); // posición 1 -> '5' (el segundo)
        char dig3 = numero.charAt(2); // posición 2 -> '6' (el tercero)

        // length() devuelve cuántos caracteres tiene el texto.
        // "856" tiene 3 caracteres, así que imprime 3.
        // El + une (concatena) el texto con el valor.
        System.out.println("Longitud: " + numero.length());

        // Mostramos cada dígito que guardamos antes en las variables char.
        System.out.println("Dígito 1: " + dig1); // imprime 8
        System.out.println("Dígito 2: " + dig2); // imprime 5
        System.out.println("Dígito 3: " + dig3); // imprime 6

        // Ahora hacemos lo mismo con un bucle for.
        // Así no hace falta escribir una línea por cada dígito.
        //
        // int i = 0            -> empezamos con i en 0 (la primera posición)
        // i < numero.length()  -> repetimos mientras i sea menor que 3
        // i++                  -> al final de cada vuelta, sumamos 1 a i
        for (int i = 0; i < numero.length(); i++) {

            // En cada vuelta i vale 0, luego 1, luego 2.
            // charAt(i) coge el carácter de la posición i.
            // Cuando i llega a 3 la condición falla y el bucle termina,
            // por eso nunca se sale de los límites del texto.
            System.out.println("Posición " + i + ": " + numero.charAt(i));
        }


    }
    
}
