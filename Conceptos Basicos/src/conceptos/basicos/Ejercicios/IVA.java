/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conceptos.basicos.Ejercicios;
import java.util.*;
/**
 *
 * @author Guille
 */
public class IVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base, iva, importe_iva, total;
        Scanner sc = new Scanner(System.in);
          
        System.out.println("Cual es la base imponible ? ");
                    base = sc.nextDouble();
        System.out.println("Cual es el porcentaje de IVA que se aplica ? ");
                    iva = sc.nextDouble();
        importe_iva = (base * iva ) / 100;
        total = importe_iva + base;
        System.out.println("El importe del IVA es: " + importe_iva);
        System.out.println("Y el importe total es: " +  total );
    }
    
}
