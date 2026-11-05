/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funciones;

import java.util.Scanner;

/**
 *
 * @author Guille
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        int dias, horas, minutos;
        System.out.println("Dime los dias: ");
        dias = sc.nextInt();
        System.out.println("Dime las horas: ");
        horas = sc.nextInt();
        System.out.println("Dime los minutos: ");
        minutos = sc.nextInt();
        System.out.println("El total es "+ segundos(dias,horas,minutos)+ " segundos");
        
    }
    static int segundos(int dias,int horas,int minutos){
        int s = dias*24*3600+horas*3600+minutos*60;
        return s;
    
    }
    
}
