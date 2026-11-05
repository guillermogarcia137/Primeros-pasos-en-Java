package bucles;
import java.util.*;
public class DecimalBinario {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero, convertir, binario= 0, decimal = 0, digito, posicion = 0, resto;
        System.out.println("Que quieres convertir a (1)Decimal>Binario o (2)Binario>Decilmal (Pulsa 1 o 2)");
        convertir = sc.nextInt();
        
        if (convertir == 1) {
            System.out.println("Dime el numero decimal que quieres convertir");
            decimal = sc.nextInt();
            while(decimal > 0){
                resto = decimal % 2;
                decimal = decimal / 2;
                System.out.println(resto);
            }
        } else if (convertir == 2) {
            System.out.println("Dime el numero binario que quieres convertir");
            numero = sc.nextInt();
            while (numero > 0) {
                digito = numero % 10;
                decimal = decimal + digito * (int) Math.pow(2, posicion);
                numero = numero / 10;
                posicion++;
            }
            System.out.println("El numero en decimal es: " + decimal);
        } else {
            System.out.println("ERROR, introduce 1 o 2");
        }
    }
    
}
