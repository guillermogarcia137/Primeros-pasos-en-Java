/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicionales;

import java.util.Scanner;

/**
 *
 * @author Guille
 */
public class ejConvNumLetras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUsuario;
        String textoNumero;

        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entre 1 y 99");
        numeroUsuario = sc.nextInt();
    
        textoNumero = switch (numeroUsuario) {
            case 1 -> "uno";
            case 2 -> "dos";
            case 3 -> "tres";
            case 4 -> "cuatro";
            case 5 -> "cinco";
            case 10 -> "diez";
            case 50 -> "cicuenta";
            case 80 -> "ochenta";
            case 99 -> "noventa y nueve";
            default -> "Ese numero esta fuera del rango";
                
        };
        System.out.println(textoNumero);
    }
    
}
