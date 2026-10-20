package conceptos.basicos.Ejercicios;
import java.util.*;
/**
 *
 * @author Guille
 */
public class MultiplosDe7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numero, resultado;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero entero");
        numero = sc.nextInt();
       
        resultado = (7 - numero % 7 ) % 7 ;
        
        System.out.println(resultado);
    }
    
}
