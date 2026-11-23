package Tablas;
import java.util.*;
public class CamaraSecreta {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int rd = (int) Math.random()*10;
        int longCombinacion;
        int combinacion[];
        
        System.out.println("Dime la longitud de la combinacion (digitos 1-5):  ");
        longCombinacion = sc.nextInt();
        
        combinacion = new int[longCombinacion];
        
        System.out.println("Combinacion creada, tienes que adivinar");
        /*
        for (int i = 0; i < combinacion.length; i++) { //hasta donde queremos que llegue la i, hasta la logitud de la combinacion, por eso lo de combinacion.length
            combinacion[i] = rd.nextInt(10);        
        }
*/
    }
    
}
