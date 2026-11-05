/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptos.basicos.Ejercicios;

import java.util.Scanner;

/**
 *
 * @author Guille
 */
public class RecuentoDePatas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hormigas, arañas, cochinillas,total;
        final int NuPatasHormigas = 6, NuPatasArañas = 8, NuPatasCochinillas = 14;
                
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Vamos a ver cuantas patas hay en total");
        System.out.println("Cuantas hormigas has capturado ? ");
        hormigas = sc.nextInt();
        System.out.println("Cuantas arañas has capturado ? ");
        arañas = sc.nextInt();
        System.out.println("Cuantas cochinillas has capturado ? ");
        cochinillas = sc.nextInt();
        
        total = (hormigas * NuPatasHormigas + arañas * NuPatasArañas + cochinillas * NuPatasCochinillas);
        
        System.out.println("En total hay: " + total + " patas");
    }
    
}
