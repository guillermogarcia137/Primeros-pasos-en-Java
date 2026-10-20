/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptos.basicos;
import java.util.Scanner;
/**
 *
 * @author Guille
 */
public class Operadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 3, b = 6;
            System.out.println(a==b);
                System.out.println(a>b);
                    System.out.println(a<=b);
                    
                   if (a<=b) {
                       System.out.println("Si");
                   }else{
                        System.out.println("ni");
        }
                   int numero1, numero2;
         Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Dime un numero:"); 
        
        numero1 = miScanner.nextInt();        
       
        System.out.println("dime otro numero:");
        numero2 = miScanner.nextInt();
        
        if (numero1 == numero2 ) {
                System.out.println("Los numeros son el mismo numero");
        }else{
                System.out.println("Los numeros son distintos");
        }
    }
    
}
