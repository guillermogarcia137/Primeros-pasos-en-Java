package Tablas;
import java.util.*;

public class Tablas2 {

    public static void main(String[] args) {
        // TODO code application logic 
        Scanner sc = new Scanner(System.in);
        /*
        double num1, num2, num3, num4, num5;
        
        System.out.println("Dime los 5 numeros decimales: ");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        num3 = sc.nextDouble();
        num4 = sc.nextDouble();
        num5 = sc.nextDouble();
        
        System.out.println(num1 + num2 + num3+ num4+ num5+);
        */   
                //para evitar hacer esto se usan las tablas 
        double numeros[] = new double[5];
        System.out.println("Introduce los 5 numeros decimales: ");
        for (int i = 0; i < 5; i++) {
            numeros[i] = sc.nextDouble();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Numeros "+ (i+1)+" : " + numeros[i]);
        }
        

        
    }
    
}
