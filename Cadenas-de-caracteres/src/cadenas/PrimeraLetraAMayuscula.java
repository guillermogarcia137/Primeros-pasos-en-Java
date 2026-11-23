/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cadenas;

/**
 *
 * @author Alumno
 */
public class PrimeraLetraAMayuscula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String palabra = "hola";

        palabra = Character.toUpperCase(palabra.charAt(0)) + palabra.substring(1);

        System.out.println(palabra); // Hola
    }
    
}
