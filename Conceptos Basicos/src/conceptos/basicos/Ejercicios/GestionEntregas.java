package conceptos.basicos.Ejercicios;
import java.util.*;
public class GestionEntregas {
    public static void main(String[] args) {
        // TODO code application logic here
        int EntradasNiño, EntradasAdulto;
        final double PrecioNiño = 15.50 , PrecioAdulto = 20;
        double total, descuento, resultado;
         
        Scanner sc = new Scanner(System.in);
                          
        System.out.println("Cuantas entradas de infantiles quieres ? ");
        EntradasNiño = sc.nextInt();
        System.out.println("Cuantas entradas de adulto quieres ? ");
        EntradasAdulto = sc.nextInt();
        
        total = (EntradasNiño * PrecioNiño + EntradasAdulto * PrecioAdulto);
        
        descuento = ( total * 5 ) / 100;
        resultado = total >= 100 ? total - descuento : total;
                
        System.out.println("El precio es " + total + " se te ha aplicado un descuento de " + descuento + " y se te queda en " + resultado);
        
    }
    
}
