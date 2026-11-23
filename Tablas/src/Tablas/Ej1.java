package Tablas;
import java.util.*;
public class Ej1 {

    public static void main(String[] args) {
        // TODO code application logic here
        //Scanner sc = new Scanner(System.in);
        int datos[] = {5,2,1,6,8,7};
        System.out.println(Arrays.toString(datos));
        desordenar(datos);
        System.out.println(Arrays.toString(datos));


        
    }
    //definimos funciones
    static void desordenar(int t[]) {
        int aux;
        int indice1 = (int) (Math.random() * t.length + 0);
        int indice2 = (int) (Math.random() * t.length + 0);
        if (indice1 == indice2 && indice1>0){
        
        }
        System.out.println("Intercambiamos los indices " + indice1 + " y " + indice2);
        aux = t[indice1];
        t[indice1] = t[indice2];
        t[indice2] = aux;
        
    }
    
}
