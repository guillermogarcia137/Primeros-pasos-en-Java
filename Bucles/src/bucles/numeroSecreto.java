/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;

import java.util.Scanner;

/**
 *
 * @author Guille
 */
public class numeroSecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int numRandom = (int) (Math.random() * 100 + 1); //numero aletorio entre 1 y 100
       Scanner sc = new Scanner(System.in);
       System.out.println("Dime un numero entre 1 y 100");
       int numero = sc.nextInt();
       
       while (numero != numRandom && numero != -1) {//inicio bucle
           if (numero > numRandom)
               System.out.println("El numero es menor, vuelve a probar");
           else
               System.out.println("El numero es mayor, vuelve a probar");
           numero = sc.nextInt();
       }
       if (numero == numRandom) {
           System.out.println("¡HAS ACERTADO!");
       }else{
           System.out.println("Que poca paciencia");
       }
    }
    
}
