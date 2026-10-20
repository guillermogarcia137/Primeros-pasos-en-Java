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
public class ejDni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int codigo, numero;
        char letra;
          Scanner sc = new Scanner(System.in); 
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
    
}
