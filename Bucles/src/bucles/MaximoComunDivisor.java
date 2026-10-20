
package bucles;

import java.util.Scanner;

public class MaximoComunDivisor {

    public static void main(String[] args) {
        // TODO code application logic here
        int menor, numA, numB;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime el numero A: ");
        numA = sc.nextInt();
        System.out.println("Dime el numero B: ");
        numB = sc.nextInt();

        
        if (numA < numB) menor = numA;
        else menor = numB;

        for (int i = menor; i > 0; i--) {
            if (numA % i == 0 && numB % i == 0) {
                System.out.println("El maximo comun divisor es: " + i);
                break;
            }
        }

    }
    
}
