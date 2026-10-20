
package encasa;
import java.util.*;
public class uno {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double numero = 0, max = 0, min = 999, media = 0,contador =0,suma = 0;
        System.out.println("Dime un numero (finalizar con -01) ");
        numero = sc.nextDouble();
        
        while ( numero != -01 ) {
            if (numero > max ) max = numero;
            if (numero < min ) min = numero;
            suma += numero;
            contador++;
            System.out.println("Siguiente numero: ");
            numero = sc.nextDouble();
            media = suma/contador;

        }
        System.out.println("El numero max es "+ max + " el min es " 
                + min + " y la media es " + media);
    }
    
}
