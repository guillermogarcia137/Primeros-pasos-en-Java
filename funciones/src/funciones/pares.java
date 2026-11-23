package funciones;
import java.util.*;
public class pares {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Cuantos numeros quieres mostrar ? ");
        Scanner sc = new Scanner(System.in);
        int numeros = sc.nextInt();
        muestraPares(numeros);
    }
    public static void muestraPares(int n){
        for (int i = 1; i <= n; i++) {
             System.out.println(i * 2);
        }     
    }
}
