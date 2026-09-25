package MayorDeEdad;
import java.util.Scanner;

public class MayorDeEdad {

    public static void main(String[] args) {
        // TODO code application logic here
        int edad;
        
        Scanner sc = new Scanner(System.in);
         
        String mayorEdad;
        
        System.out.println("Dime tu edad");
        
        edad = sc.nextInt();
        
        mayorEdad = edad >= 18 ? "Si" : "No";
            System.out.println("Es mayor de edad?: "+ mayorEdad);
        
    }
    
}
