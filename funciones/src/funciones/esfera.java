package funciones;
import java.util.*;
public class esfera {

    public static void main(String[] args) {
        // Vamos a calcula la superficie y el volumen de una esfera
        double radio;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Cual es el radio ? ");
        radio = sc.nextDouble();
        superficieVolumenEsfera(radio);
        
    }
    static void superficieVolumenEsfera (double radio) {
        final double pi = Math.PI;  //guardamos pi para mas comodidad 
        double superficie = 4*pi*Math.pow(radio, 2);  //esto es 4 por pi por radio elevado a dos 
        double volumen = 4*pi/3*Math.pow(radio,3);
        System.out.printf("La superficie es : %.2f y el volumen: %.2f\n", superficie, volumen); //esto es para imprimir solo dos decimales
                      //¡IMPORTANTE es printf
    }

    
    
}
