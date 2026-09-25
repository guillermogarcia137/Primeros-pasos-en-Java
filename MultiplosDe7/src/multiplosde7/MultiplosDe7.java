
package multiplosde7;
import java.util.*;
public class MultiplosDe7 {

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

       
