package javaapplication2;
import java.util.Scanner;
import java.util.Locale;
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
        int numero;
        Scanner miScanner = new Scanner(System.in);
        
        System.out.println("Dime tu edad:"); 
        
        numero = miScanner.nextInt();
        
       numero++;
        System.out.println("El año que viene tendras " + numero + "años");
   
    }
    
}
