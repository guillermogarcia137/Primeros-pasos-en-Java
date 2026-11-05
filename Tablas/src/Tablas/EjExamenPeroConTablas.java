
package Tablas;
import java.util.Scanner;
public class EjExamenPeroConTablas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad[] = null, estudiantes;
        String nombre[] = null, ciudad[];
        System.out.println("Cuantos estudiantes quieres ");
        estudiantes = sc.nextInt();
        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Dime su edad: ");
            edad[i] = sc.nextInt();
            System.out.println("Dime su nombre: ");
            nombre[i] = sc.next();
            System.out.println("Dime su ciudad: ");
            
        }
    }
    
}
