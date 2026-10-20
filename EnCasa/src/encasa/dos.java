package encasa;
import java.util.*;
public class dos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero inicial: ");
        int inicial = sc.nextInt();

        System.out.println("Numero final: ");
        int fin = sc.nextInt();

        System.out.println("Intervalo de salto: ");
        int salto = sc.nextInt();

        // Chequeo de valores negativos
        if (inicial < 0 || fin < 0 || salto < 0) {
            System.out.println("Error: no se permiten numeros negativos.");
        } else if (salto == 0) {
            System.out.println("Error: el intervalo de salto no puede ser 0.");
        } else if (inicial > fin) {
            System.out.println("Error: el numero inicial debe ser menor o igual que el final.");
        } else {
            System.out.println("Secuencia:");
            for (int i = inicial; i <= fin; i += salto) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
