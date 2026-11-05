
package Tablas;

import java.util.Arrays;

/**
 *
 * @author Alumno
 */
public class Ej {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int max, indice, pos;
        
        int datos[] = {10,1,5,8,9,2,};
        Arrays.sort(datos);
        System.out.println(Arrays.toString(datos));
        //esto de antes creo que lo ordena
        
        pos = Arrays.binarySearch(datos,5);  //Esto funciona por que ya esta ordenado
        System.out.println("Esta en la posicion: " + pos);
        System.out.println("Las posiciones se leen ");
        System.out.println("[0, 1, 2, 3, 4, 5]");
        
    }
    
}
