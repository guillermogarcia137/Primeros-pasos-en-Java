/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tablas;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Tablas3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int cantidad;
        System.out.println("Cuantos numeros vas a dar? ");
        cantidad = sc.nextInt();
        
        int enteros[] = new int[cantidad];
        
        System.out.println("Introduce los numeros: ");
        for (int i = 0; i < enteros.length; i++) {
            enteros[i] = sc.nextInt();
            
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(enteros[i]);
        }
        
    }
    
}
