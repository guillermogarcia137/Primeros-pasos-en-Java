package cadenas;
import java.util.*;

public class Ahorcado {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ahorcado();
    }
    public static void ahorcado(){
        Scanner sc = new Scanner(System.in);
        String palabra, letra;
        int longitud;
        int intentos = 7;
        
        System.out.println("Introduce una palabra: ");
        palabra = sc.next();
        longitud = palabra.length();//calcular longitud
        for (int i = 0; i < longitud; i++) {
            System.out.print("_ "); 
        }
        /*
        while ( ){}
        System.out.println("Dime una letra: ");
        letra = sc.next();
        for (int i = 0; i < longitud; i++) {
            if (palabra.charAt(i) == letra.charAt(0)) {
                System.out.print(letra + " ");
            }else{
                System.out.print("_ ");
            }
        }
*/
    }
}
