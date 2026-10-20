
package bucles;
import java.util.Scanner;

public class Piramide {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("De cuanto quieres que sea la piramide ?");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            // Espacios para centrar
            for (int j = 1; j <= numero - i; j++) {
                System.out.print(" ");
            }
            // Asteriscos separados por espacio
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
    
}
