package bucles;
import java.util.Scanner;
public class RaizCuadrada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero, contador = 0, cuadrado, resto, raiz;
        
        System.out.println("Dime un numero");
        numero = sc.nextInt();
        do {
            contador++;
            cuadrado = contador * contador;
        } while (cuadrado <= numero);
        raiz = contador - 1;
        resto = numero - raiz * raiz;

        System.out.println("La raiz cuadrada es " + raiz + " y el resto " + resto);
    }
       
}
