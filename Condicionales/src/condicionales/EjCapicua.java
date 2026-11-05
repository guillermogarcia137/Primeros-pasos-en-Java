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
public class EjCapicua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entre 0 y 9999");
        int numero = sc.nextInt();

        if (numero < 0 || numero > 9999) {
            System.out.println("El numero esta fuera del rango");
            return;
        }

        int dig1 = numero / 1000;
        int dig2 = (numero / 100) % 10;
        int dig3 = (numero / 10) % 10;
        int dig4 = numero % 10;

        boolean capicua;
        if (numero < 10) {
            capicua = true;
        } else if (numero < 100) {
            capicua = dig3 == dig4;
        } else if (numero < 1000) {
            capicua = dig2 == dig4;
        } else {
            capicua = dig1 == dig4 && dig2 == dig3;
        }

        if (capicua) {
            System.out.println("Es capicúa");
        } else {
            System.out.println("No es capicúa");
        }
    }
    
}
