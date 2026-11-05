package bucles;

import java.util.Scanner;

public class Edad {

    public static void main(String[] args) {
        // TODO code application logic here
        int edad = 0, max = 99, min = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime la edad de los alumnos (finalizar con -1)");
        edad = sc.nextInt();

        while (edad != -1){
            if (edad < min) min = edad;
            if (edad > max) max = edad;
            System.out.println("Siguiente edad: ");
            edad = sc.nextInt();
        }
        System.out.println("Edad maxima: " + max);
        System.out.println("Edad minima: " + min);
    }
    
}
